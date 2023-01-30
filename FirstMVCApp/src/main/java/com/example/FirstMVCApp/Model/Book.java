package com.example.FirstMVCApp.Model;

public class Book {

	int bookid;
	float bprice;
	String bname;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bprice=" + bprice + ", bname=" + bname + "]";
	}
	
	
	
	
	
}
