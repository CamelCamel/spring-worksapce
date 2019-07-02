package kr.co.jhta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.vo.Department;
import kr.co.jhta.vo.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeDao empDao;
	
	@Autowired
	private DepartmentDao deptDao;
	
	@RequestMapping("/dept.do")
	public String depts(Model model) {
		
		List<Department> depts = deptDao.getDeptAll();
		model.addAttribute("depts", depts);
		
		return "emp/depts";
	}
	
	@RequestMapping("/employees.do")
	public String employees(Integer deptid, Model model) {
		List<Employee> emps = empDao.getAllEmployeesByDepartmentId(deptid);
		
		model.addAttribute("emps", emps);
		
		return "emp/employees";
	}
	
	@RequestMapping("/employee.do")
	public String employee(Integer empid, Model model) {
		
		Employee emp = empDao.getEmployeeById(empid);
		
		model.addAttribute("emp", emp);
		
		return "emp/employee";
	}
	
	@RequestMapping("/form.do")
	public String form() {
		
		return "emp/form";
	}
	
	@RequestMapping("/add.do")
	public String add(Employee emp) {
		System.out.println(emp.getLastName());
		System.out.println(emp.getEmail());
		empDao.addEmployee(emp);
		
		return "redirect:dept.do";
	}
}
