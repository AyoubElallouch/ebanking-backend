package com.elallouch.ebankingbackend.mappers;

import com.elallouch.ebankingbackend.dtos.CustomerDTO;
import com.elallouch.ebankingbackend.entities.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapperImp {
    public CustomerDTO fromCustomer(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();

        BeanUtils.copyProperties(customer, customerDTO);

        return customerDTO;
    }
    public Customer fromCustomerDTO(CustomerDTO customerDTO){
        Customer customer = new Customer();

        BeanUtils.copyProperties(customerDTO, customer);

        return customer;
    }
}
