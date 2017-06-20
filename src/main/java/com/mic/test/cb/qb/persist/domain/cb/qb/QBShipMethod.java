package com.mic.test.cb.qb.persist.domain.cb.qb;

import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import javax.persistence.*;

@Entity
@Table(name = "wms_qb_ship_method")
public class QBShipMethod extends BaseDomain {

  private Integer id;

  private String listId;

  private String editSequence;

  private String name;

  private String carrier;

  private String carrierService;

  @Id
  @Column(name = "wms_qb_ship_method_id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_wms_qb_ship_method")
  @SequenceGenerator(name = "s_wms_qb_ship_method", sequenceName = "s_wms_qb_ship_method")
  public Integer getId() {
    return id;
  }

  @Column(name = "LIST_ID")
  public String getListId() {
    return listId;
  }

  @Column(name = "edit_sequence")
  public String getEditSequence() {
    return editSequence;
  }

  public String getName() {
    return name;
  }

  public String getCarrier() {
    return carrier;
  }

  @Column(name = "carrier_service")
  public String getCarrierService() {
    return carrierService;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public void setEditSequence(String editSequence) {
    this.editSequence = editSequence;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public void setCarrierService(String carrierService) {
    this.carrierService = carrierService;
  }
}
