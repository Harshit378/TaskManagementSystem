package com.mindtree.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.SaveToDataBase;
import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;
import com.mindtree.exception.TaskManagementException;
import com.mindtree.service.Save;

@Service
public class SaveImpl implements Save {

    @Autowired
	private  SaveToDataBase addDetails;

	@Override
	public void saveEmployee(Employee emp) throws TaskManagementException {
	addDetails.addEmployee(emp);
	
	}
	@Override
	public void saveProject(Project project) throws TaskManagementException {
		addDetails.addProject(project);
	}

	@Override
	public void saveTask(Task task) throws TaskManagementException {
		addDetails.addTask(task);
	}

}
