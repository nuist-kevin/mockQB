package com.mic.test.cb.qb.persist.dao;

import com.mic.test.cb.qb.persist.domain.QBWCTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by caiwen on 2017/6/1.
 */
@Repository
public interface QBWCTaskDao extends JpaRepository<QBWCTask, Integer> {


}
