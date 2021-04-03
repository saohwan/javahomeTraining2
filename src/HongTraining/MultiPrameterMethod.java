package HongTraining;

class MultiParameterMethod {
    // 프로그램 실행의 시작점!
    public static void main(String[] args) {
        // 변수 생성
        double r = 7.0;
        double h = 5.0;

        // 부피 계산
        double v = volume(r, h);

        // 결과 출력
        System.out.printf("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피: %.1f", r, h, v);
    }

    // 반지름과 높이를 입력받아 원기둥의 부피를 반환
    public static double volume(double a, double b) {

        return Math.PI * a * a * b;
    }
}
