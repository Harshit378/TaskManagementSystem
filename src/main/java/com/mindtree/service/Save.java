package com.mindtree.service;


import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;
import com.mindtree.exception.TaskManagementException;

public interface Save {
    public void saveEmployee(Employee emp) throws TaskManagementException  ;

    public void saveProject(Project project) throws TaskManagementException ;

    public void saveTask(Task task) throws TaskManagementException;

}
