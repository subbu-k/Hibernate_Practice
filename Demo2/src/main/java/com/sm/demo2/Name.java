

package com.sm.demo2;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
	@Column(name="FirstName")
private String fname;
	@Column(name="MiddleName")
private String mname;
	@Column(name="LsatName")
private String lname;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
@Override
public String toString() {
	return "Name [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
}


}
