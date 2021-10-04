package HM5;

import HM5.passenger.Dog;
import HM5.passenger.Human;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.setBusStops(List.of(new String[]{"Добровольського", "Пупка", "Бул. Шевченка", "Коко", "Бубу"}));
        List<Human> humanList = new ArrayList<>();
        Dog dog = new Dog("Манджара");
        humanList.add(new Human("Еля"));
        humanList.add(new Human("Вітя"));
        humanList.add(new Human("Катя"));
        humanList.add(new Human("Олег"));
        humanList.add(new Human("Антон"));

        dog.setHuman(humanList.get(0));

        //головна робота програми
        bus.go();
        bus.addHuman(humanList.get(0));
        bus.go();
        bus.go();
        bus.removeHuman(humanList.get(0));
        for(int i = 1; i < 5; i+= 1){
            bus.addHuman(humanList.get(i));
        }
        bus.go();
        for(int i = 1; i < 5; i+= 1){
            bus.removeHuman(humanList.get(i));
        }
        bus.go();
    }
}
