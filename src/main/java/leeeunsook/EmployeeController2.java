package leeeunsook;


import common.EmployeeDTO;
import leehojun.run.MemberDTO;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class EmployeeController2 {

    private final EmployeeService2 employeeService2;
    private final PrintResult2 printResult2;

    public EmployeeController2(){
        employeeService2 = new EmployeeService2();
        printResult2 = new PrintResult2();
    }
    public void employeeInformation() {
        Scanner scr = new Scanner(System.in);
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("정보를 조회할 사원의 사원번호를 입력해주세요 : ");
        String empId = scr.nextLine();
        Map<String,String> emp = new HashMap<>();
        emp.put("id",empId);
        EmployeeDTO employeeDTO=employeeService2.isEmployee(emp);
        if(employeeDTO!=null){
            System.out.println(employeeDTO);
        }
        else{
            System.out.println("해당하는 사원이 없습니다");
        }

    }
//    public void updateBonus() {
//        Scanner scr = new Scanner(System.in);
//        System.out.println("정보를 수정할 사원의 사원번호를 입력해주세요 : ");
//        String empId = scr.nextLine();
//        if (empId == null){
//            System.out.println("해당하는 사원이 없습니다.");}
//
//        System.out.println("해당 사원의 수정할 보너스 레벨을 입력해주세요 : ");
//        String bonusLevel = scr.nextLine();
//
//        if (){
//        if (bonusLevel?????????????????) {
//            System.out.println("보너스 레벨이 수정되었습니다.");
//        } else {
//            System.out.println("존재하지 않는 보너스레벨입니다.");
//        }}
    }

