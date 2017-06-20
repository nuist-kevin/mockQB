package com.mic.test.cb.qb.persist.domain.cb;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseDomain implements Serializable {

  private String addNo;
  private String addName;
  private LocalDateTime addTime;
  private String updateNo;
  private String updateName;
  private LocalDateTime updateTime;

  public String getAddNo() {
    return addNo;
  }

  public void setAddNo(String addNo) {
    this.addNo = addNo;
  }

  public String getAddName() {
    return addName;
  }

  public void setAddName(String addName) {
    this.addName = addName;
  }

  public LocalDateTime getAddTime() {
    return addTime;
  }

  public void setAddTime(LocalDateTime addTime) {
    this.addTime = addTime;
  }

  public String getUpdateNo() {
    return updateNo;
  }

  public void setUpdateNo(String updateNo) {
    this.updateNo = updateNo;
  }

  public String getUpdateName() {
    return updateName;
  }

  public void setUpdateName(String updateName) {
    this.updateName = updateName;
  }

  public LocalDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }
}
