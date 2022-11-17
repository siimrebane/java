package ee.bcs.java.sample.user;

import ee.bcs.java.exception.ApplicationException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import liquibase.pro.packaged.D;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void saveUser(String userName, String password) {
        String encodedPassword = passwordEncoder.encode(password);
        userRepository.saveUser(userName, encodedPassword);
    }

    public String login(String userName, String password) {
        String encodedPassword = userRepository.getUserPassword(userName);
        if (passwordEncoder.matches(password, encodedPassword)) {
            JwtBuilder builder = Jwts.builder()
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secret")
                .claim("userName", userName);
            return builder.compact();
        }
        throw new ApplicationException("Vale parool");
    }
}
