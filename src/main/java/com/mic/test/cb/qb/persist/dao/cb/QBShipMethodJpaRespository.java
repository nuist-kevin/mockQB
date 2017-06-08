package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.qb.persist.domain.cb.QBShipMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QBShipMethodJpaRespository extends JpaRepository<QBShipMethod, Integer> {

}
