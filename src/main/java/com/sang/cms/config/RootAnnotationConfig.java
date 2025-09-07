package com.sang.cms.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.sang.cms")
@PropertySource("classpath:application.properties")
public class RootAnnotationConfig {

	@Value("${jdbc.url}")
	private String dbUrl;
	
	@Value("${jdbc.username}")
	private String dbUserName;
	
	@Value("${jdbc.password}")
	private String dbPassword;
	
	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setUsername(dbUserName);
		source.setUrl(dbUrl);
		source.setPassword(dbPassword);
		source.setDriverClassName(driverClassName);
		return source;
	}	
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource datasource) {
		return new JdbcTemplate(datasource);
	}
	
}
