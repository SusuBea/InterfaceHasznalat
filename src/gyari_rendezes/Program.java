package gyari_rendezes;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        /* Primitív típusokat tudunk rendezni: */
        String[] nevek = {"Péter", "Xénia", "Pál", "Anna"};
        
        System.out.println("String típusok: ");
        tombKiir("Eredeti:", nevek);
        Arrays.sort(nevek);
        tombKiir("Rendezve:", nevek);
        
        /* A generikus <T> csak osztályra működik, int-re nem */
        //int[] szamok = {3,4,2,1};
        Integer[] szamok = {3,4,2,1};
        System.out.println("int típusok: ");
        tombKiir("Eredeti:", szamok);
        Arrays.sort(szamok);
        tombKiir("Rendezve:", szamok);
        
        System.out.println("Ember típusok: ");
        Ember[] emberek = new Ember[4];
        emberek[0] = new Ember("Peti", 3, "Érd");
        emberek[1] = new Ember("Xénia", 4, "Bp");
        emberek[2] = new Ember("Pál", 2, "Miskolc");
        emberek[3] = new Ember("Anna", 1, "Göd");
        tombKiir("Eredeti (ember):", emberek);
        Arrays.sort(emberek);
        tombKiir("Eredeti (ember --> kor):", emberek);
        //Arrays.sort(emberek, new NevComparator());
        Arrays.sort(emberek, Ember.NevRendezo());
        tombKiir("Eredeti (ember --> név):", emberek);
        
        Arrays.sort(emberek, new Comparator<Ember>() {
            @Override
            public int compare(Ember egyik, Ember masik) {
                Collator coll = Collator.getInstance();
        return coll.compare(egyik.getCim(), masik.getCim());
            }
        });
        tombKiir("Eredeti (ember --> cím):", emberek);
    }

    /* Generikus típus paraméter (ez a <T>) használata: */
    private static <T> void tombKiir(String cim, T[] tomb) {
        System.out.println(cim);
        for (T elem : tomb) {
            System.out.println(elem);
        }
    }
    
    /* Kódduplikálás, de csak a típus tér el! */
//    private static void tombKiir(String cim, String[] tomb) {
//        System.out.println(cim);
//        for (String elem : tomb) {
//            System.out.println(elem);
//        }
//    }
//    
//    private static void tombKiir(String cim, int[] tomb) {
//        System.out.println(cim);
//        for (int elem : tomb) {
//            System.out.println(elem);
//        }
//    }
}
