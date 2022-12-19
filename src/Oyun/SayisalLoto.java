package Oyun;

import OyunMakinesi.LotoMakinesi;

import java.util.Random;

public class SayisalLoto extends SansOyunlari implements LotoMakinesi {

    @Override
    public void oyna() {

        System.out.println("1 ile 90 arasında 6 sayı giriniz: ");
        while (getKullaniciSayilari().size() < 6) {
            setKullaniciSayisi(getScanner().nextInt());
            if(getKullaniciSayisi()<91 && getKullaniciSayisi()>0){
                getKullaniciSayilari().add(getKullaniciSayisi());
            }else {
                System.out.println("Geçersiz sayı girdiniz.");
            }
        }
        System.out.println("Oynadığınız sayılar: " + getKullaniciSayilari());
    }

    @Override
    public void makineyeOynat() {

        Random random = new Random();
        while (getKullaniciSayilari().size()<6){
            int makineSayisi =random.nextInt(90)+1;
            if(getKullaniciSayilari().indexOf(makineSayisi)==-1){
                getKullaniciSayilari().add(makineSayisi);
            }
        }
        System.out.println("Makine tarafından oynanan sayılar: "+getKullaniciSayilari());
    }
}
