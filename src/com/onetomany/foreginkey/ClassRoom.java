package com.onetomany.foreginkey;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//班级实体类
@Entity
@Table(name="classroom2",schema="hibernate")
public class ClassRoom {
	
	   @Id
	   @GeneratedValue(generator="cid")
	   @GenericGenerator(name="cid",strategy="assigned")
	   @Column(length=8)
       private String cid;//班级的编号
       private String cname;//班级的名字
       
       @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
       @JoinColumn(name="cid")
       private Set<Students> student;//一方持有多方的集合。
       
       
       
	public ClassRoom(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}


	public Set<Students> getStudent() {
		return student;
	}


	public void setStudent(Set<Students> student) {
		this.student = student;
	}
	
	
}
