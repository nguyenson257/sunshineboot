package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tblphuongxa")
@Entity
public class Phuongxa {
	@Id
	@Column
	private int idpx;
	@Column
	private int idqh;
	@Column
	private String tenpx;
	public int getIdpx() {
		return idpx;
	}
	public void setIdpx(int idpx) {
		this.idpx = idpx;
	}
	public int getIdqh() {
		return idqh;
	}
	public void setIdqh(int idqh) {
		this.idqh = idqh;
	}
	public String getTenpx() {
		return tenpx;
	}
	public void setTenpx(String tenpx) {
		this.tenpx = tenpx;
	}
	
}
