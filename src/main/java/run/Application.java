package run;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("====================================================================");
            System.out.println("1.로그인"); // 필기 아이디 :이메일  비번은 이름  사번 : 202
            System.out.println("2.회원가입");
            System.out.println("9.프로그램 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int no = sc.nextInt();
            switch (no){
                case 1:
                    if(EmpService.loginsuccess(loginOk.Ok())){
                        Logingogo.success();
                    }else {
                        System.out.println("로그인 다시입력해");
                    }break;


                case 2: break;
                case 9: return;
            }
        }while(true);


    }



}
