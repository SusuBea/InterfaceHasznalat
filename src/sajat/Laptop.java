package sajat;

public class Laptop implements Kinyithato, Bekapcsolhato{

    @Override
    public void kinyit() {
        System.out.println("Laptop kinyitása...");
    }

    @Override
    public void bekapcsol() {
        System.out.println("Laptop bekapcsolása...");
    }
    
}
