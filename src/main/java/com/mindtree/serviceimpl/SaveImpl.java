package com.mindtree.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.SaveToDataBase;
import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task1;
import com.mindtree.service.Save;

@Service
public class SaveImpl implements Save {

    @Autowired
	private  SaveToDataBase addDetails;

	@Override
	public void saveEmployee(Employee emp) {
	addDetails.addEmployee(emp);
	}

	@Override
	public void saveProject(Project project) {
		addDetails.addProject(project);
	}

	@Override
	public void saveTask(Task1 task) {
		addDetails.addTask(task);
	}

}
