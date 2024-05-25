package lokalisrepo;

public class LokalisRepo {
    public static int[] sorozat = {2, 5, 1, 6, 3};

    public static void main(String[] args) {
        OsszegzesTetele();
        Kiiras();
    }

    private static void OsszegzesTetele() {
      int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
    }

    private static void Kiiras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
