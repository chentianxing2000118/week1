/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: User.java 
 * @Prject: chentianxing_week1
 * @Package: com.chentianxing.bean 
 * @Description: TODO
 * @author: 陈天星  
 * @date: 2019年8月12日 上午8:49:13 
 * @version: V1.0   
 */
package com.chentianxing.bean;

import java.io.Serializable;

/** 
 * @ClassName: User 
 * @Description: TODO
 * @author:陈天星
 * @date: 2019年8月12日 上午8:49:13  
 */
public class User implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @fieldName: id
	 * @fieldType: Integer
	 * @Description: 编号
	 */
	private Integer id;
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: 姓名
	 */
	private String name;
	/**
	 * @fieldName: sex
	 * @fieldType: String
	 * @Description:性别
	 */
	private String sex;
	/**
	 * @fieldName: phoneNumber
	 * @fieldType: String
	 * @Description: 电话号码
	 */
	private String phoneNumber;
	/**
	 * @fieldName: email
	 * @fieldType: String
	 * @Description: 电子邮箱
	 */
	private String email;
	/**
	 * @fieldName: birthday
	 * @fieldType: String
	 * @Description: 生日
	 */
	private String birthday;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	public User() {
		super();
	}
	public User(Integer id, String name, String sex, String phoneNumber, String email, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.birthday = birthday;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", birthday=" + birthday + "]";
	}
	
}
