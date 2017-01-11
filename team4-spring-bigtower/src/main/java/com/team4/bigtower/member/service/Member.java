package com.team4.bigtower.member.service;

public class Member {
	private String mId;
	private String mPw;
	private String mName;
	private String mLevel;
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPw() {
		return mPw;
	}
	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmLevel() {
		return mLevel;
	}
	public void setmLevel(String mLevel) {
		this.mLevel = mLevel;
	}
	@Override
	public String toString() {
		return "Member [mId=" + mId + ", mPw=" + mPw + ", mName=" + mName + ", mLevel=" + mLevel + "]";
	}
	
	
}
