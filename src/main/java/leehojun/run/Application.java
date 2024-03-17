package leehojun.run;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        EmployeeController employeeController = new EmployeeController();
        Scanner scr = new Scanner(System.in);

        do {

            System.out.println("====================================================================");
            System.out.println("1.로그인");
            System.out.println("2.회원가입");
            System.out.println("9.프로그램 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int no = scr.nextInt();
            switch (no){
                case 1:
                    employeeController.login();
                    break;
                case 2:
                    employeeController.getMember();
                    break;
                case 9: return;
            }
        }while(true);


        // pr 템플릿 확인하기
        // pr 템플릿 확인 2
        // 3차
        // pr 템플릿을 해당 공유 레퍼지토리내 .github/pull_request_template.md 를 만드는 거였어
        //내 저장소에 저장하면 자동으로 연동 되는 것 아니었네

    }
}
