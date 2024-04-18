package gyari_rendezes;

public class Ember implements Comparable<Ember>{
    private String nev;
    private int kor;
    private String cim;

    public static NevComparator NevRendezo(){
        return new NevComparator();
    }
    
    public Ember(String nev, int kor, String cim) {
        this.nev = nev;
        this.kor = kor;
        this.cim = cim;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", kor=" + kor + ", cim=" + cim + '}';
    }

    /* Ha nincs generikus típus paraméter (itt <Ember>): */
//    @Override
//    public int compareTo(Object o) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @Override
    public int compareTo(Ember masik) {
        //1. eset egészekre: 
//        if(this.kor < masik.kor){
//            return -1;
//        }else if(this.kor > masik.kor){
//            return 1;
//        }else{
//            return 0;
//        }
        
        //2. eset egészekre: 
        return this.kor - masik.kor;
    }
    
    
}
