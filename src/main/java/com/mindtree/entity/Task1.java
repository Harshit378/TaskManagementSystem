package com.mindtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task1")
public class Task1 {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int taskId;
    @Column
	private String taskdescripion;
    
    public String getTaskdescripion() {
		return taskdescripion;
	}
	public void setTaskdescripion(String taskdescripion) {
		this.taskdescripion = taskdescripion;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskStartDate() {
		return taskStartDate;
	}
	public void setTaskStartDate(String taskStartDate) {
		this.taskStartDate = taskStartDate;
	}
	public String getTaskEndDate() {
		return taskEndDate;
	}
	public void setTaskEndDate(String taskEndDate) {
		this.taskEndDate = taskEndDate;
	}
	
	public Project getProjectId() {
		return project;
	}
	public void setProjectId(Project projectId) {
		this.project = projectId;
	}
	@Column
	private String taskStartDate;
    @Column
	private String taskEndDate;
    @OneToOne
    @JoinColumn(name="empID")
    private Employee employee;
    public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@OneToOne
    @JoinColumn(name="projectId")
    private Project project;

	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
}
