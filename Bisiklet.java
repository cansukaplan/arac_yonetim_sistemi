public class Bisiklet extends Arac implements KaraTasiti {
    public Bisiklet(String marka, String yakitTuru, int hizi, int yolcuSayisi, int tekerlekSayisi, int fiyati, int uretimYili, String renk) {
        super("bisiklet", marka, yakitTuru, hizi, yolcuSayisi, tekerlekSayisi, fiyati,uretimYili,renk);
    }


    @Override
    public void hizlandir(int hiz) {
        int suankiHizi = getHizi();
        int yeniHizi = hiz + suankiHizi;
        setHizi(yeniHizi);
    }

    @Override
    public void yavaslat(int hiz) {
        int suankiHizi = getHizi();
        int yeniHizi = suankiHizi - hiz;
        if (yeniHizi < 0) {
            yeniHizi = 0;
        }
        setHizi(yeniHizi);
    }

    @Override
    public void duraklat() {
        setHizi(0);
    }


    @Override
    public boolean motorluTasitmi() {
        return false;
    }
}
