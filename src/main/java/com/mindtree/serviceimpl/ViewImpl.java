package com.mindtree.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.GetFromDataBase;
import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task1;
import com.mindtree.service.View;
@Service
public class ViewImpl implements View
{
	@Autowired
	private GetFromDataBase viewDetails;

	@Override
	public List<Employee> getAllEmployees() {
		return viewDetails.getAllEmployees();
	}

	@Override
	public List<Project> getAllProjects() {
		return viewDetails.getAllProjects();
	}

	@Override
	public List<Employee> getAllEmployeeByProjectID(Project id) {
		return viewDetails.employeesByProjectId(id.getProjectId());
	}

	@Override
	public List<Task1> getAllTaskByProejctId(Project id) {
		return viewDetails.getTasksByProjectId(id.getProjectId());
	}

}
