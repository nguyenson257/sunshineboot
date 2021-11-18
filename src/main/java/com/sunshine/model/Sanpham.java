package com.sunshine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tblsanpham")
@Entity
public class Sanpham {
	@Id
	@Column
	private int idsp;
	@Column
	private int iddm;
	@Column
	private String tensp;
	@Column
	private String motasp;
	@Column
	private String anhsp;
	@Column
	private int gia;
	@Column
	private int kcal;
	@Column
	private int thoigian;
	public int getIdsp() {
		return idsp;
	}
	public void setIdsp(int idsp) {
		this.idsp = idsp;
	}
	public int getIddm() {
		return iddm;
	}
	public void setIddm(int iddm) {
		this.iddm = iddm;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public String getMotasp() {
		return motasp;
	}
	public void setMotasp(String motasp) {
		this.motasp = motasp;
	}
	public String getAnhsp() {
		return anhsp;
	}
	public void setAnhsp(String anhsp) {
		this.anhsp = anhsp;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public int getThoigian() {
		return thoigian;
	}
	public void setThoigian(int thoigian) {
		this.thoigian = thoigian;
	}

}
