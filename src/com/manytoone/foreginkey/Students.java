package com.manytoone.foreginkey;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_students3",schema="hibernate")
public class Students {
	   
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
       private Integer sid;//学号
       private String sname;//姓名
       private Date birthday;//出生日期
       private String major;//专业
       
       @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
       @JoinColumn(name="cid",referencedColumnName="cid")
       private ClassRoom cr;
       
       


	public Students()
       {
    	   
       }
       
       

	public Students( String sname, Date birthday, String major) {
		super();
		this.sname = sname;
		this.birthday = birthday;
		this.major = major;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public ClassRoom getCr() {
		return cr;
	}



	public void setCr(ClassRoom cr) {
		this.cr = cr;
	}

}
