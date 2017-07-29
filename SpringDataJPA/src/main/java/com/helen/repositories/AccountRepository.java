package com.helen.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helen.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	List<Account> findAccountsByBalanceGreaterThanEqual(BigDecimal amount);
}
