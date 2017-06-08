package com.mic.test.cb.qb.persist.domain.cb;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public class BaseDomain {

  private String addNo;
  private String addName;
  private Date addTime;
  private String updateNo;
  private String updateName;
  private Date updateTime;
  private String deleteNo;
  private String deleteName;
  private Date deleteTime;
  private Integer deleteFlag;
  private String operatorIp;

  @Column(name = "add_no")
  public String getAddNo() {
    return addNo;
  }

  @Column(name = "add_name")
  public String getAddName() {
    return addName;
  }

  @Column(name = "add_time")
  @Temporal(TemporalType.TIME)
  public Date getAddTime() {
    return addTime;
  }

  @Column(name = "update_no")
  public String getUpdateNo() {
    return updateNo;
  }

  @Column(name = "update_name")
  public String getUpdateName() {
    return updateName;
  }

  @Column(name = "update_time")
  @Temporal(TemporalType.TIME)
  public Date getUpdateTime() {
    return updateTime;
  }

  @Column(name = "delete_no")
  public String getDeleteNo() {
    return deleteNo;
  }

  @Column(name = "delete_name")
  public String getDeleteName() {
    return deleteName;
  }

  @Column(name = "delete_time")
  @Temporal(TemporalType.TIME)
  public Date getDeleteTime() {
    return deleteTime;
  }

  @Column(name = "delete_flag")
  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  @Column(name = "operator_ip")
  public String getOperatorIp() {
    return operatorIp;
  }

  public void setAddNo(String addNo) {
    this.addNo = addNo;
  }

  public void setAddName(String addName) {
    this.addName = addName;
  }

  public void setAddTime(Date addTime) {
    this.addTime = addTime;
  }

  public void setUpdateNo(String updateNo) {
    this.updateNo = updateNo;
  }

  public void setUpdateName(String updateName) {
    this.updateName = updateName;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public void setDeleteNo(String deleteNo) {
    this.deleteNo = deleteNo;
  }

  public void setDeleteName(String deleteName) {
    this.deleteName = deleteName;
  }

  public void setDeleteTime(Date deleteTime) {
    this.deleteTime = deleteTime;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public void setOperatorIp(String operatorIp) {
    this.operatorIp = operatorIp;
  }
}
