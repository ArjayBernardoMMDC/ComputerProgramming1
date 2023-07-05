import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;



public class EmployeeAttendanceRecord {

    private String _attendanceRecordEmployeeNum;
    private String _attendanceRecordLastName;
    private String _attendanceRecordFirstName;
    private String _attendanceRecordDate;
    private String _attendanceRecordTimeIn;
    private String _attendanceRecordTimeOut;
    private String[] _arrayTimeIn;
    private Double _extractedTimeIn;
    private String[] _arrayTimeOut;
    private Double _extractedTimeOut;
    private Double _workedHours;

    public String GetAttendanceRecordEmployeeNum() {
        return _attendanceRecordEmployeeNum;
    };

    public String GetAttendanceRecordLastName() {
        return _attendanceRecordLastName;
    };

    public String GetAttendanceRecordFirstName() {
        return _attendanceRecordFirstName;
    };
    public String GetAttendanceRecordDate() {
        return _attendanceRecordDate;
    };
    public String GetAttendanceRecordTimeIn() {
        return _attendanceRecordTimeIn;
    };
    public String GetAttendanceRecordTimeOut() {
        return _attendanceRecordTimeOut;
    };
    public String[] GetArrayTimeIn() {
        return _arrayTimeIn;
    };
    public Double GetExtractedTimeIn() {
        return _extractedTimeIn;
    };
    public String[] GetArrayTimeOut() {
        return _arrayTimeOut;
    };
    public Double GetExtractedTimeOut() {
        return _extractedTimeOut;
    };
    public Double GetWorkedHours() {
        return _workedHours;
    };
    
    

    public void SetAttendanceRecordEmployeeNum(String AttendanceRecordEmployeeNum) {
        _attendanceRecordEmployeeNum = AttendanceRecordEmployeeNum;
    };
    
    public void SetAttendanceRecordDate(String AttendanceRecordDate) {
    	_attendanceRecordDate = AttendanceRecordDate;
    }

    public void ComputeHoursWorked(String employeeNum, String EnterDate) throws CsvValidationException, IOException {
        String filename = "AttendanceRecord.csv";	
        CSVReader reader = new CSVReader(new FileReader(filename));
        
        
        String[] record;    
        while ((record = reader.readNext()) != null) {
            if (record[0].equals(employeeNum)&& record[3].equals(EnterDate)) 
            
            {
            	_attendanceRecordEmployeeNum = record[0];
            	_attendanceRecordLastName = record[1];
                _attendanceRecordFirstName = record[2];
                _attendanceRecordDate = record[3];
                _attendanceRecordTimeIn = record[4];
                _attendanceRecordTimeOut = record[5];
                
                _arrayTimeIn = record[4].split(":");
                _extractedTimeIn = Double.parseDouble(_arrayTimeIn[0]);
                
                _arrayTimeOut = record[5].split(":");
                _extractedTimeOut = Double.parseDouble(_arrayTimeOut[0]);
           
                _workedHours = _extractedTimeOut - _extractedTimeIn;
                
            }

        }
    }

}