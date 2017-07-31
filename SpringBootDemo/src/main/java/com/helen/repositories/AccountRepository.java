package com.helen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helen.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
