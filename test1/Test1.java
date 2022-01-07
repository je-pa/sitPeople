package test1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 사람(아름, 성별, 나이) 과
        // 의자(다리수, 색깔, 브랜드)
        // 사람 의자에 앉는행위
        ArrayList<People> peoples = new ArrayList<>();
        ArrayList<Chair> chairs = new ArrayList<>();

        peoples.add(new SimplePeople("지은","여",26));
        chairs.add(new DuoBack(4,"검정"));
        chairs.add(new DuoBack(3,"빨강"));


    }
}
