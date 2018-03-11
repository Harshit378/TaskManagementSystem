package com.mindtree.test.dao;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mindtree.dao.GetFromDataBase;
import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;
import com.mindtree.exception.TaskManagementException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class TestViewDetails {
	@Autowired
	GetFromDataBase viewDetails;
	
	private static Project project;
	private static Employee employee;
	private static Task task;
	@BeforeClass
	public static void setProject() throws TaskManagementException{
		project=new Project();
		project.setProjectName("ProjectABC");
		project.setProjectId(1);
	}
	@BeforeClass
	public static void setEmployee() throws TaskManagementException{
		employee=new Employee();
		employee.setName("Kari");
		employee.setId(1);
	}

	
	@Test
	public void testemployeesByProjectId() throws TaskManagementException {
		
		List<Task> task=viewDetails.getTasksByProjectId(project.getProjectId());
		assertNotNull(task);
	}

	@Test
	public void testGetAllProjects() throws TaskManagementException {
		List<Project> projectList=viewDetails.getAllProjects();
		assertNotNull(projectList);
	}
	@Test
	public void testGetAllEmployee() throws TaskManagementException {
		List<Employee> emp=viewDetails.getAllEmployees();
		assertNotNull(emp);
	}

	

}
