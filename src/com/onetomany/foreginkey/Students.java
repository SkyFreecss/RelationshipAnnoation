package com.onetomany.foreginkey;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//学生实体类
@Entity
@Table(name="t_students4",schema="hibernate")
public class Students {
	   
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private Integer sid;
	   private String sname;
	   private String sgender;
	   private Date birthday;
	   
	   
	   
	public Students(String sname, String sgender, Date birthday) {
		super();
		this.sname = sname;
		this.sgender = sgender;
		this.birthday = birthday;
	}
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
