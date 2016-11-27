package com.manytoone.foreginkey;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

//�༶ʵ����
@Entity
public class ClassRoom {
	   
	   @Id
	   @GeneratedValue(generator="cid")
	   @GenericGenerator(name="cid",strategy="assigned")
	   @Column(length=8)
       private String cid;//�༶�ı��
       private String cname;//�༶������
       
       
       public ClassRoom()
       {
    	   
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


	public ClassRoom(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
       
       
}
