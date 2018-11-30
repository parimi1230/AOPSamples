package com.sample.aop;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopServicesTest {

    public static void main(final String[] args) {
        final ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/applicationContext-aop.xml");
        final AddressServiceImpl addressService = (AddressServiceImpl)applicationContext.getBean("addressServiceImpl");
        addressService.addAddress();
        final EmployeeServiceImpl employeeService = (EmployeeServiceImpl) applicationContext.getBean("employeeService");
        employeeService.addEmployee();
    }

}
