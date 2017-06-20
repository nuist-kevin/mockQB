package com.mic.test.cb.qb.persist.dao.cb.inventory;

import com.mic.test.cb.qb.persist.domain.cb.wms.inventory.InventoryCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryCountJpaRepository extends JpaRepository<InventoryCount, Integer> {

}
