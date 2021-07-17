package com.example.demo;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeService {

	@PersistenceContext
	EntityManager enitityManager;

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public List<Employee> getEmployeeLists() {

		try {
			System.out.println("get Employee List Called");
			return getEmployee();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public List<Employee> getEmployee() {
		List<Employee> employeeList = new ArrayList();
		try {
			Query query = (Query) enitityManager.createNamedQuery("EmployeeEntity.getEmployeeList");
			employeeList = query.getResultList();
			for (int i = 0; i < employeeList.size(); i++) {
				System.out.println(employeeList.get(i).getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeList;
	}

}
