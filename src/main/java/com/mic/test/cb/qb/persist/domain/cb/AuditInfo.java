package com.mic.test.cb.qb.persist.domain.cb;

import java.time.LocalDateTime;
import javax.persistence.Embeddable;

@Embeddable
public class AuditInfo {

  private String auditNo;
  private String auditName;
  private LocalDateTime auditTime;

  public String getAuditNo() {
    return auditNo;
  }

  public void setAuditNo(String auditNo) {
    this.auditNo = auditNo;
  }

  public String getAuditName() {
    return auditName;
  }

  public void setAuditName(String auditName) {
    this.auditName = auditName;
  }

  public LocalDateTime getAuditTime() {
    return auditTime;
  }

  public void setAuditTime(LocalDateTime auditTime) {
    this.auditTime = auditTime;
  }
}
