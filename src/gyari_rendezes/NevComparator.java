package gyari_rendezes;

import java.text.Collator;
import java.util.Comparator;

public class NevComparator implements Comparator<Ember>{

    @Override
    public int compare(Ember egyik, Ember masik) {
        /* ékezet nem jó: */
        //return egyik.getNev().compareTo(masik.getNev());
        
        /* magyar ékezethez: */
        Collator coll = Collator.getInstance();
        return coll.compare(egyik.getNev(), masik.getNev());
    }
    
}
