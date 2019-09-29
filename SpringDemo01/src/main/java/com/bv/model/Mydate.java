package com.bv.model;

public class Mydate {

	private int dd,mm,yy;

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Mydate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	
	
	
}
