package com.patterns.adapter.company;

import com.patterns.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.patterns.adapter.company.newhrsystem.Employee;
import com.patterns.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employeeList) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employeeList);
    }
}
