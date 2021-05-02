package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager() {
		
	}
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Success");
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
}
