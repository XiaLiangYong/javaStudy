package com.example.demo.repository;

import com.example.demo.pojo.Customer;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by alibeibei on 2017/12/11.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findById(Long id);
}
