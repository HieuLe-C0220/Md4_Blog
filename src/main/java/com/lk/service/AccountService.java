package com.lk.service;

import com.lk.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account findOne(Long id);
    Account save(Account account);
    Account delete(Long id);
}
