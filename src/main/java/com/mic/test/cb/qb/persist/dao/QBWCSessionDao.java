package com.mic.test.cb.qb.persist.dao;

import com.mic.test.cb.qb.persist.domain.QBWCSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by caiwen on 2017/6/1.
 */

@Repository
public interface QBWCSessionDao extends JpaRepository<QBWCSession, Integer> {


}
