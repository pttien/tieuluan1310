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

//import com.viettel.core.entities.CP;

/**
 * @author Dinesh Rajput
 *
 */
@Entity
@Table(name="product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "id")
	private Integer id;
	@Column(name="name")
	private String name;	
	@Column(name="pice")
	private Integer pice;
//	@Column(name="factory_id")
//	private Integer factory_id;	
	@Column(name="image")
	private String image;	
	@Column(name="info")
	private String info;	
	@Column(name="warranty")
	private Integer warranty;	
//	@Column(name="category_id")
//	private Integer category_id;	
	@Column(name="status")
	private Integer status;		
	@Column(name="created_at")
	private Date created_at;
	@Column(name="updated_at")
	private Date updated_at;
	
	@ManyToOne(targetEntity = Factory.class)
    @JoinColumn(name = "factory_id", referencedColumnName = "id")
    private Factory factory;
	@ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category categogy;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPice() {
		return pice;
	}
	public void setPice(Integer pice) {
		this.pice = pice;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Integer getWarranty() {
		return warranty;
	}
	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Factory getFactory() {
		return factory;
	}
	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	public Category getCategogy() {
		return categogy;
	}
	public void setCategogy(Category categogy) {
		this.categogy = categogy;
	}
	}
