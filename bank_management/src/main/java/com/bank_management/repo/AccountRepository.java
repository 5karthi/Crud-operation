package com.bank_management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank_management.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
