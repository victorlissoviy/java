package HM5;

import HM5.passenger.Dog;
import HM5.passenger.Human;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для роботи руху автобуса
 */
public class Bus {
    private final List<Human> humans;
    private final List<Dog> dogs;
    private List<String> busStops;
    private int numberStop;

    public Bus() {
        humans = new ArrayList<>();
        dogs = new ArrayList<>();
        busStops = new ArrayList<>();
        numberStop = 0;
    }

    public void addHuman(Human human){
        human.setInBus(true);
        this.humans.add(human);
        if(human.getDog() != null){
            addDog(human.getDog());
        }
    }

    public void removeHuman(Human human){
        if(this.humans.contains(human)){
            this.humans.remove(human);
            human.setInBus(false);
            if(human.getDog() != null){
                dogs.remove(human.getDog());
            }
        }else{
            System.out.println("Такої людини в автобусі нема");
        }
    }

    public void addDog(Dog dog){
        if(dog.setInBus(true)){
            this.dogs.add(dog);
        }
    }

    public void addBusStop(String name){
        this.busStops.add(name);
    }

    public int getNumberStop() {
        return numberStop;
    }

    public void setBusStops(List<String> busStops) {
        this.busStops = busStops;
    }

    /**
     * Функція руху автобусу по зупинкам
     */
    public void go(){
        System.out.println("Номер зупинки: " + (numberStop + 1));
        System.out.println("Назва зупинки: " + busStops.get(numberStop));
        System.out.println("Кількість пасажирів: " + humans.size());
        for (Human h : humans) {
            System.out.println(h.getName());
        }
        System.out.println("Серед них із собакою: " + dogs.size());
        for(Dog d : dogs){
            System.out.println(d.getName() + " власник: " + d.getHuman().getName());
        }
        System.out.println("############################################");
        numberStop += 1;
        if(numberStop >= busStops.size()){
            System.out.println("Нове коло");
            System.out.println("############################################");
            numberStop = 0;
        }
    }
}
