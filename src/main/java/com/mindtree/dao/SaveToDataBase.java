package com.mindtree.dao;

import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task1;

public interface SaveToDataBase {

    public void addEmployee(Employee emp);

    public void addTask(Task1 task);

    public void addProject(Project project);
}
