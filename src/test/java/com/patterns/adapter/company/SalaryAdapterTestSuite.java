package com.patterns.adapter.company;

import com.patterns.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary() {
        // Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        // When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());
        // Then
        System.out.println(totalSalary);
        Assertions.assertEquals(27750, totalSalary, 0);
    }
}
