package com.setebit.consultarsaldo.service;

import com.setebit.consultarsaldo.model.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountServiceTest {

    @Autowired
    AccountService accountService;

    @Test
    void have_balance() {
        Double valorSolicitado = Double.valueOf(1000);

        Account account = new Account();
        account.setNumber(1L);
        account.setBalance(Double.valueOf(1000));

        Assertions.assertTrue(accountService.checkSaldo(valorSolicitado, account));
    }

    @Test
    void no_have_balance() {
        Double valorSolicitado = Double.valueOf(1001);

        Account account = new Account();
        account.setNumber(1L);
        account.setBalance(Double.valueOf(1000));


        Assertions.assertFalse(accountService.checkSaldo(valorSolicitado, account));
    }

}
