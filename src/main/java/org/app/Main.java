package org.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Init Dependencies
    static EmployeUtil employeUtil = new EmployeUtil();
    static SalaireUtil salaireUtil = new SalaireUtil();
    static EmployeSalaireAnnuelUtil employeSalaireAnnuelUtil = new EmployeSalaireAnnuelUtil();

    public static void main(String[] args) {

        // Initialize employees and salaries
        List<Employe> employees = employeUtil.generateEmployeesList();
        List<Salaire> salaires = salaireUtil.generateSalairesList();


        // Task 1: Construct EmployeSalaireAnnuel list
        List<EmployeSalaireAnnuel> employeSalaireAnnuelList = EmployeSalaireAnnuelUtil.constructEmployeSalaireAnnuelList(employees, salaires);
        employeSalaireAnnuelUtil.displayEmployeSalaireAnnuelList(employeSalaireAnnuelList);

        // Task 2: Find min, max salaries and corresponding employees
        double minSalary = Double.MAX_VALUE;
        double maxSalary = Double.MIN_VALUE;
        EmployeSalaireAnnuel minSalaryEmployee = null;
        EmployeSalaireAnnuel maxSalaryEmployee = null;

        for (EmployeSalaireAnnuel employeSalaireAnnuel : employeSalaireAnnuelList) {
            double salary = employeSalaireAnnuel.getSalaireAnnuel();

            if (salary < minSalary) {
                minSalary = salary;
                minSalaryEmployee = employeSalaireAnnuel;
            }

            if (salary > maxSalary) {
                maxSalary = salary;
                maxSalaryEmployee = employeSalaireAnnuel;
            }
        }

        System.out.println("Minimum Salary: " + minSalary);
        System.out.println("Employee with Minimum Salary: " + minSalaryEmployee.getNom() + " " + minSalaryEmployee.getPrenom());
        System.out.println("Maximum Salary: " + maxSalary);
        System.out.println("Employee with Maximum Salary: " + maxSalaryEmployee.getNom() + " " + maxSalaryEmployee.getPrenom());
    }





}
