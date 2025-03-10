package com.niit.recruiter.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job")

public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="employer_email")
	private String employerEmail;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private String salary;
	@Column(name="type")
	private String type;
	@Column(name="description")
	private String description;
	@Column(name="vacancy")
	private String vacancy;
	@Column(name="advertise_date")
	private Date advertiseDate;
	@Column(name = "expire_date")
	private Date expireDate;
	@Column(name = "logo")
	private String logo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployerEmail() {
		return employerEmail;
	}
	public void setEmployerEmail(String employerEmail) {
		this.employerEmail = employerEmail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVacancy() {
		return vacancy;
	}
	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}
	public Date getAdvertiseDate() {
		return advertiseDate;
	}
	public void setAdvertiseDate(Date advertiseDate) {
		this.advertiseDate = advertiseDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	
}
