package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task1;


public interface GetFromDataBase {
public List<Employee> getAllEmployees();

public List<Employee> employeesByProjectId(Integer projectId);
public List<Project> getAllProjects();
public List<Task1> getTasksByProjectId(Integer project);

}
