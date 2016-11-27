package onetoone_doubleforeginkey;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//学生实体类

@Entity
@Table(name="t_students2",schema="hibernate")
public class Students {
	   
	
	   @OneToOne(cascade=CascadeType.ALL)//级联关系，全级联。
	   @JoinColumn(name="pid",unique=true)	//被控类对应的主键，主键名 pid  true唯一的。
	   private IdCard card;
	   
	   @Id
	   @GeneratedValue
       private Integer sid;
       private String sgender;
       private Date birthday;
       private String major;
       
       
       public Students()
       {
    	   
       }
       
	   public Students(IdCard card, String sgender, Date birthday, String major) {
		super();
		this.card = card;
		this.sgender = sgender;
		this.birthday = birthday;
		this.major = major;
	}

    
	   
	public IdCard getCard() {
		return card;
	}

	public void setCard(IdCard card) {
		this.card = card;
	}

	public Integer getSid() {
		return sid;
	}


	public void setSid(Integer sid) {
		this.sid = sid;
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


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}
       
       
}
