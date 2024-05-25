package lokalisrepo;

public class LokalisRepo {
    public static int[] sorozat = {2, 5, 1, 6, 3};

    public static void main(String[] args) {
        OsszegzesTetele();
    }

    private static void OsszegzesTetele() {
      int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
    }
    
}
