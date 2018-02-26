package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task1;

public interface View {
public List<Employee> getAllEmployees();
public List<Project> getAllProjects();
public List<Employee> getAllEmployeeByProjectID(Project id);
public List <Task1> getAllTaskByProejctId(Project id);

}
