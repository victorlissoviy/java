package HM5.passenger;

/**
 * Клас для опису пасажира Собака
 */
public class Dog {
    private final String name;
    private Human human;
    private Boolean inBus = false;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
        if(this.human.getDog() != this){
            this.human.setDog(this);
        }
    }

    public Boolean getInBus() {
        return inBus;
    }

    public Boolean setInBus(Boolean inBus) {
        if(human == null){
            System.out.println("Собака не може бути в автобусі без людини");
            return false;
        }else{
            this.inBus = inBus;
            return true;
        }
    }
}
