package com.mic.test.cb.qb.persist.domain.api;

import com.mic.test.cb.qb.xml.domain.QBXML;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by caiwen on 2017/6/1.
 */
@Entity(name = "t_qbwc_task")
public class QBWCTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Integer id;

    @Column(name = "request_id")
    private String requestId;

    private String ticket;

    private Integer type;

    @Column(name = "qbxml_req")
    private String qbxmlReq;

    @Column(name = "qbxml_resp")
    private String qbxmlResp;

    private Integer status;

    @Column(name = "exec_time")
    private Date execTime;

    @Column(name = "qb_id")
    private String qbId;

    @Column(name = "mount_id")
    private Integer mountId;

    @Column(name = "error_desc")
    private String errorDesc;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_time")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getQbxmlReq() {
        return qbxmlReq;
    }

    public void setQbxmlReq(String qbxmlReq) {
        this.qbxmlReq = qbxmlReq;
    }

    public String getQbxmlResp() {
        return qbxmlResp;
    }

    public void setQbxmlResp(String qbxmlResp) {
        this.qbxmlResp = qbxmlResp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getExecTime() {
        return execTime;
    }

    public void setExecTime(Date execTime) {
        this.execTime = execTime;
    }

    public String getQbId() {
        return qbId;
    }

    public void setQbId(String qbId) {
        this.qbId = qbId;
    }

    public Integer getMountId() {
        return mountId;
    }

    public void setMountId(Integer mountId) {
        this.mountId = mountId;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
