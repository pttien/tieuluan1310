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
@Table(name="comment")
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "id")
	private Integer commentid;
//	@Column(name="id_member")
//	private Integer id_member;	
	@Column(name="info")
	private String info;
	@Column(name="date")
	private Date date;	
//	@Column(name="id_product")
//	private Integer id_product;	
	@Column(name="created_at")
	private Date created_at;
	@Column(name="updated_at")
	private Date updated_at;
	
	@ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "id_member", referencedColumnName = "id")
    private Member member;
	@ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private Product product;
	public Integer getCommentid() {
		return commentid;
	}
	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}	
	
}
