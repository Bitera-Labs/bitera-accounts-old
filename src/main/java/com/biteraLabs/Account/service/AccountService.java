package com.biteraLabs.Account.service;

import com.biteraLabs.Account.entity.Account;
import com.biteraLabs.Account.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        log.info(" save Account of acc service");
        return accountRepository.save(account);
    }

    public Account listAccount(Long accountId) {
        log.info(" deleting Account on Service");
        return accountRepository.findByAccountId(accountId);
    }
}
