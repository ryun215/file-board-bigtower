package com.team4.bigtower.board.service;

public class File {
	private int fNo;
	private String fName;
	private String fPath;
	private int bNo;
	
	public File(int fNo, String fName, String fPath, int bNo) {
		super();
		this.fNo = fNo;
		this.fName = fName;
		this.fPath = fPath;
		this.bNo = bNo;
	}
	
	public int getfNo() {
		return fNo;
	}
	public void setfNo(int fNo) {
		this.fNo = fNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfPath() {
		return fPath;
	}
	public void setfPath(String fPath) {
		this.fPath = fPath;
	}
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	
	@Override
	public String toString() {
		return "File [fNo=" + fNo + ", fName=" + fName + ", fPath=" + fPath + ", bNo=" + bNo + "]";
	}
	
	
}
