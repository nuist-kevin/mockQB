package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.qb.persist.domain.cb.qb.QBItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QBItemJpaRepository extends JpaRepository<QBItem, Integer> {

  QBItem findByQbItemId(String qbItemId);
}
