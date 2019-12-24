package com.zhangyaoxing.entity;

public class Vo {
	private Double jd;
	private Double wd;
	private Double start;
	private Double end;
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
	public Double getStart() {
		return start;
	}
	public void setStart(Double start) {
		this.start = start;
	}
	public Double getEnd() {
		return end;
	}
	public void setEnd(Double end) {
		this.end = end;
	}
	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vo(Double jd, Double wd, Double start, Double end) {
		super();
		this.jd = jd;
		this.wd = wd;
		this.start = start;
		this.end = end;
	}
	@Override
	public String toString() {
		return "Vo [jd=" + jd + ", wd=" + wd + ", start=" + start + ", end=" + end + "]";
	}
	
}
