package com.leavemanagement.employeemanagement.action;

import com.leavemanagement.base.action.BaseStruts2Action;
import com.leavemanagement.employeemanagement.domain.Employee;
import com.leavemanagement.employeemanagement.service.EmployeeManagementService;

/**
 * Created with IntelliJ IDEA.
 * User: akalanka
 * Date: 2/16/13
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeManagementAction extends BaseStruts2Action {

    private Employee employee = new Employee();
    private EmployeeManagementService employeeManagementService;

    public void setEmployeeManagementService(EmployeeManagementService employeeManagementService) {
        this.employeeManagementService = employeeManagementService;
    }

    @Override
    public Object getModel() {
        return employee;
    }

    public String showEmployeePage() {
        return "success";
    }

    public String showLoginPage() {
        return "success";
    }

    public String addEmployee() {
//        employee.setCreatedDate(new Date());
//        employeeManagementService.addEmployee(employee);
//
//        employees = null;
//        employees = employeeService.listEmployees();

        return "success";
    }

    public String listEmployees() {
//        employees = employeeService.listEmployees();

        return "success";
    }
}
