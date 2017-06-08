package com.mic.test.cb.qb.persist.dao.api;

import com.mic.test.cb.qb.persist.domain.api.QBWCSession;
import com.mic.test.cb.qb.persist.domain.api.QBWCTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QBWCSessionJpaRepository extends JpaRepository<QBWCSession, Integer> {


  QBWCSession findByTicket(String ticket);

  QBWCSession findByTicketAndStatus(String ticket, Integer status);
}
