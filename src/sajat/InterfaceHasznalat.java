package sajat;

public class InterfaceHasznalat {

    public static void main(String[] args) {
        Ajto ajto = new Ajto();
        Esernyo esernyo = new Esernyo();
        
        /* Interface típust NEM lehet PÉLDÁNYOSÍTANI: */
        //Kinyithato egyNyithato = new Kinyithato() { }
        
        /* Interface típust létre lehet hoznoi: */
        //Kinyithato[] kinyithatok = new Kinyithato[4];
        //kinyithatok[0] = ajto;
        //kinyithatok[1] = esernyo;
        /* bal oldal legyen az ŐS: */
        Kinyithato egyNyithato = new Ajto();
        
        /* utóddal NEM lehet ősre hivatkozni: */
        //Esernyo e = new Kinyithato();
        
        
        
        Kinyithato[] kinyithatok = {ajto, esernyo, new Laptop(), egyNyithato};
        for (Kinyithato nyithato : kinyithatok) {
            System.out.println(nyithato);
            nyithato.kinyit();
            
            if(nyithato instanceof Laptop)
            {
                //Laptop laptop = (Laptop) nyithato;
                //laptop.bekapcsol();
                
                ((Laptop)nyithato).bekapcsol();
            }
        }
        
    }
    
}
