package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.qb.persist.domain.cb.qb.QBVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QBVendorJpaRepository extends JpaRepository<QBVendor, Integer> {

  QBVendor findByQbVendorId(String qbVendorId);
}
