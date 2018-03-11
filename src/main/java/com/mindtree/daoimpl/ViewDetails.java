package com.mindtree.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.dao.GetFromDataBase;
import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;

@Repository("viewDetails")
@Transactional
@EnableTransactionManagement
public class ViewDetails implements GetFromDataBase {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return hibernateTemplate.loadAll(Employee.class);
    }

    @Override
    public List<Employee> employeesByProjectId(Integer projectId) {

        return (List<Employee>) (hibernateTemplate.getSessionFactory().getCurrentSession()).get(Employee.class, projectId);
    }

    @Override
    public List<Project> getAllProjects() {
       /* List<Project> projects = new ArrayList<>();
        Project p1 = new Project();
        p1.setProjectId(1);
        p1.setProjectName("HA");
        Project p2 = new Project();
        p2.setProjectId(2);
        p2.setProjectName("NGAF");

        projects.add(p1);
        projects.add(p2);
        return projects;*/
        return hibernateTemplate.loadAll(Project.class);
    }

    @Override
    public List<Task> getTasksByProjectId(Integer project) {

        return (List<Task>) hibernateTemplate.get(Project.class, project);
    }

}
