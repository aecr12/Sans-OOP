package Oyun;

public class OnNumara extends SansOyunlari {
    @Override
    public void oyna() {
        System.out.println("1 ile 80 arasında 10 sayı giriniz: ");
        while (getKullaniciSayilari().size() < 10) {
            setKullaniciSayisi(getScanner().nextInt());
            if(getKullaniciSayisi()<81 && getKullaniciSayisi()>0){
                getKullaniciSayilari().add(getKullaniciSayisi());
            }else {
                System.out.println("Geçersiz sayı girdiniz.");
            }
        }
        System.out.println("Oynadığınız sayılar: " + getKullaniciSayilari());
    }
}
