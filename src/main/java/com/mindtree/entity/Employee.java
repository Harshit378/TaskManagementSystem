package com.mindtree.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Employee")

public class Employee {
	@Id
	@Column(name="empID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name="empName")
	private String name;
	@ManyToOne(targetEntity=Project.class,fetch=FetchType.EAGER)
	@JoinColumn(name="projectId")
	private Project project;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	

}
