package com.mindtree.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.dao.SaveToDataBase;
import com.mindtree.entity.Employee;
import com.mindtree.entity.Project;
import com.mindtree.entity.Task;

@Repository("addDetails")
@Transactional
@EnableTransactionManagement

public class AddDetails implements SaveToDataBase {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void addEmployee(Employee emp) {
        hibernateTemplate.save(emp.getProject());
        hibernateTemplate.save(emp);
    }

    @Override
    public void addTask(Task task) {
        hibernateTemplate.save(task);
    }

    @Override
    public int addProject(Project project) {
        hibernateTemplate.save(project);
		return 0;
    }

}
