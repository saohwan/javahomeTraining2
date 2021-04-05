package HongTraining.Three;

public class HeroTest {

    public static void main(String[] args) {
        //객체 생성
        Hero thor = new Hero("토르", 150);
        Hero thanos = new Hero("타노스", 160);
        //토르의 펀치 -> 타노스
        thor.punch(thanos);
        thanos.punch(thor);
        thanos.punch(thor);



    }
}

class Hero {
    //필드
    String name;
    int hp;

    //생성자
    Hero(String s, int i) {
        name = s;
        hp = i;
    }
    //메소드
    void punch(Hero enemy) {
        //때린 주체 객체

        System.out.printf("[%s]의 펀치!!", name);
        System.out.printf(" %s의 HP: %d - >",enemy.name, enemy.hp);
        enemy.hp -= 10;
        System.out.printf("%d\n", enemy.hp);


    }
}