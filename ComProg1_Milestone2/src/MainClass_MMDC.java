
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class MainClass_MMDC{

    public static void main(String[] args) throws CsvValidationException, IOException {
        String employeeNum;
        try (Scanner strScanner = new Scanner(System.in)) {
            System.out.println("Enter Employee No.:");
            employeeNum = strScanner.nextLine();
        }
        
        EmployeeData _employeeData = new EmployeeData();
        _employeeData.DisplayEmployeeDetails(employeeNum);
        System.out.println("Employee No.: " + _employeeData.GetEmployeeNum());
        System.out.println("Employee Name: " + _employeeData.GetEmployeeName());
        System.out.println("Birthday: " + _employeeData.GetEmployeeBirthday());
        System.out.println("Phone Number: " + _employeeData.GetEmployeePhoneNum());
        System.out.println("SSS No.: " + _employeeData.GetEmployeeSSS());
        System.out.println("Philhealth No.: " + _employeeData.GetEmployeePhilHealth());
        System.out.println("TIN No.: " + _employeeData.GetEmployeeTIN());
        System.out.println("Pagibig No.: " + _employeeData.GetEmployeePagibig());
        System.out.println("Status: " + _employeeData.GetEmployeeStatus());
        System.out.println("Position: " + _employeeData.GetEmployeePosition());
        System.out.println("Supervisor: " + _employeeData.GetEmployeeSup());
        System.out.println("Basic salary: " + _employeeData.GetEmployeeBasicSalary());
        System.out.println("Rice Subsidy: " + _employeeData.GetEmployeeRiceSubsidy());
        System.out.println("Phone Allowance: " + _employeeData.GetEmployeePhoneAllowance());
        System.out.println("Clothing Allowance: " + _employeeData.GetEmployeeClothingAllowance());
        System.out.println("Gross Semi Monthly: " + _employeeData.GetEmployeeGrossSemiMonthly());
        System.out.println("Hourly Rate: " + _employeeData.GetEmployeeHourly());
    }
}