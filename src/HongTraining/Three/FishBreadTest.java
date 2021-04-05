package HongTraining.Three;

public class FishBreadTest extends Fishbread {
    public FishBreadTest(int n) {
        super(n);
    }

    public static void main(String[] args) {

        // 객체 배열 생성
        Fishbread[] breads = new Fishbread[4];

        // 붕어빵 객체를 팥/고구마/치즈/슈크림 순으로 만드시오

        breads[0] = new Fishbread(0);
        breads[1] = new Fishbread(1);
        breads[2] = new Fishbread(2);
        breads[3] = new Fishbread(3);

        // 모든 붕어빵 객체 정보 출력
        for (int i = 0; i < Fishbread.count;i++) {
            breads[i].print();
        }
        System.out.println("=============");
        // 전체 붕어빵 객체 수를 출력하시오.
        System.out.printf("붕어빵 객체 수: %d", Fishbread.count);
    }
}

