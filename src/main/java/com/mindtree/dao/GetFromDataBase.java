package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;
import com.mindtree.exception.TaskManagementException;

public interface GetFromDataBase {

    public List<Employee> getAllEmployees() throws TaskManagementException;

    public List<Employee> employeesByProjectId(Integer projectId) throws TaskManagementException;

    public List<Project> getAllProjects() throws TaskManagementException;

    public List<Task> getTasksByProjectId(Integer project) throws TaskManagementException;

}
