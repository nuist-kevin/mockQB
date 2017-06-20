package com.mic.test.cb.qb.persist.domain;

import java.time.LocalDateTime;
import javax.persistence.Embeddable;

/**
 * Created by caiwen on 2017/6/19.
 */
@Embeddable
public class DeleteInfo {

  private String deleteNo;
  private String deleteName;
  private LocalDateTime deleteTime;
  private Integer deleteFlag;

  public String getDeleteNo() {
    return deleteNo;
  }

  public void setDeleteNo(String deleteNo) {
    this.deleteNo = deleteNo;
  }

  public String getDeleteName() {
    return deleteName;
  }

  public void setDeleteName(String deleteName) {
    this.deleteName = deleteName;
  }

  public LocalDateTime getDeleteTime() {
    return deleteTime;
  }

  public void setDeleteTime(LocalDateTime deleteTime) {
    this.deleteTime = deleteTime;
  }

  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
