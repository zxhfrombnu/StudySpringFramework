package com.helen.repositories;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.number.BigDecimalCloseTo.closeTo;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.helen.config.AppConfig;
import com.helen.entities.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class JpaAccountRepositoryTest {
	@Autowired
	private AccountRepository repository;
	
	@Test
	public void testGetAccounts() throws Exception {
		List<Account> accounts = repository.getAccounts();
		assertThat(accounts.size(), is(3));
	}
	
	@Test
	public void testGetAccount() throws Exception {
		Account account = repository.getAccount(1L);
		assertThat(account.getId(), is(1L));
		assertThat(new BigDecimal("100.0"), 
				is(closeTo(account.getBalance(), new BigDecimal("0.01"))));
	}

	@Test
	public void testGetNumberOfAccounts() throws Exception {
		assertThat(repository.getNumberOfAccounts(), is(3));
	}
	
	@Test
	public void testCreateAccount() throws Exception {
		Long id = repository.createAccount(new BigDecimal("250.00"));
		assertThat(id, is(notNullValue()));
		
		Account account = repository.getAccount(id);
		assertThat(account.getId(), is(id));
		assertThat(account.getBalance(), is(closeTo(new BigDecimal("250.0"),
				new BigDecimal("0.01"))));
	}
	
	@Test
	public void testUpdateAccount() throws Exception {
		Account account = repository.getAccount(1L);
		BigDecimal current = account.getBalance();
		BigDecimal amount = new BigDecimal("50.0");
		account.setBalance(current.add(amount));
		
		Account again = repository.getAccount(1L);
		assertThat(again.getBalance(), is(closeTo(current.add(amount), 
				new BigDecimal("0.01"))));
	}

	@Test
	public void testDeleteAccount() throws Exception {
		for (Account account : repository.getAccounts()) {
			repository.deleteAccount(account.getId());
		}
		assertThat(repository.getNumberOfAccounts(), is(0));
	}
	
}
