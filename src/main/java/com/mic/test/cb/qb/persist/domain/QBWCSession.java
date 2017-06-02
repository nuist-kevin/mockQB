package com.mic.test.cb.qb.persist.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by caiwen on 2017/6/1.
 */
@Entity(name = "t_qbwc_session")
public class QBWCSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id")
    private Integer id;

    private String ticket;

    private String username;

    @Column(name = "data_modified_from")
    private Date dataModifiedFrom;

    @Column(name = "data_modified_to")
    private Date dataModifiedTo;

    private Integer status;

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

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDataModifiedFrom() {
        return dataModifiedFrom;
    }

    public void setDataModifiedFrom(Date dataModifiedFrom) {
        this.dataModifiedFrom = dataModifiedFrom;
    }

    public Date getDataModifiedTo() {
        return dataModifiedTo;
    }

    public void setDataModifiedTo(Date dataModifiedTo) {
        this.dataModifiedTo = dataModifiedTo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
