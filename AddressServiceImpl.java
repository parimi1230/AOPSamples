package com.sample.aop;


/**
 * AOP - Aspect Oriented Programming
 *
 * Aspect: - Logging functionality -
 *
 * PointCut - It an expression
 *
 * Advice - When pointcut is met what functionality it should perform
 *
 * JoinPoint -  Its a class , it will have method signatures.
 *
 * Weaving :
 *
 */


public class AddressServiceImpl {

    public void addAddress(){
        System.out.println("Address is added");
    }

    public void deleteAddress(){
        System.out.println("Address is added");
    }

    public void updateAddress(){
        System.out.println("Address is added");
    }

    public void truncateAddress(){
        System.out.println("Address is added");
    }


}
