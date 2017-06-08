package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.qb.persist.domain.cb.QBSalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QBSalesOrderJpaRepository extends JpaRepository<QBSalesOrder, Integer> {

}
