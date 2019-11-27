public class UcanGemi extends Arac implements HavaTasiti,DenizTasiti {
    public UcanGemi(  String marka, String yakitTuru, int hizi, int yolcuSayisi, int tekerlekSayisi, int fiyati, int uretimYili, String renk) {
        super("ucangemi", marka, yakitTuru, hizi, yolcuSayisi, tekerlekSayisi, fiyati,uretimYili,renk);
    }


    @Override
    public boolean indimi() {
        if (getHizi() == 0) {
            return true;
        }
        return false;
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
        if (indimi()) {
            setHizi(0);
        } else {
            System.out.println("araci once yavaslatmalisiniz, suanki hizi: " + getHizi());
        }
    }
}
