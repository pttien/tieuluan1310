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
@Table(name="favorite_product")
public class Favorite_product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "id")
	private Integer id;
//	@Column(name="id_product")
//	private Integer id_product;	
//	@Column(name="id_member")
//	private Integer id_member;
	@Column(name="is_activated")
	private Integer is_activated;			
	@Column(name="created_at")
	private Date created_at;
	@Column(name="updated_at")
	private Date updated_at;
	@ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private Product product;
	@ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "id_member", referencedColumnName = "id")
    private Member oder;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIs_activated() {
		return is_activated;
	}
	public void setIs_activated(Integer is_activated) {
		this.is_activated = is_activated;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Member getOder() {
		return oder;
	}
	public void setOder(Member oder) {
		this.oder = oder;
	}	
	}
