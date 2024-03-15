package leeeunsook;

import java.util.Scanner;

public class Application2 {


    public static void main(String[] args) {

        EmployeeController2 employeeController2 = new EmployeeController2();
        Scanner scr = new Scanner(System.in);

            do {

                System.out.println("관리자 로그인에 성공하였습니다.");
                System.out.println("1. 직원 정보 조회");
                System.out.println("2. 보너스 레벨 수정하기 ");
                System.out.print("메뉴 번호를 입력하세요 : ");
                int no = scr.nextInt();

                switch (no) {
                    case 1 : employeeController2.employeeInformation(); break;
                    case 2 : employeeController2.updateBonus(); break;
                }
            } while (true);

        }
    }

