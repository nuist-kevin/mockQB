package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.qb.persist.domain.cb.qb.QBCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QBCustomerJpaRepository extends JpaRepository<QBCustomer, Integer> {

  QBCustomer findByListId(String listId);
}
