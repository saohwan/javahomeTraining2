package HongTraining.Three;

class Fishbread {
    // 인스턴스 변수 non-static필드
    String contents;
    // 클래스 변수 static 필드
    static int count; //붕어빵 객체 수

    // 생성자
    public Fishbread(int n) {
        // 내용물 선택 - 0: 팥, 1: 고구마, 2: 치즈, 3: 슈크림
        String[] arr = {"팥", "고구마", "치즈", "슈크림"};
        contents = arr[n];

        // 붕어빵 객체 수 카운팅팅
        Fishbread.count++;
    }

    //메소드
    void print() {
        System.out.printf("[%s] 붕어빵\n", contents);
    }
}

