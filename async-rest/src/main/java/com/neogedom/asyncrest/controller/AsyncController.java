package com.neogedom.asyncrest.controller;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neogedom.asyncrest.model.EmployeeAddress;
import com.neogedom.asyncrest.model.EmployeeName;
import com.neogedom.asyncrest.model.EmployeePhone;
import com.neogedom.asyncrest.service.AsyncService;

@RestController
public class AsyncController {

  @Autowired
  private AsyncService service;

  @GetMapping(value = "/testAsynch")
  public void testAsynch() throws InterruptedException, ExecutionException 
  {
 
    CompletableFuture<ArrayList<EmployeeAddress>> employeeAddress = service.getEmployeeAddress();
    CompletableFuture<ArrayList<EmployeeName>> employeeName = service.getEmployeeName();
    CompletableFuture<ArrayList<EmployeePhone>> employeePhone = service.getEmployeePhone();
 
    CompletableFuture.allOf(employeeAddress, employeeName, employeePhone).join();
     
  }
}