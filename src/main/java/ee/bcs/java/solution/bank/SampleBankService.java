package ee.bcs.java.solution.bank;

import ee.bcs.java.repository.Account;
import ee.bcs.java.repository.AccountJpaRepository;
import ee.bcs.java.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SampleBankService {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


    public void createAccount(String accountNumber){
        // TODO
    }
    public Integer getAccountBalance(String accountNumber) {
        String sql = "SELECT balance FROM account WHERE account_number = :accountNumber";
        Map paramMap = new HashMap();
        paramMap.put("accountNumber", accountNumber);
        Integer balance = jdbcTemplate.queryForObject(sql, paramMap, Integer.class);
        return balance;
    }

}
