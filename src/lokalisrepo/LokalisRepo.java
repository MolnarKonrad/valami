package lokalisrepo;

public class LokalisRepo {
    public static int[] sorozat = {2, 5, 1, 6, 3};
    public static int osszeg;

    public static void main(String[] args) {
        OsszegzesTetele();
        Megszamlalas();
    }

    private static void OsszegzesTetele() {
      int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
      Kiiras("a sorozat összege: " + osszeg + "\n\n");
    }

    private static void Kiiras(String eredmeny) {
        System.out.print(eredmeny);
    }

    private static void Megszamlalas() {
        
    }
    
}
