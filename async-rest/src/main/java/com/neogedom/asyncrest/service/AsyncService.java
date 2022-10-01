package com.neogedom.asyncrest.service;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.neogedom.asyncrest.model.EmployeeAddress;
import com.neogedom.asyncrest.model.EmployeeName;
import com.neogedom.asyncrest.model.EmployeePhone;

@Service
public class AsyncService {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    @Async("asyncExecutor")
    public CompletableFuture<ArrayList<EmployeeName>> getEmployeeName () throws InterruptedException {
        System.out.println("getEmployeeName start");
        ArrayList<EmployeeName> employeeNames = restTemplate().getForObject("http://localhost:8080/name", ArrayList.class);
        System.out.println("employeeName data " + employeeNames);
        Thread.sleep(1000L);
        System.out.println("employeeName completed");
        return CompletableFuture.completedFuture(employeeNames);
    }

    @Async("asyncExecutor")
    public CompletableFuture<ArrayList<EmployeePhone>> getEmployeePhone () throws InterruptedException {
        System.out.println("getEmployeePhone start");
        ArrayList<EmployeePhone> employeePhones = restTemplate().getForObject("http://localhost:8080/phone", ArrayList.class);
        System.out.println("employeePhone data " + employeePhones);
        Thread.sleep(1000L);
        System.out.println("employeePhone completed");
        return CompletableFuture.completedFuture(employeePhones);
    }

    @Async("asyncExecutor")
    public CompletableFuture<ArrayList<EmployeeAddress>> getEmployeeAddress () throws InterruptedException {
        System.out.println("getEmployeeAddress start");
        ArrayList<EmployeeAddress> employeeAddress = restTemplate().getForObject("http://localhost:8080/address", ArrayList.class);
        System.out.println("employeeAddress data " + employeeAddress);
        Thread.sleep(1000L);
        System.out.println("employeeAddress completed");
        return CompletableFuture.completedFuture(employeeAddress);
    }

}
