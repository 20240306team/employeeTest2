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
}
