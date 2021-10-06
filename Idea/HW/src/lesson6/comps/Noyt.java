package lesson6.comps;

public class Noyt extends Comp {
    protected final String name;

    public Noyt(String name) {
        super(name);
        System.out.println("Створення Noyt " + name);
        this.name = name;
    }

    public Noyt() {
        this.name = "Пусто";
        System.out.println("Створення Noyt " + name);
    }

    @Override
    public void on() {
        System.out.println("Ноутбук " + name + " вмикається");
    }

    public void charge(){
        System.out.println("Ноутбук " + name + " заряджається");
    }
}
