package com.mindtree.controller;

import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;
import com.mindtree.exception.TaskManagementException;
import com.mindtree.service.Save;
import com.mindtree.service.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AssignTask {

	@Autowired
	private Save saveImpl;

	@Autowired
	private View viewImpl;

	private static final Logger logger = LoggerFactory.getLogger(AssignTask.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String messageToPrint(ModelMap value) {
		value.addAttribute("msg1", "Welcome to mvc project");
		return "Home";
	}

	@RequestMapping(value = "AssignTask", method = RequestMethod.GET)
	public String assign(ModelMap value) {
		value.addAttribute("msg1", "Welcome to mvc project");
		return "AssignTask";
	}

	@RequestMapping(value = "ViewTask", method = RequestMethod.GET)
	public ModelAndView assign1(ModelMap value) throws TaskManagementException {
		ModelAndView modelAndView = new ModelAndView();
		List<Project> projectList = viewImpl.getAllProjects();
		System.out.println("name===" + projectList.size());

		modelAndView.addObject("model", projectList);
		return modelAndView;
	}

	@RequestMapping(value = "Home", method = RequestMethod.POST)
	public ModelAndView viewTask(HttpServletRequest req, HttpServletResponse res) throws TaskManagementException {
		Employee emp = new Employee();
		Project project = new Project();
		Task task = new Task();
		task.setTaskdescripion(req.getParameter("description"));
		project.setProjectName(req.getParameter("selectbox1"));
		emp.setName(req.getParameter("result"));
		task.setTaskStartDate(req.getParameter("startDate"));
		task.setTaskEndDate("endDate");
		task.setEmployee(emp);
		task.setProject(project);
		emp.setProject(project);
		try {
			saveImpl.saveEmployee(emp);
			saveImpl.saveProject(project);
			saveImpl.saveTask(task);
			logger.info("Successfully saved the Project details");
		} catch (Exception e) {
			throw new TaskManagementException("Exception occurred while saving the Project ", e);
		}
		return new ModelAndView("AssignTask", "msg2", req.getParameter("selectbox1"));
	}

	@RequestMapping(value = "ViewTask", method = RequestMethod.POST)
	public ModelAndView viewDetails(HttpServletRequest req, HttpServletResponse res) throws TaskManagementException {
		ModelAndView modelAndview = new ModelAndView("ViewTask");
		String Id = req.getParameter("PRO");

		List<Project> projectList = viewImpl.getAllProjects();
		List<Employee> emp = viewImpl.getAllEmployeeByProjectID(Integer.parseInt(Id));
		List<Task> task = viewImpl.getAllTaskByProejctId(Integer.parseInt(Id));
		/*
		 * Task t = new Task(); t.setTaskdescripion("HIIIIIIIII"); Task t1 = new Task();
		 * t1.setTaskdescripion("SSSSS"); List<Task> task = new ArrayList<Task>();
		 * task.add(t); task.add(t1); Employee e=new Employee(); List<Employee> emp =
		 * new ArrayList<Employee>(); e.setName("Karishma"); emp.add(e);
		 */
		modelAndview.addObject("model", projectList);
		modelAndview.addObject("model1", emp);
		modelAndview.addObject("model2", task);

		return modelAndview;
	}

}