package com.bank.bankinterface;

import java.util.List;

import com.bank.pojo.Bank;
import com.bank.pojo.Customer;

public interface CustomerInter {
	
	public List<Customer> getCustomerList();

	public boolean isCustomerExist(Customer customer);

	public Customer saveCustomer(Customer customer);

	public List<Customer> saveCustomerList(List<Customer> Customer);

	public Customer updateCustomer(Customer Customer, int id);

	public void deleteCustomer(int id);

	public boolean disableCustomer(int disable, int id);

}
