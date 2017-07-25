package io.egen.rs.movieflix.rs;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
//@PropertySource(value = "classpath:application.properties") 
public class JPAConfig {

//	@Autowired
//	private Environment env; 
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		//emf.setPackagesToScan("\"com.test.sms\"/>");
		emf.setPackagesToScan("io.egen.rs.movieflix.rs.entity");
		JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		emf.setJpaVendorAdapter(adapter);
		emf.setJpaProperties(properties());
		return emf;
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/movieflix-db");
		ds.setUsername("radhikasondankar");
		ds.setPassword("Radhi.123");
//		
//		ds.setDriverClassName("com.mysql.jdbc.Driver");
//		ds.setUrl(env.getProperty("db.url"));
//		ds.setUsername(env.getProperty("db.user"));
//		ds.setPassword(env.getProperty("db.password"));

		return ds;
	}
	
	@Bean
	public PlatformTransactionManager txnManager(EntityManagerFactory emf) {
		JpaTransactionManager txnMgr = new JpaTransactionManager(emf);
		return txnMgr;
	}
	
	
	public Properties properties() {
		Properties props = new Properties();
		
//		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
//		prop.setProperty("hibernate.hbm2ddl.auto", "create");
//		prop.setProperty("hibernate.show_sql", "true");
//		prop.setProperty("hibernate.format_sql", "true");
		
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		props.put("hibernate.hbm2ddl.auto","create");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.format_sql", "true");
		
		return props;

	}
}

