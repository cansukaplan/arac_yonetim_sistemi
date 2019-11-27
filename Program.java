import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        List<Arac> araclar = new ArrayList<>();

        try {

            File f = new File("AracKayit.txt");
            if (f.exists()) {//daha önceden dosyaya biseyler kaydedilmis olabilir
                SeriNumaraUretici seriNumaraUretici = new SeriNumaraUretici();
                BufferedReader b = new BufferedReader(new FileReader(f));
                String okunanSatir = "";

                while ((okunanSatir = b.readLine()) != null) {
                    Arac arac = null;
                    String[] aracOzellikleri = okunanSatir.split(",");
                    if (okunanSatir.startsWith("bisiklet")) {
                        arac = new Bisiklet(aracOzellikleri[1], aracOzellikleri[2]
                                , Integer.parseInt(aracOzellikleri[3])
                                , Integer.parseInt(aracOzellikleri[4])
                                , Integer.parseInt(aracOzellikleri[5])
                                , Integer.parseInt(aracOzellikleri[6])
                                , Integer.parseInt(aracOzellikleri[7])
                                , aracOzellikleri[8]
                        );
                    } else if (okunanSatir.startsWith("gemi")) {
                        arac = new Gemi(aracOzellikleri[1], aracOzellikleri[2]
                                , Integer.parseInt(aracOzellikleri[3])
                                , Integer.parseInt(aracOzellikleri[4])
                                , Integer.parseInt(aracOzellikleri[5])
                                , Integer.parseInt(aracOzellikleri[6])
                                , Integer.parseInt(aracOzellikleri[7])
                                , aracOzellikleri[8]
                        );
                    } else if (okunanSatir.startsWith("otomobil")) {
                        arac = new Otomobil(aracOzellikleri[1], aracOzellikleri[2]
                                , Integer.parseInt(aracOzellikleri[3])
                                , Integer.parseInt(aracOzellikleri[4])
                                , Integer.parseInt(aracOzellikleri[5])
                                , Integer.parseInt(aracOzellikleri[6])
                                , Integer.parseInt(aracOzellikleri[7])
                                , aracOzellikleri[8]
                        );
                    } else if (okunanSatir.startsWith("ucak")) {
                        arac = new Ucak(aracOzellikleri[1], aracOzellikleri[2]
                                , Integer.parseInt(aracOzellikleri[3])
                                , Integer.parseInt(aracOzellikleri[4])
                                , Integer.parseInt(aracOzellikleri[5])
                                , Integer.parseInt(aracOzellikleri[6])
                                , Integer.parseInt(aracOzellikleri[7])
                                , aracOzellikleri[8]
                        );
                    } else if (okunanSatir.startsWith("ucangemi")) {
                        arac = new UcanGemi(aracOzellikleri[1], aracOzellikleri[2]
                                , Integer.parseInt(aracOzellikleri[3])
                                , Integer.parseInt(aracOzellikleri[4])
                                , Integer.parseInt(aracOzellikleri[5])
                                , Integer.parseInt(aracOzellikleri[6])
                                , Integer.parseInt(aracOzellikleri[7])
                                , aracOzellikleri[8]
                        );
                    }
                    araclar.add(arac);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:\n" +
                    "1. Veri Girişinde Bulun\n" +
                    "2. Veri Listele\n" +
                    "3. Veri Güncelle\n" +
                    "4. Çıkış");
            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    Arac arac;
                    System.out.println("Veri girişinde bulunacağınız aracı seçiniz\n" +
                            "1. Otomobil\n" +
                            "2. Bisiklet\n" +
                            "3. Gemi\n" +
                            "4. Uçak\n" +
                            "5. Uçan Gemi\n" +
                            "6. Bir önceki menüye geri dön\n" +
                            "7. Çıkış");
                    int aracTipi = sc.nextInt();
                    if (aracTipi < 6) {
                        System.out.println("marka giriniz: ");
                        String marka = sc.next();
                        System.out.println("yakit turu giriniz");
                        String yakitTuru = sc.next();
                        System.out.println("Arac hizini giriniz");
                        int hizi = sc.nextInt();
                        System.out.println("yolcu sayisi giriniz");
                        int yolcuSayisi = sc.nextInt();
                        System.out.println("tekerlek sayisi giriniz");
                        int tekerlekSayisi = sc.nextInt();
                        System.out.println("fiyati giriniz");
                        int fiyati = sc.nextInt();
                        System.out.println("Uretim yilini Giriniz");
                        int uretimYili = sc.nextInt();
                        System.out.println("Rengi giriniz");
                        String renk = sc.next();
                        switch (aracTipi) {
                            case 1:
                                arac = new Otomobil(marka, yakitTuru, hizi, yolcuSayisi, tekerlekSayisi, fiyati, uretimYili, renk);
                                araciKayitOncesiHareketiSor(arac);
                                araclar.add(arac);
                                arac.araclariDosyayaYaz(araclar);
                                break;
                            case 2:
                                arac = new Bisiklet(marka, yakitTuru, hizi, yolcuSayisi, tekerlekSayisi, fiyati, uretimYili, renk);
                                araciKayitOncesiHareketiSor(arac);
                                araclar.add(arac);
                                arac.araclariDosyayaYaz(araclar);
                                break;
                            case 3:
                                arac = new Gemi(marka, yakitTuru, hizi, yolcuSayisi, tekerlekSayisi, fiyati, uretimYili, renk);
                                araciKayitOncesiHareketiSor(arac);
                                araclar.add(arac);
                                arac.araclariDosyayaYaz(araclar);
                                break;
                            case 4:
                                arac = new Ucak(marka, yakitTuru, hizi, yolcuSayisi, tekerlekSayisi, fiyati, uretimYili, renk);
                                araciKayitOncesiHareketiSor(arac);
                                araclar.add(arac);
                                arac.araclariDosyayaYaz(araclar);
                                break;
                            case 5:
                                arac = new UcanGemi(marka, yakitTuru, hizi, yolcuSayisi, tekerlekSayisi, fiyati, uretimYili, renk);
                                araciKayitOncesiHareketiSor(arac);
                                araclar.add(arac);
                                arac.araclariDosyayaYaz(araclar);
                                break;
                        }
                    } else if (aracTipi == 7) {
                        System.exit(0);
                    }
                    break;
                case 2:
                    System.out.println("Listelemek İstediğiniz Veri Tipini Seçiniz\n" +
                            "1. Kara Taşıtları\n" +
                            "2. Deniz Taşıtları\n" +
                            "3. Hava Taşıtları\n" +
                            "4. Bir Önceki Menüye Geri Dön\n" +
                            "Çıkış");
                    int listelemeTipi = sc.nextInt();
                    if (listelemeTipi > 0 && listelemeTipi < 4) {
                        for (int i = 0; i < araclar.size(); i++) {
                            Arac arac1 = araclar.get(i);
                            if (arac1 instanceof KaraTasiti && listelemeTipi == 1) {
                                System.out.println(arac1.getAracTipi() + " ==> " + arac1.getId() + " - " + arac1.getMarka() + " - " +
                                        arac1.getYakitTuru() + " - " + arac1.getHizi() + " - " + arac1.getYolcuSayisi() + " - "
                                        + arac1.getTekerlekSayisi() +
                                        " - " + arac1.getFiyati()+" - "+arac1.getUretimYili()+" - "+arac1.getRenk());
                            } else if (arac1 instanceof DenizTasiti && listelemeTipi == 2) {
                                System.out.println(arac1.getAracTipi() + " ==> " + arac1.getId() + " - " + arac1.getMarka() + " - " +
                                        arac1.getYakitTuru() + " - " + arac1.getHizi() + " - " + arac1.getYolcuSayisi() + " - "
                                        + arac1.getTekerlekSayisi() +
                                        " - " + arac1.getFiyati()+" - "+arac1.getUretimYili()+" - "+arac1.getRenk());
                            } else if (arac1 instanceof HavaTasiti && listelemeTipi == 3) {
                                System.out.println(arac1.getAracTipi() + " ==> " + arac1.getId() + " - " + arac1.getMarka() + " - " +
                                        arac1.getYakitTuru() + " - " + arac1.getHizi() + " - " + arac1.getYolcuSayisi() + " - "
                                        + arac1.getTekerlekSayisi() +
                                        " - " + arac1.getFiyati()+" - "+arac1.getUretimYili()+" - "+arac1.getRenk());
                            }
                        }
                    } else if (listelemeTipi == 5) {
                        System.exit(0);
                    }
                    break;
                case 3:
                    System.out.println("Guncellemek istediginiz aracin id'sini giriniz");
                    String idGuncellecenekArac = sc.next();
                    arac = null;
                    
                    
                    for (Arac arac1 : araclar) {
                        if (arac1.getId().equals(idGuncellecenekArac)) {
                            String marka, yakitTuru, renk;
                            int hizi, yolcuSayisi, tekerlekSayisi, fiyati, uretimYili;
                            System.out.println("marka giriniz: ");
                            marka = sc.next();
                            System.out.println("yakit turu giriniz");
                            yakitTuru = sc.next();
                            System.out.println("Arac hizini giriniz");
                            hizi = sc.nextInt();
                            System.out.println("yolcu sayisi giriniz");
                            yolcuSayisi = sc.nextInt();
                            System.out.println("tekerlek sayisi giriniz");
                            tekerlekSayisi = sc.nextInt();
                            System.out.println("fiyati giriniz");
                            fiyati = sc.nextInt();
                            System.out.println("Uretim yilini Giriniz");
                            uretimYili = sc.nextInt();
                            System.out.println("Rengi giriniz");
                            renk = sc.next();
                            arac1.setHizi(hizi);
                            arac1.setMarka(marka);
                            arac1.setYakitTuru(yakitTuru);
                            arac1.setYolcuSayisi(yolcuSayisi);
                            arac1.setTekerlekSayisi(tekerlekSayisi);
                            arac1.setFiyati(fiyati);
                            arac1.setUretimYili(uretimYili);
                            arac1.setRenk(renk);
                            //araciKayitOncesiHareketiSor(arac1);
                            arac1.araclariDosyayaYaz(araclar);

                            break;
                        }
                       
                        
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }

    private static void araciKayitOncesiHareketiSor(Arac arac) {
        System.out.println("Kayit etmeden once");
        System.out.println("1. Araci hizlandir");
        System.out.println("2. Araci yavaslat");
        System.out.println("3. Araci durdur");
        System.out.println("4. Kayit et");
        Scanner sc = new Scanner(System.in);
        int islem = sc.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Hizlandirmak istediginiz miktari giriniz");
                int hiz = sc.nextInt();
                if (arac instanceof Bisiklet) {
                    ((Bisiklet) arac).hizlandir(hiz);
                } else if (arac instanceof Otomobil) {
                    ((Otomobil) arac).hizlandir(hiz);
                } else if (arac instanceof Gemi) {
                    ((Gemi) arac).hizlandir(hiz);
                } else if (arac instanceof Ucak) {
                    ((Ucak) arac).hizlandir(hiz);
                } else if (arac instanceof UcanGemi) {
                    ((UcanGemi) arac).hizlandir(hiz);
                }
                break;
            case 2:
                System.out.println("Yavaslatma istediginiz miktari giriniz");
                hiz = sc.nextInt();
                if (arac instanceof Bisiklet) {
                    ((Bisiklet) arac).yavaslat(hiz);
                } else if (arac instanceof Otomobil) {
                    ((Otomobil) arac).yavaslat(hiz);
                } else if (arac instanceof Gemi) {
                    ((Gemi) arac).yavaslat(hiz);
                } else if (arac instanceof Ucak) {
                    ((Ucak) arac).yavaslat(hiz);
                } else if (arac instanceof UcanGemi) {
                    ((UcanGemi) arac).yavaslat(hiz);
                }
                break;
            case 3:
                if (arac instanceof Bisiklet) {
                    ((Bisiklet) arac).duraklat();
                } else if (arac instanceof Otomobil) {
                    ((Otomobil) arac).duraklat();
                } else if (arac instanceof Gemi) {
                    ((Gemi) arac).duraklat();
                } else if (arac instanceof Ucak) {
                    ((Ucak) arac).duraklat();
                } else if (arac instanceof UcanGemi) {
                    ((UcanGemi) arac).duraklat();
                }
                break;
        }
    }
}
