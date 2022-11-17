package ee.bcs.java.sample.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void saveUser(String userName, String password) {
        String sql = "INSERT INTO \"user\" (user_name, password) VALUES (:userName, :password)";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userName", userName);
        paramMap.put("password", password);
        jdbcTemplate.update(sql, paramMap);
    }

    public String getUserPassword(String userName) {
        String sql = "SELECT password FROM \"user\" WHERE user_name = :userName";
        Map paramMap = new HashMap();
        paramMap.put("userName", userName);
        return jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }
}
