package com.mindtree.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dao.GetFromDataBase;
import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;
import com.mindtree.exception.TaskManagementException;
import com.mindtree.service.View;
@Service
public class ViewImpl implements View
{
	@Autowired
	private GetFromDataBase viewDetails;

	@Override
	public List<Employee> getAllEmployees() throws TaskManagementException {
		return viewDetails.getAllEmployees();
	}

	@Override
	public List<Project> getAllProjects() throws TaskManagementException {
		return viewDetails.getAllProjects();
	}

	@Override
	public List<Employee> getAllEmployeeByProjectID(int id) throws TaskManagementException {
		return viewDetails.employeesByProjectId(id);
	}

	@Override
	public List<Task> getAllTaskByProejctId(int id) throws TaskManagementException {
		return viewDetails.getTasksByProjectId(id);
	}

}
