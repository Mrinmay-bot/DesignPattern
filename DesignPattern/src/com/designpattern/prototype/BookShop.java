package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.prototype.dao.Book;

public class BookShop implements Cloneable{
	
    @Override
	public BookShop clone() throws CloneNotSupportedException {
    	BookShop  bookShop= new BookShop();
		for(Book b:this.getB()) {
			bookShop.getB().add(b);
		}
		
		return bookShop;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", b=" + b + "]";
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getB() {
		return b;
	}
	public void setB(List<Book> b) {
		this.b = b;
	}
	private String shopName;
	List<Book> b=new ArrayList<>();
	
	
	public void loadBook() {
		for(int i=1;i <=10;i++) {
			Book b=new Book();
			b.setBid(i);
			b.setBname("Book " + i);
			getB().add(b);
			//b.get(i).setBname("Book " + i);
		}
	}
}
