package HM5.passenger;

/**
 * Клас для опису пасажира людина
 */
public class Human {
    private final String name;
    private Dog dog;
    private Boolean inBus = false;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
        if(this.dog.getHuman() != this){
            this.dog.setHuman(this);
        }
    }

    public Boolean getInBus() {
        return inBus;
    }

    public void setInBus(Boolean inBus) {
        this.inBus = inBus;
        if(dog != null){
            dog.setInBus(inBus);
        }
    }
}
