package HongTraining;

public class Trainee {

    public static void main(String[] args) {
        guguDan(); // 2단 ~ 9단까지 출력!
    }
    //출력 메소드
    public static void guguDan() {
        for (int i = 2; i <= 9; i++) {
            xDan(i);
        }
    }

    // xDan 을 출력
    public static void xDan(int dan) {
        System.out.printf("%d단\n", dan);

        //반복문 사용하여 구구단 구현
        for (int k = 1; k <= 9; k++) {
            System.out.println("\t");
            System.out.printf("%d x %d = %d\n", dan, k, dan * k);
        }
    }
}
