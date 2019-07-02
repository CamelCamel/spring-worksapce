package kr.co.jhta.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customer;

public class CustomerDao {

	private SqlMapClientTemplate template;
	
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	public List<Customer> getAllCustomer(){
		return (List<Customer>)template.queryForList("getAllCustomer");
	}
	
	public Customer getCustomerByKeyword(Map<String, Object> map) {
		return (Customer)template.queryForObject("getCustomerByKeyword", map);
	}
	
	public void updateCustomerByNo(Customer customer) {
		template.update("updateCustomerByNo", customer);
	} 
	
	public void deleteCustomerByNo(int no) {
		template.delete("deleteCustomerByNo", no);
	}
	
	public void insertCustomerByNo(Customer customer) {
		template.insert("insertCustomerByNo", customer);
	}
	
	public Customer getCustomerByNo(int no) {
		return (Customer)template.queryForObject("getCustomerByNo", no);
	}
}
