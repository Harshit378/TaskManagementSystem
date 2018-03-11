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
public class Task {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;
    @Column
    private String taskdescripion;

    @Column
    private String taskStartDate;

    @Column
    private String taskEndDate;

    @OneToOne
    @JoinColumn(name = "empID")
    private Employee employee;

    @OneToOne
    @JoinColumn(name = "projectId")
    private Project project;

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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    public Task() {
		super();
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((taskdescripion == null) ? 0 : taskdescripion.hashCode());
		result = prime * result + taskId;
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
		Task other = (Task) obj;
		if (taskdescripion == null) {
			if (other.taskdescripion != null)
				return false;
		} else if (!taskdescripion.equals(other.taskdescripion))
			return false;
		if (taskId != other.taskId)
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "Task1{" +
                "taskId=" + taskId +
                ", taskdescripion='" + taskdescripion + '\'' +
                ", taskStartDate='" + taskStartDate + '\'' +
                ", taskEndDate='" + taskEndDate + '\'' +
                ", employee=" + employee +
                ", project=" + project +
                '}';
    }
}
