package lesson6;

import lesson6.comps.Comp;
import lesson6.comps.Noyt;

public class Main {
    public static void main(String[] args) {
        Comp comp = new Comp("Комп 1");
        loads(comp);

        System.out.println("-------------------------");

        Noyt noyt = new Noyt("Ноут 1");
        loads(noyt);
    }

    public static void loads(Comp comp){
        comp.on();
        if(comp instanceof Noyt){
            Noyt np = (Noyt) comp;
            np.charge();
        }
        comp.load();
        comp.off();
    }
}

