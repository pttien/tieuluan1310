package com.tieuluan.struts2.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Dinesh Rajput
 *
 */
@Entity
@Table(name="oder")
public class Oder implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "id")
	private Integer id;
//	@Column(name="id_member")
//	private Integer id_member;	
	@Column(name="date_oder")
	private Date date_oder;
	@Column(name="date_delivery")
	private Date date_delivery;	
	@Column(name="status")
	private Boolean status;		
	@Column(name="created_at")
	private Date created_at;
	@Column(name="updated_at")
	private Date updated_at;	
	@ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "id_member", referencedColumnName = "id")
    private Member member;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate_oder() {
		return date_oder;
	}
	public void setDate_oder(Date date_oder) {
		this.date_oder = date_oder;
	}
	public Date getDate_delivery() {
		return date_delivery;
	}
	public void setDate_delivery(Date date_delivery) {
		this.date_delivery = date_delivery;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}		
	}
