package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.qb.persist.domain.cb.QBItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QBItemJpaRepository extends JpaRepository<QBItem, Integer> {

}