package leehojun.run;

import common.EmployeeDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeController {
    private final EmployeeService employeeService;
    private final PrintResult printResult;

    public EmployeeController() {
        employeeService = new EmployeeService();
        printResult = new PrintResult();
    }

    public void getMember() {
        Scanner scr = new Scanner(System.in);
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("============================================================");
        System.out.print("이름을 적으세요 : ");
        String name = scr.nextLine();
        System.out.print("email을 적으세요 : ");
        String email = scr.nextLine();
        System.out.print("사원번호 : ");
        String empId = scr.nextLine();
        memberDTO.setName(name);
        memberDTO.setEmail(email);
        memberDTO.setEmpId(empId);
        if (isEmployee(memberDTO)) {

            System.out.print("아이디를 적으세요 : ");
            String logId = scr.nextLine();
            System.out.print("비밀번호를 적으세요 : ");
            String logPass = scr.nextLine();

            memberDTO.setLogId(logId);
            memberDTO.setLogPass(logPass);

            System.out.println("회원가입 성공");

        } else {
            System.out.println("회사사람이 아니군요 회원가입이 불가합니다");
        }


    }

    private boolean isEmployee(MemberDTO memberDTO) {
        return employeeService.isEmployee(memberDTO);
    }

    public void login() {

        Scanner scr = new Scanner(System.in);
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("============================================================");
        System.out.print("이름을 적으세요 : ");
        String name = scr.nextLine();
        System.out.print("email을 적으세요 : ");
        String email = scr.nextLine();
        System.out.print("사원번호 : ");
        String empId = scr.nextLine();
        memberDTO.setName(name);
        memberDTO.setEmail(email);
        memberDTO.setEmpId(empId);
        do {


            if (isEmployee(memberDTO)) {
                System.out.println("==========================================================");
                System.out.println("1. 사원명으로 전화번호 조회하기");
                System.out.println("2. 내연봉 확인하기");
                System.out.println("3. 내정보 변경하기");
                System.out.println("9. 이전 메뉴로 돌아가기");
                System.out.print("메뉴를 선택하세요 : ");
                int no = scr.nextInt();
                switch (no) {
                    case 1:
                        GetPhoneNumber phonenumber = employeeService.getPhoneNumber(inputName());
                        printResult.printOnePerson(phonenumber);
                        break;
                    case 2:
                        EmployeeDTO emp = new EmployeeDTO();
                        printResult.printSalary(emp);
                        break;
                    case 3:
                        if(employeeService.updateEmpInfo(inputEmpInfo(memberDTO))) {
                            System.out.println("등록 성공");
                        }else{
                            System.out.println("등록 실패");
                        }
                        break;
                    case 9:
                        return;
                }
            }
        } while (true);


    }

    private Map<String,String> inputEmpInfo(MemberDTO memberDTO) {
        Scanner scr = new Scanner(System.in);
        Map<String,String> parameter = new HashMap<>();


        System.out.println("1. email 변경");
        System.out.println("2. 핸드폰 변경");
        System.out.println("3. 둘다 변경");
            System.out.println("9. 이전메뉴로 돌아가기");
        int no = scr.nextInt();
        parameter.put("empId",memberDTO.getEmpId());
        switch (no){
            case 1 :
                System.out.print("변경할 email 을 적으세오 : ");
                scr.nextLine();
                String email = scr.nextLine();
                parameter.put("email",email);
                break;
            case 2:
                System.out.println("변경할 핸드폰번호를 '-'없이 적으시오 : ");
                String phone = scr.nextLine();
                parameter.put("phone",phone);
                break;
            case 3 :
                System.out.print("변경할 email 을 적으세오 : ");
                email = scr.nextLine();
                System.out.println("변경할 핸드폰번호를 '-'없이 적으시오 : ");
                phone = scr.nextLine();
                parameter.put("email",email);
                parameter.put("phone",phone);
                break;



        }


        return parameter;
    }

    private Map<String, String> inputName() {
        Scanner scr = new Scanner(System.in);
        Map<String, String> parameter = new HashMap<>();
        System.out.print("검색할 사원 명을 적으시오");
        String name = scr.nextLine();
        parameter.put("name", name);
        return parameter;
    }
}
