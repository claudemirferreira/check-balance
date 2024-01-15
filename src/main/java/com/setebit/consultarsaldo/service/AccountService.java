package com.setebit.consultarsaldo.service;

import com.setebit.consultarsaldo.dto.TransferDTO;
import com.setebit.consultarsaldo.exception.NotFoundException;
import com.setebit.consultarsaldo.model.Account;
import com.setebit.consultarsaldo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public boolean transfer(TransferDTO transferDTO){
        if(consultarSaldo( Double.valueOf( transferDTO.getValorSolicitado()),
                transferDTO.getAccountOrigem())){
            transferBalance(transferDTO);
            return true;
        }
        return false;
    }

    public void transferBalance(TransferDTO transferDTO){

    }

    public boolean consultarSaldo(Double valorSolicitado, Long number){
        Account account = findById(number);
        return checkSaldo( valorSolicitado, account);
    }

    public boolean checkSaldo(Double valorSolicitado, Account account) {
        return account.getBalance() >= valorSolicitado;
    }

    public Account findById(Long number) {
        return accountRepository.findById(number)
                .orElseThrow(() ->
                        new NotFoundException("conta não existe: number  " + number));
    }

}
