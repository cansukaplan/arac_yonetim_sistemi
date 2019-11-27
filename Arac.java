import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class Arac {
    String id;
    private String marka;
    private String yakitTuru;
    private int hizi;
    private int yolcuSayisi;
    private int tekerlekSayisi;
    private int fiyati;
    private String aracTipi;
    private int uretimYili;
    private String renk;

    public Arac(String aracTipi, String marka, String yakitTuru, int hizi, int yolcuSayisi, int tekerlekSayisi, int fiyati, int uretimYili, String renk) {
        this.marka = marka;
        this.yakitTuru = yakitTuru;
        this.hizi = hizi;
        this.yolcuSayisi = yolcuSayisi;
        this.tekerlekSayisi = tekerlekSayisi;
        this.fiyati = fiyati;
        this.aracTipi = aracTipi;
        this.uretimYili = uretimYili;
        this.renk = renk;
        setId();
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getHizi() {
        return hizi;
    }

    public void setHizi(int hizi) {
        this.hizi = hizi;
    }

    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    public int getFiyati() {
        return fiyati;
    }

    public void setFiyati(int fiyati) {
        this.fiyati = fiyati;
    }

    public String getAracTipi() {
        return aracTipi;
    }

    public void setAracTipi(String aracTipi) {
        this.aracTipi = aracTipi;
    }

    public String getId() {
        return id;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setId() {
        SeriNumaraUretici seriNumaraUretici = new SeriNumaraUretici();
        id = seriNumaraUretici.getSeriNumara(this);
    }


    /**
     * aldigi arac listesini dosyaya yazar
     */
    public void araclariDosyayaYaz(List<Arac> araclar) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("AracKayit.txt", false));
            for (Arac arac : araclar) {
                writer.write(arac.aracTipi + "," +
                        arac.marka + "," +
                        arac.yakitTuru + "," +
                        arac.hizi + "," +
                        arac.yolcuSayisi + "," +
                        arac.tekerlekSayisi + "," +
                        arac.fiyati + "," +
                        arac.uretimYili + "," +
                        arac.renk
                        + "\n"
                );

            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
