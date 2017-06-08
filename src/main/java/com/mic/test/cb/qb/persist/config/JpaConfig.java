package com.mic.test.cb.qb.persist.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.sql.DataSource;
import javax.transaction.UserTransaction;

/**
 * Created by caiwen on 2017/6/2.
 */
@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(basePackages = {"com.mic.test.cb.qb.persist.dao.api"},
    entityManagerFactoryRef = "apiEntityManagerFactory")
public class JpaConfig {

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setGenerateDdl(false);
        adapter.setShowSql(true);
      adapter.setPrepareConnection(false);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
        return adapter;
    }

    @Bean
    public DataSource apiDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
      dataSource.setUrl("jdbc:mysql://192.168.28.192:3306/api");
        dataSource.setUsername("apiadmin");
        dataSource.setPassword("apiadmin");
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean apiEntityManagerFactory(DataSource apiDataSource,
        JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean =
                new LocalContainerEntityManagerFactoryBean();
      localContainerEntityManagerFactoryBean.setDataSource(apiDataSource);
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
      localContainerEntityManagerFactoryBean
          .setPackagesToScan("com.mic.test.cb.qb.persist.domain.api");
        return localContainerEntityManagerFactoryBean;
    }

}
