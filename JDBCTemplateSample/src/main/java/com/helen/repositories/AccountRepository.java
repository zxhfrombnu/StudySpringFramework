package java.com.helen.repositories;

import java.com.helen.entities.Account;
import java.math.BigDecimal;
import java.util.List;

public interface AccountRepository {
	public List<Account> getAccounts();
	
	public Account getAccount(Long id);
	
	public int getNumberOfAccounts();
	
	public Long createAccount(BigDecimal initialBalance);
	
	public int deleteAccount(Long id);
	
	public void updateAccount(Account account);
}
