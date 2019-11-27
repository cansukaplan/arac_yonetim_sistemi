public class SeriNumaraUretici {
    private static int bisikletSeriNumara = 1;
    private static int gemiSeriNumara = 1;
    private static int otomobilSeriNumara = 1;
    private static int ucakSeriNumara = 1;
    private static int ucanGemiSeriNumara = 1;

    public String getSeriNumara(Arac arac) {
        String seriNumara = "";
        if (arac instanceof Bisiklet) {
            seriNumara = "bisiklet" + bisikletSeriNumara;
            bisikletSeriNumara++;
        } else if (arac instanceof Gemi) {
            seriNumara = "gemi" + gemiSeriNumara;
            gemiSeriNumara++;
        } else if (arac instanceof Otomobil) {
            seriNumara = "otomobil" + otomobilSeriNumara;
            otomobilSeriNumara++;
        } else if (arac instanceof Ucak) {
            seriNumara = "ucak" + ucakSeriNumara;
            ucakSeriNumara++;
        } else if (arac instanceof UcanGemi) {
            seriNumara = "ucanGemi" + ucanGemiSeriNumara;
            ucanGemiSeriNumara++;
        }
        return seriNumara;
    }
}
