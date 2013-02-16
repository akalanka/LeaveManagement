package com.leavemanagement.employeemanagement.service;

import com.leavemanagement.employeemanagement.dao.EmployeeManagementDao;

/**
 * Created with IntelliJ IDEA.
 * User: akalanka
 * Date: 2/16/13
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    private EmployeeManagementDao employeeManagementDao;

    public void setEmployeeManagementDao(EmployeeManagementDao employeeManagementDao) {
        this.employeeManagementDao = employeeManagementDao;
    }
}
