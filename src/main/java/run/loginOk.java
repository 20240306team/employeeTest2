package run;

import common.EmployeeDTO;

import java.util.Scanner;

public class loginOk {

    public static EmployeeDTO Ok() {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO employeeDTO = new EmployeeDTO();

//        System.out.print("이메일을 입력해주세요 : ");
//        String email = sc.nextLine();
        System.out.print("이름을 입력해주새요 : ");
        String empName = sc.nextLine();
        System.out.print("사번을 입력해주세요 ");
        String empId =  sc.nextLine();
//        employeeDTO.setEmail(email);
        employeeDTO.setEmpName(empName);
        employeeDTO.setEmpId(empId);
    return employeeDTO ;
    }
}
