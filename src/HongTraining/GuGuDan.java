package HongTraining;
//자바 프로그램의 초소 단위! 클래스 생성
public class GuGuDan {
    //프로그램 실행의 시작점! 메인 메소드 작성!
    public static void main(String[] args) {
        printGuGuDan(); // 2단 ~ 9단까지  출력!

    }

    //구구단 출력 메소드!
    public static void printGuGuDan() {
        for (int i = 2; i <= 9; i++) {
            printDan(i);
        }
    }

    // dan 을 출력한다! 예를 들어 dan = 2이면, 2 x 1 = 2, //// 2x9 =18
    public static void printDan(int dan) {
        System.out.printf("%d단\n", dan);

        //반복문을 사용!
        for (int k = 1; k <= 9; k++) {
            System.out.printf("\t"); // 탭 효과 ! 들여쓰기!
            System.out.printf("%d x %d = %d\n", dan, k, dan * k);
        }
    }
}
