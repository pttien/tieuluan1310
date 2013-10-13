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
@Table(name="detail_oder")
public class Detail_oder implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "id")
	private Integer id;
//	@Column(name="id_oder")
//	private Integer id_oder;	
//	@Column(name="id_product")
//	private Integer id_product;
	@Column(name="quantum")
	private Integer quantum;		
	@Column(name="total_money")
	private Integer total_money;
	@Column(name="created_at")
	private Date created_at;
	@Column(name="updated_at")
	private Date updated_at;
	
	@ManyToOne(targetEntity = Oder.class)
    @JoinColumn(name = "id_oder", referencedColumnName = "id")
    private Oder oder;
	@ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private Product product;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuantum() {
		return quantum;
	}
	public void setQuantum(Integer quantum) {
		this.quantum = quantum;
	}
	public Integer getTotal_money() {
		return total_money;
	}
	public void setTotal_money(Integer total_money) {
		this.total_money = total_money;
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
	public Oder getOder() {
		return oder;
	}
	public void setOder(Oder oder) {
		this.oder = oder;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
