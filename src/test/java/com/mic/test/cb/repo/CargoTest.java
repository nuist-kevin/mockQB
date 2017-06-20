package com.mic.test.cb.repo;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.persist.dao.cb.cargo.CargoJpaRepository;
import com.mic.test.cb.qb.persist.dao.cb.cargo.CargoPkgUnitJpaRepository;
import com.mic.test.cb.qb.persist.dao.cb.cargo.CargoSnapJpaRepository;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargo.Cargo;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargo.CargoPkgUnit;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargo.CargoSnap;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

public class CargoTest extends BaseTest {

  @Resource
  CargoJpaRepository cargoJpaRepository;
  @Resource
  CargoSnapJpaRepository cargoSnapJpaRepository;

  @Resource
  CargoPkgUnitJpaRepository cargoPkgUnitJpaRepository;

  @Test
  @Transactional
  public void test() {
    Cargo cargo = cargoJpaRepository.findOne(6872284);
    System.out.println(cargo.getCargoInfo().getCargoName());
    System.out.println(cargo.getCargoOwner().getComName());
    System.out.println(cargo.getDeleteInfo().getDeleteTime());
  }

  @Test
  @Transactional
  public void testCargoSnap() {
    CargoSnap snap = cargoSnapJpaRepository.findOne(49244);
    System.out.println(snap.getCargoInfo().getCargoName());
  }

  @Test
  @Transactional
  public void testCargoUnit() {
    CargoPkgUnit unit = cargoPkgUnitJpaRepository.findOne(6888474);
    System.out.println(unit.getCargo().getCargoInfo().getCargoCode());
  }
}

