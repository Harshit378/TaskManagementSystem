package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;
import com.mindtree.exception.TaskManagementException;

public interface View {
public List<Employee> getAllEmployees() throws TaskManagementException;
public List<Project> getAllProjects() throws TaskManagementException;
public List<Employee> getAllEmployeeByProjectID(int i) throws TaskManagementException;
public List <Task> getAllTaskByProejctId(int id) throws TaskManagementException;

}
