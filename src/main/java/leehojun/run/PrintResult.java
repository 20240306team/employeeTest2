package leehojun.run;

import common.EmployeeDTO;

public class PrintResult {
    public void printOnePerson(GetPhoneNumber phone) {
        if(phone!=null){
            System.out.println(phone);
        }else{
            System.out.println("없는 사원입니다 다시 입력하세요");
        }
    }


    public void success(boolean b) {
        if(b){
            System.out.println("수정 성공");
        }
        else{
            System.out.println("수정 실패");
        }
    }

    public void printSal(EmployeeAndSalGrade employeeAndSalGrade) {

        int sal =(int)(employeeAndSalGrade.getSalary()*(1+employeeAndSalGrade.getBonus()));
        sal = Math.min(sal,employeeAndSalGrade.getMaxSal());
        sal = employeeAndSalGrade.getSalary()*11+sal;

        System.out.println(employeeAndSalGrade.getName()+"님의 연봉은 "+sal+"원 입니다");



    }
}
