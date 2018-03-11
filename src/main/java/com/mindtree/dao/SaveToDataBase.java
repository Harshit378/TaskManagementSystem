package com.mindtree.dao;

import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;
import com.mindtree.exception.TaskManagementException;

public interface SaveToDataBase {

    public void addEmployee(Employee emp) throws TaskManagementException;

    public void addTask(Task task) throws TaskManagementException;

    public int addProject(Project project)throws TaskManagementException;
}
