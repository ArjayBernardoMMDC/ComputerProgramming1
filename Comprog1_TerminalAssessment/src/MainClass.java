import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class MainClass{

    public static void main(String[] args) throws CsvValidationException, IOException {
        String employeeNum;
                try (Scanner strScanner = new Scanner(System.in);
						Scanner dblScanner = new Scanner(System.in)) {
					System.out.println("Enter Employee No. (ex: 10001):");
         employeeNum = strScanner.nextLine();
         System.out.println("Enter Date in the format 'mm/dd/yyyy' (ex:02/09/2022):");
         String EnterDate = dblScanner.nextLine();
      
      EmployeeAttendanceRecord _employeeAttendanceRecord = new EmployeeAttendanceRecord();
      _employeeAttendanceRecord.ComputeHoursWorked(employeeNum, EnterDate);
      System.out.println("Employee No.: " + _employeeAttendanceRecord.GetAttendanceRecordEmployeeNum());
      System.out.println("Employee Name:" + _employeeAttendanceRecord.GetAttendanceRecordFirstName()+" "+ _employeeAttendanceRecord.GetAttendanceRecordLastName());
      System.out.println("Time In: " + _employeeAttendanceRecord.GetAttendanceRecordTimeIn());
      System.out.println("Time Out: " + _employeeAttendanceRecord.GetAttendanceRecordTimeOut());
      System.out.println();
      _employeeAttendanceRecord.SetAttendanceRecordEmployeeNum(employeeNum);
      _employeeAttendanceRecord.SetAttendanceRecordDate(EnterDate);
      _employeeAttendanceRecord.ComputeHoursWorked(employeeNum, EnterDate);
      System.out.println("Converted Time In: " + _employeeAttendanceRecord.GetExtractedTimeIn());
      System.out.println("Converted Time Out: " + _employeeAttendanceRecord.GetExtractedTimeOut());
      System.out.println("Worked Hours: " + _employeeAttendanceRecord.GetWorkedHours());
				}
        
    }
}