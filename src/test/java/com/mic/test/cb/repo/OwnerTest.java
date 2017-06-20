package com.mic.test.cb.repo;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.persist.dao.cb.cargoOwner.CargoOwnerJpaRepository;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargoOwner.CargoOwner;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

public class OwnerTest extends BaseTest {

  @Resource
  CargoOwnerJpaRepository cargoOwnerJpaRepository;

  @Test
  @Transactional
  public void test() {
    CargoOwner cargoOwner = cargoOwnerJpaRepository.findOne(6024);
    System.out.println(cargoOwner.getComName());
  }

}
