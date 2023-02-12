package  com.simplilearn.medicare.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.medicare.entity.Customer;
import com.simplilearn.medicare.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository repo;
	
	@Override
	public Customer saveCustomer(Customer c) {
		return repo.saveCustomer(c);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.getAllCustomer();
	}

}
