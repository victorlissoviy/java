package lesson6.comps;

public class Comp {
    protected final String name;

    public Comp(String name) {
        System.out.println("Створення Comp " + name);
        this.name = name;
    }

    public Comp(){
        this.name = "Пусто";
        System.out.println("Створення Comp " + name);
    }

    public String getName() {
        return name;
    }

    public void on(){
        System.out.println("Комп'ютер " + name + " вмикається");
    }
    public void load(){
        System.out.println("Комп'ютер " + name + " завантажується");
    }
    public void off(){
        System.out.println("Комп'ютер " + name + " вимикається");
    }
}
