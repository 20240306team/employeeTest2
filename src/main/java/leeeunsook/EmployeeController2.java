package leeeunsook;


import common.EmployeeDTO;
import leehojun.run.MemberDTO;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class EmployeeController2 {

    private final EmployeeService2 employeeService2;
    private final PrintResult2 printResult2;

    public EmployeeController2() {
        employeeService2 = new EmployeeService2();
        printResult2 = new PrintResult2();
    }

    public void employeeInformation() {
        Scanner scr = new Scanner(System.in);
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("정보를 조회할 사원의 사원번호를 입력해주세요 : ");
        String empId = scr.nextLine();
        Map<String, String> emp = new HashMap<>();
        emp.put("id", empId);
        EmployeeDTO employeeDTO = employeeService2.isEmployee(emp);
        if (employeeDTO != null) {
            System.out.println(employeeDTO);
        } else {
            System.out.println("해당하는 사원이 없습니다");
        }

    }

    public void updateBonus() {
        Scanner sc = new Scanner(System.in);
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("정보를 수정할 사원의 사원번호를 입력해주세요 : ");
        String empId = sc.nextLine();
        Map<String, String> emp = new HashMap<>();
        emp.put("id", empId);
        EmployeeDTO employeeDTO = employeeService2.isEmployee(emp);
        if (employeeDTO != null) {
            System.out.println("입력한 해당 사원의 정보를 수정하겠습니다.");
            System.out.println(" 수정할 샐러리레벨을 적어주세요(S1-S7) : ");
            String salLevel = sc.nextLine();
            emp.put("salLevel", salLevel);
            if(employeeService2.salLevel(emp)){
                System.out.println("셀러리레벨을 수정하였습니다.");
            }else{
                System.out.println("없는 정보를 입력하셔서 수정이 불가합니다.");
            }
                    } else {
            System.out.println("해당하는 사원이 없습니다");
        }


    }
}
