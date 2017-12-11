package com.example.demo;

import com.example.demo.pojo.Customer;
import com.example.demo.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SrpingbootJpaMysqlApplicationTests {
    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void addTest() {
        Customer customer = new Customer();
        customer.setFirstName("xia");
        customer.setLastName("秋天");
        customerRepository.save(customer);
    }

    @Test
    public void findTest() {
        Customer customer = customerRepository.findOne((long) 2);
        System.out.println(customer.toString());
    }

    @Test
    public void findAllTest() {
        List<Customer> customerList = (List<Customer>) customerRepository.findAll();
        System.out.println(customerList.toString());
    }

    @Test
    public void deleteTest() {
        customerRepository.delete((long) 1);
    }

    @Test
    public void deleteAllTest() {
        customerRepository.deleteAll();
    }

    @Test
    public void updateTest() {
        Customer customer = customerRepository.findOne((long) 4);
        customer.setLastName("夏天");
        customer.setFirstName("选");
        customerRepository.save(customer);
    }

    @Test
    public void findCustomerByIdTest() {
        Customer customer = customerRepository.findById((long) 4);
        System.out.println(customer.toString());
    }

}
