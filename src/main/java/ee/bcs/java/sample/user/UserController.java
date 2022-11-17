package ee.bcs.java.sample.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // http://localhost:8091/api/public/createUser?userName=siim&password=siim
    @GetMapping("api/public/createUser")
    public void createUser(String userName, String password) {
        // TODO service, repository, and save username and password
        userService.saveUser(userName, password);
    }

    // http://localhost:8091/api/public/login?userName=siim&password=siim
    @GetMapping("api/public/login")
    public String login(String userName, String password) {
        return userService.login(userName, password);
    }

    @GetMapping("test")
    public String test(){
        return "Hello World";
    }
}
