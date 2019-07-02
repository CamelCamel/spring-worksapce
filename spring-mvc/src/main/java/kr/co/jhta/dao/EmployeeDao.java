package kr.co.jhta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	public List<Employee> getAllEmployeesByDepartmentId(Integer deptId){
		return (List<Employee>)template.queryForList("getAllEmployeesByDepartmentId", deptId);
	}
	
	public Employee getEmployeeById(Integer id) {
		return (Employee) template.queryForObject("getEmployeeById", id);
	}
	
	public void addEmployee(Employee emp) {
		System.out.println("------------------");
		System.out.println(emp.getLastName());
		System.out.println(emp.getEmail());
		System.out.println("------------------");
		template.insert("addEmployee", emp);
	}
}
