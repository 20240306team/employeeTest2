package leehojun.common;

import common.EmployeeDTO;
import leehojun.run.EmployeeAndSalGrade;
import leehojun.run.GetPhoneNumber;
import leehojun.run.MemberDTO;

import java.util.Map;

public interface EmployeeMapper {
    EmployeeDTO isEmployee(MemberDTO memberDTO);

    GetPhoneNumber getPhoneNumber(Map<String, String> parameter);

    int updateEmpInfo(Map<String, String> parameter);

    int getEntireSal(EmployeeAndSalGrade employeeAndSalGrade);

    EmployeeAndSalGrade getEmployeeAndSalGrade(MemberDTO memberDTO);
}
