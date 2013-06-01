package com.leavemanagement.leaverequestmanagement.domain;

import javax.persistence.Entity;

import com.leavemanagement.employeemanagement.domain.Employee;
import com.leavemanagement.types.LeaveType;

/**
 * Created with IntelliJ IDEA.
 * User: akalanka
 * Date: 6/1/13
 * Time: 9:27 AM
*/

@Entity
public class LeaveRequest {

    private Long leaveRequestId;
    private Employee leaveRequester;
    private LeaveType leaveType;
}
