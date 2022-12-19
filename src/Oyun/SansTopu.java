package Oyun;

import java.util.ArrayList;

public class SansTopu extends SansOyunlari {

    private ArrayList<Integer> kullaniciSayilarıIkinciKume = new ArrayList<>();

    public ArrayList<Integer> getKullaniciSayilariIkinciKume() {
        return kullaniciSayilarıIkinciKume;
    }


    @Override
    public void oyna() {
        System.out.println("1. küme için 1-34 arası 5 sayı giriniz.");
        while (getKullaniciSayilari().size() < 5) {
            setKullaniciSayisi(getScanner().nextInt());
            if (getKullaniciSayisi() < 35 && getKullaniciSayisi() > 0) {
                getKullaniciSayilari().add(getKullaniciSayisi());
            } else {
                System.out.println("Geçersiz sayı girdiniz.");
            }
        }
        System.out.println("2. küme için 1-14 arası bir sayı giriniz.");
        while (getKullaniciSayilariIkinciKume().size() < 1) {
            setKullaniciSayisi(getScanner().nextInt());
            if (getKullaniciSayisi() < 15 && getKullaniciSayisi() > 0) {
                getKullaniciSayilariIkinciKume().add(getKullaniciSayisi());
            } else {
                System.out.println("Geçersiz sayı girdiniz.");
            }
        }
        System.out.println("1.kümede girdiğiniz sayılar. " + getKullaniciSayilari());

    }
}


