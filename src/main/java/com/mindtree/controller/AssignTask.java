package com.mindtree.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task1;
import com.mindtree.service.Save;
import com.mindtree.service.View;


@Controller
public class AssignTask {
	@Autowired
	Save saveImpl;
	@Autowired
	View viewImpl;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String MessageToPrint(ModelMap value) {
		value.addAttribute("msg1", "Welcome to mvc project");
		return "Home";
	}

	@RequestMapping(value = "AssignTask", method = RequestMethod.GET)
	public String Assign(ModelMap value) {
		value.addAttribute("msg1", "Welcome to mvc project");
		return "AssignTask";
	}
	@RequestMapping(value="ViewTask",method=RequestMethod.POST)
	public ModelAndView ViewTask(HttpServletRequest req,HttpServletResponse res) throws Exception
	{
		Employee emp=new Employee();
		Project project=new Project();
		Task1 task =new Task1();
		task.setTaskdescripion(req.getParameter("description"));
		project.setProjectName(req.getParameter("selectbox1"));
	     emp.setName(req.getParameter("result"));
		task.setTaskStartDate(req.getParameter("startDate"));
		task.setTaskEndDate("endDate");
		task.setEmployee(emp);
		task.setProject(project);
		emp.setProject(project);
	//	emp.setId(emp.getName()+Integer.toString(emp.getName().length()));
		saveImpl.saveEmployee(emp);
		saveImpl.saveProject(project);
		saveImpl.saveTask(task);
	return	new ModelAndView("AssignTask", "msg2", req.getParameter("selectbox1"));
		
	}
	@RequestMapping(value="ViewTask",method=RequestMethod.GET)
	public ModelAndView viewDetails(HttpServletRequest req,HttpServletResponse res)
	{ 
		ModelAndView modelAndview =new ModelAndView("ViewTask");
		
	List<Project> projectList=viewImpl.getAllProjects();
	
//	List<Employee> empListOfProject=viewImpl.getAllEmployeeByProjectID(id)
		modelAndview.addObject("model", projectList);
		
		return modelAndview;
	}



}
