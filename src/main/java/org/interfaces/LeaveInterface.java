package org.interfaces;

import org.classes.Employee;

public interface LeaveInterface {
    boolean applyLeave(Employee employee, int noOfDays);
    void getLeaveDetails();
}

