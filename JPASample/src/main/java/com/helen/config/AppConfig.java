package com.helen.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.helen")
@PropertySource("classpath:prod.properties")
@EnableTransactionManagement
public class AppConfig {
	@Autowired
	private Environment env;

	// if @ActiveProfiles("prod"), it connect mysql database, specified in the application file.
	@Bean
	public DataSource dataSourceForProd() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driver"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.user"));
		dataSource.setPassword(env.getProperty("db.pass"));
		return dataSource;
	}
	
	@Bean
	public PlatformTransactionManager transactionManagerForProd() {
		return new DataSourceTransactionManager(dataSourceForProd());
	}
}
