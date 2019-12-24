package com.zhangyaoxing.entity;

//坐标类
public class Manth {
	private Integer id;
	private String cardno;
	private String created;
	private Double jd;
	private Double wd;
	private String lon;
	public Manth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manth(Integer id, String cardno, String created, Double jd, Double wd, String lon) {
		super();
		this.id = id;
		this.cardno = cardno;
		this.created = created;
		this.jd = jd;
		this.wd = wd;
		this.lon = lon;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public Double getJd() {
		return jd;
	}
	public void setJd(Double jd) {
		this.jd = jd;
	}
	public Double getWd() {
		return wd;
	}
	public void setWd(Double wd) {
		this.wd = wd;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	
	
}
