package com.sample.aop;


public class EmployeeServiceImpl {

    public void addEmployee(){
        System.out.println("Inside Add employee");
    }

    public int returnAge(){
        return 10;
    }

    public EmployeeBO returnEmployee(){
        final EmployeeBO employeeBO = new EmployeeBO();
        employeeBO.setName("Ramesh");
        employeeBO.setCity("Chennai");
        return employeeBO;
    }

    public void employeeWithArgs(final int i, final String name){

    }

    public int employeeWithException(final int i) throws Exception{
        try{
            final int j=i/0;
        }finally {
            System.out.println("Testing finally in exception");
        }
/*
        if(i == 5){
            throw new Exception();
        }
*/
        return i;
    }

    public void employeeWithAround(){
        System.out.println("Around");
    }


}
