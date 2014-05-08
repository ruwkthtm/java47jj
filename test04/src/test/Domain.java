package test;

import java.sql.Date;

public class Domain {

	private String name;
	private int age;
	private String gender;
	private String nation;
	private Date regDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	@Override
	public String toString() {
		return "Domain [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", nation=" + nation + ", regDate=" + regDate + "]";
	}
	
}
