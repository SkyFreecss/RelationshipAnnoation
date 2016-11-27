package com.manytomany.doubleforeginkey;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//学生实体类
@Entity
@Table(name="t_students6",schema="hibernate")
public class Students {
	   
	
	   @Id
	   @GeneratedValue(generator="sid")
	   @GenericGenerator(name="sid",strategy="assigned")
	   @Column(length=4)
	   private String sid;
	   private String sname;
	   private Date birthday;
	   private String major;
	   
	   @ManyToMany
	   @JoinTable(
			   name="teachers_students",//中间表表名
			   joinColumns={@JoinColumn(name="sid")},//学生表外键
			   inverseJoinColumns={@JoinColumn(name="tid")}//教师表外键
			   )
	   private Set<Teacher> teacher;


	public Students(String sid,String sname, Date birthday, String major) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.birthday = birthday;
		this.major = major;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
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


	public Set<Teacher> getTeacher() {
		return teacher;
	}


	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}
       
	   
}
