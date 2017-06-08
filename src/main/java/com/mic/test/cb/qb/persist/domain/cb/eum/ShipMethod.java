package com.mic.test.cb.qb.persist.domain.cb.eum;

public enum ShipMethod {

  Assigned_By_Warehouse("Assigned by Warehouse", 6, 13),
  UPS_Ground("UPS Ground", 1, 1),
  UPS_3_Day("UPS 3 Day", 1, 2),
  UPS_2nd_Day("UPS 2nd Day", 1, 3),
  UPS_Next_Day("UPS Next Day", 1, 4),
  FedEx_Ground("FedEx Ground", 2, 5),
  FedEx_Express("FedEx Express", 2, 6),
  FedEx_2_Day("FedEx 2 Day", 2, 7),
  FedEx_Overnight("FedEx Overnight", 2, 8),
  USPS_Standard_Post("USPS Standard Post", 3, 9),
  USPS_First_Class("USPS First Class", 3, 10),
  USPS_Priority_Mail("USPS Priority Mail", 3, 11),
  USPS_Priority_Mail_Express("USPS Priority Mail Express", 3, 12),
  USPS_Priority_Mail_Intl("USPS Priority Mail Intl", 3, 13),
  Trucking("Trucking", 4, 0),
  Will_Call("Will Call", 5, 24),
  Customer_Routing("Customer Routing", 5, 25);

  ShipMethod(String name, Integer carrier, Integer carrier_service) {
    this.name = name;
    this.carrier = carrier;
    this.carrier_service = carrier_service;
  }

  private String name;

  private Integer carrier;

  private Integer carrier_service;

  public Integer getCarrier() {
    return carrier;
  }

  public void setCarrier(Integer carrier) {
    this.carrier = carrier;
  }

  public Integer getCarrier_service() {
    return carrier_service;
  }

  public void setCarrier_service(Integer carrier_service) {
    this.carrier_service = carrier_service;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
