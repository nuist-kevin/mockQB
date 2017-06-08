package com.mic.test.cb.qb.persist.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by caiwen on 2017/6/6.
 */
@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(
    basePackages = {"com.mic.test.cb.qb.persist.dao.cb"},
    entityManagerFactoryRef = "cbEntityManagerFactory")
public class CbJpaConfig {

  @Bean
  public DataSource cbDataSource() {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setUrl("jdbc:oracle:thin:@192.168.17.104:1521:cbdev");
    dataSource.setUsername("cb");
    dataSource.setPassword("cb1234");
    return dataSource;
  }

  @Bean
  public JpaVendorAdapter cbJpaVendorAdapter() {
    HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
    adapter.setDatabase(Database.ORACLE);
    adapter.setGenerateDdl(false);
    adapter.setShowSql(true);
    adapter.setPrepareConnection(false);
    adapter.setDatabasePlatform("org.hibernate.dialect.Oracle10gDialect");
    return adapter;
  }

  @Bean
  public LocalContainerEntityManagerFactoryBean cbEntityManagerFactory(DataSource cbDataSource,
      JpaVendorAdapter cbJpaVendorAdapter) {
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean =
        new LocalContainerEntityManagerFactoryBean();
    localContainerEntityManagerFactoryBean.setDataSource(cbDataSource);
    localContainerEntityManagerFactoryBean.setJpaVendorAdapter(cbJpaVendorAdapter);
    localContainerEntityManagerFactoryBean
        .setPackagesToScan("com.mic.test.cb.qb.persist.domain.cb");
    return localContainerEntityManagerFactoryBean;
  }
}
