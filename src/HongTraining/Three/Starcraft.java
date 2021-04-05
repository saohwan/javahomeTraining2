package HongTraining.Three;

public class Starcraft {
    public static void main(String[] args) {

        Marine ma = new Marine("마린", 150);
        Medic me = new Medic("메딕", 150, 100);
        Scv scv = new Scv("일꾼", 70);

        me.hill(ma);

    }
}

class Marine {
    String name;
    int hp;

    Marine (String s, int i) {
        name = s;
        hp = i;
    }

}
class Scv {
    String name;
    int hp;

    Scv (String s, int i) {
        name = s;
        hp = i;
    }
}

class Medic {
    String name;
    int hp;
    int mp;

    Medic (String s, int i, int i2) {
        name = s;
        hp = i;
        mp = i2;
    }

    void hill (Marine target) {
        System.out.printf("[%s]의 치유! => [%s]님의 체력증가 : %d => ",name, target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d\n",target.hp);
    }
}
