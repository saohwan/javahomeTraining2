package HongTraining;

public class Random {
    public static void main(String[] args) {
        // 메소드로부터 값을 반환
        int x = rollDie();


        // 결과 출력
        System.out.printf("주사위의 눈: %d", x);
    }

    // 1~6 사이의 임의의 정수를 반환
    public static int rollDie() {

        double r = Math.random() * 6;
        int temp = (int) r;
        return temp + 1;
    }
}

