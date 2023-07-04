

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class EmployeeData {

    private String _employeeNum;
    private String _employeeName;
    private String _employeeBirthday;
    private String _employeePhoneNum;
    private String _employeeSSS;
    private String _employeePhilHealth;
    private String _employeeTIN;
    private String _employeePagibig;
    private String _employeeStatus;
    private String _employeePosition;
    private String _employeeSup;
    private String _employeeBasicSalary;
    private String _employeeRiceSubsidy;
    private String _employeePhoneAllowance;
    private String _employeeClothingAllowance;
    private String _employeeGrossSemiMonthly;
    private String _employeeHourly;
    private String _employeeTotalAllowances;
    
    

    public String GetEmployeeNum() {
        return _employeeNum;
    };
    public String GetEmployeeName() {
        return _employeeName;
    };
    public String GetEmployeeBirthday() {
        return _employeeBirthday;
    };
    public String GetEmployeePhoneNum() {
        return _employeePhoneNum;
    };
    public String GetEmployeeSSS() {
        return _employeeSSS;
    };
    public String GetEmployeePhilHealth() {
        return _employeePhilHealth;
    };
    public String GetEmployeeTIN() {
        return _employeeTIN;
    };
    public String GetEmployeePagibig() {
        return _employeePagibig;
    };
    public String GetEmployeeStatus() {
        return _employeeStatus;
    };
    public String GetEmployeePosition() {
        return _employeePosition;
    };
    public String GetEmployeeSup() {
        return _employeeSup;
    };
    public String GetEmployeeBasicSalary() {
        return _employeeBasicSalary;
    };
    public String GetEmployeeRiceSubsidy() {
        return _employeeRiceSubsidy;
    };
    public String GetEmployeePhoneAllowance() {
        return _employeePhoneAllowance;
    };
    public String GetEmployeeClothingAllowance() {
        return _employeeClothingAllowance;
    };
    public String GetEmployeeGrossSemiMonthly() {
        return _employeeGrossSemiMonthly;
    };
    public String GetEmployeeHourly() {
        return _employeeHourly;
    };
    public String GetEmployeeTotalAllowances() {
        return _employeeTotalAllowances;
    };
    
    
    public void SetEmployeeStatus(String EmployeeStatus) {
        _employeeStatus = EmployeeStatus;
    }
    public void SetEmployeePosition(String EmployeePosition) {
        _employeePosition = EmployeePosition;
    }
    public void SetEmployeeSup(String EmployeeSup) {
        _employeeSup = EmployeeSup;
    }
    public void SetEmployeeBasicSalary(String EmployeeBasicSalary) {
        _employeeBasicSalary = EmployeeBasicSalary;
    }
    public void SetEmployeeRiceSubsidy(String EmployeeRiceSubsidy) {
        _employeeRiceSubsidy = EmployeeRiceSubsidy;
    }
    public void SetEmployeePhoneAllowance(String EmployeePhoneAllowance) {
        _employeePhoneAllowance = EmployeePhoneAllowance;
    }
    public void SetEmployeeClothingAllowance(String EmployeeClothingAllowance) {
        _employeeClothingAllowance = EmployeeClothingAllowance;
    }
    public void SetEmployeeGrossSemiMonthly(String EmployeeGrossSemiMonthly) {
        _employeeBasicSalary = EmployeeGrossSemiMonthly;
    }
    public void SetEmployeeHourly(String EmployeeHourly) {
        _employeeHourly = EmployeeHourly;
    }
    public void SetEmployeeNum(String EmployeeNum) {
        _employeeNum = EmployeeNum;
    };

    public void SetEmployeeName(String EmployeeName) {
        _employeeName = EmployeeName;
    }

    public void SetEmployeeBirthday(String EmployeeBirthday) {
        _employeeBirthday = EmployeeBirthday;
    }
    public void SetEmployeePhoneNum(String EmployeePhoneNum) {
        _employeePhoneNum = EmployeePhoneNum;
    }
    public void SetEmployeeSSS(String EmployeeSSS) {
        _employeeSSS = EmployeeSSS;
    }
    public void SetEmployeePhilHealth(String EmployeePhilHealth) {
        _employeePhilHealth = EmployeePhilHealth;
    }
    public void SetEmployeeTIN(String EmployeeTIN) {
        _employeeTIN = EmployeeTIN;
    }
    public void SetEmployeePagibig(String EmployeePagibig) {
        _employeePagibig = EmployeePagibig;
    }

    

    public void DisplayEmployeeDetails(String EmployeeNum) throws CsvValidationException, IOException {
        String filename = "EmployeeList.csv";
        CSVReader reader = new CSVReader(new FileReader(filename));

        String[] record;
        
        while ((record = reader.readNext()) != null) {
            if (record[0].equals(EmployeeNum)) {
            	
            	_employeeNum=record[0];
            	_employeeName=record[2]+" "+ record[1];
            	_employeeBirthday=record[3];
            	_employeePhoneNum=record[5];
            	_employeeSSS=record[6];
            	_employeePhilHealth=record[7];
            	_employeeTIN=record[8];
            	_employeePagibig=record[9];
            	_employeeStatus=record[10];
            	_employeePosition=record[11];
            	_employeeSup=record[12];
            	_employeeBasicSalary=record[13];
      
            	_employeeRiceSubsidy=record[14];
            	_employeePhoneAllowance=record[15];
            	_employeeClothingAllowance=record[16];
            	_employeeGrossSemiMonthly=record[17];
            	_employeeHourly=record[18];
            	
     

            }

        }
    }

}
