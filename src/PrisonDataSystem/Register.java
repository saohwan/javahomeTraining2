package PrisonDataSystem;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("신규 수감자를 등록하세요: ");
        String name = sc.nextLine();

        System.out.println("수감자의 나이를 등록하세요: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("수감자의 지역 기입하세요: ");
        String area = sc.nextLine();

        System.out.println("수감자의 죄목을 등록하세요: ");
        String aCharge = sc.nextLine();

        System.out.println("수감자의 수감시간을 등록하세요: ");
        int jailTime = sc.nextInt();

        BasicInformation bi = new BasicInformation(name, age, area, aCharge, jailTime);

        System.out.println(bi.toInfo());
    }
}

class BasicInformation {
    //기본 필드
    String name;    //이름
    int age;        //나이
    String area;    //지역
    String aCharge; //죄목
    int jailTime;   //수감시간
    int endJailTime; //끝나는 수감시간

    // 생성자 (초기화까지~)
    BasicInformation(String n, int a, String e, String c, int j) {
        name = n;
        age = a;
        area = e;
        aCharge = c;
        jailTime = j;
    }

    //인스턴스 메소드
    String toInfo() {
        return String.format("**** 수감자 정보 **** \n 이름 : %s \n 나이 : %d \n 지역 : %s \n 죄목 : %s \n 수감시간 : %d \n******************** ", name, age, area ,aCharge,jailTime);
    }
}
