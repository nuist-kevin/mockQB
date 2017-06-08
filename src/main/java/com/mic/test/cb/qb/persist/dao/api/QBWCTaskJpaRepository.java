package com.mic.test.cb.qb.persist.dao.api;

import com.mic.test.cb.qb.persist.domain.api.QBWCTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QBWCTaskJpaRepository extends JpaRepository<QBWCTask, Integer> {

  List<QBWCTask> findAllByTicket(String ticket);

  List<QBWCTask> findAllByTicketAndStatus(String ticket, Integer status);

  List<QBWCTask> findByTicketAndStatusAndType(String ticket, Integer status, Integer type);
}
