package com.biteraLabs.Account.Controller;

import com.biteraLabs.Account.entity.Account;
import com.biteraLabs.Account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/")
    public  Account createAccount(@RequestBody Account account){
        log.info("Saving Account on controller");
        return accountService.createAccount(account);
    }

    @GetMapping("/{id}")
    public Account findAccount(@PathVariable("id")  Long accountId){
        log.info("Search Account on controller");
        return accountService.listAccount(accountId);
    }

}
