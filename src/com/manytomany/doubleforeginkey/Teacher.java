package com.manytomany.doubleforeginkey;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//教师实体类
@Entity
@Table(name="teacher",schema="hibernate")
public class Teacher {
	   
	   @Id
	   @GeneratedValue(generator="tid")
	   @GenericGenerator(name="tid",strategy="assigned")
	   @Column(length=4)
	   private String tid;
	   private String tname;
	   
	   @ManyToMany(mappedBy="teachers")
	   private Set<Students> student;//老师持有学生集合
	   
	public Teacher(String tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	
	
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
       

}
