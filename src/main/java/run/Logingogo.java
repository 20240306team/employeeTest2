package run;

import java.util.Scanner;

public class Logingogo {


    public static void success() {

        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("================================");
        System.out.println("기능을 선택해주세요 :");
        System.out.println("1. 내정보 조회하기 ");
        System.out.println("2. 내정보 변경 ");
        System.out.println("로그아웃");
        System.out.print("입력  :   ");
        int no = sc.nextInt();
        switch (no){
            case 1: loginOk.serch();
        }

        }while (true);
    }
}
