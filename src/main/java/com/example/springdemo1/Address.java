package com.example.springdemo1;

public class Address {
private int dNo;
private String area;
private String city;
private int pincode;

public Address(int dNo, String area, String city, int pincode) {
	super();
	this.dNo = dNo;
	this.area = area;
	this.city = city;
	this.pincode = pincode;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

//public int getdNo() {
//	return dNo;
//}
//public void setdNo(int dNo) {
//	this.dNo = dNo;
//}
//public String getArea() {
//	return area;
//}
//public void setArea(String area) {
//	this.area = area;
//}
//public String getCity() {
//	return city;
//}
//public void setCity(String city) {
//	this.city = city;
//}
//public int getPincode() {
//	return pincode;
//}
//public void setPincode(int pincode) {
//	this.pincode = pincode;
//}
@Override
public String toString() {
	return "Address [dNo=" + dNo + ", area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
}


}
