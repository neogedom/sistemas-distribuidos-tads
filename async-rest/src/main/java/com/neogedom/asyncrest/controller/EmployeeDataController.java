package com.neogedom.asyncrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neogedom.asyncrest.model.EmployeeAddress;
import com.neogedom.asyncrest.model.EmployeeName;
import com.neogedom.asyncrest.model.EmployeePhone;

@RestController
public class EmployeeDataController {

    @GetMapping(value = "/address")
    public List<EmployeeAddress> getAddresses() {
        System.out.println("getAddress start");
        List<EmployeeAddress> employeeAdressList = new ArrayList<>();

        EmployeeAddress employeeAddress1 = new EmployeeAddress("Rua 7", "1980", "Centro", "Três Lagoas", "MS");
        EmployeeAddress employeeAddress2 = new EmployeeAddress("Rua 10", "1000", "Vila Zuque", "Três Lagoas", "MS");

        employeeAdressList.add(employeeAddress1);
        employeeAdressList.add(employeeAddress2);

        return employeeAdressList;
    }

    @GetMapping(value = "/phone")
    public List<EmployeePhone> getPhones() {
        System.out.println("getPhones start");
        List<EmployeePhone> employeePhoneList = new ArrayList<>();

        EmployeePhone employeePhone1 = new EmployeePhone("99 99999999");
        EmployeePhone employeePhone2 = new EmployeePhone("11 1111111");

        employeePhoneList.add(employeePhone1);
        employeePhoneList.add(employeePhone2);

        return employeePhoneList;
    }

    @GetMapping(value = "/name")
    public List<EmployeeName> getNames() {
        System.out.println("getNames start");
        List<EmployeeName> employeeNameList = new ArrayList<>();

        EmployeeName employeeName1 = new EmployeeName("Vinícius");
        EmployeeName employeeName2 = new EmployeeName("Gomes");

        employeeNameList.add(employeeName1);
        employeeNameList.add(employeeName2);

        return employeeNameList;
    }
}