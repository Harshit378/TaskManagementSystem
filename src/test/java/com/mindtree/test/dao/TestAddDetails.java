package com.mindtree.test.dao;


import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mindtree.dao.SaveToDataBase;
import com.mindtree.entity.Project;
import com.mindtree.exception.TaskManagementException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/TestApplicationContext.xml")
public class TestAddDetails {
	@Autowired
	private SaveToDataBase saveDetails;

	public static Project project;
	@BeforeClass
	public static void setProject() throws TaskManagementException{
		project=new Project();
		project.setProjectName("ProjectABC");
		project.setProjectId(1);
	}

	@Test
	public void testAddProject() throws TaskManagementException {

			int i =saveDetails.addProject(project);
			assertNotEquals(i, 0);
			}


	@Test(expected=TaskManagementException.class)
	public void negativeTest2AddProject() throws TaskManagementException {
		
		saveDetails.addProject(null);
		}

	
	@Test(expected=TaskManagementException.class)
	public void negativeTest3AddEmployee() throws TaskManagementException {
		
		saveDetails.addEmployee(null);
		}
	@Test(expected=TaskManagementException.class)
	public void negativeTest3AddTask() throws TaskManagementException {
		
		saveDetails.addTask(null);
		}



}
