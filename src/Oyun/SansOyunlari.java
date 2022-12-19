package Oyun;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class SansOyunlari {


    private ArrayList<Integer> kullaniciSayilari = new ArrayList<>();   //Girilen sayıları tutacak arraylist
    private int kullaniciSayisi;    //sayıyı sınırlara göre kontrol edecek
    private Scanner scanner = new Scanner(System.in);   //kullanıcıdan girdi alacak

    public int getKullaniciSayisi() {   //kullanıcının girdiği sayı okunup kontrol edileceği için get metodu
        return kullaniciSayisi;
    }

    public void setKullaniciSayisi(int kullaniciSayisi) {   //bu sayı scannerden alınacağı için set metodu
        this.kullaniciSayisi = kullaniciSayisi;
    }

    public Scanner getScanner() {   //scanner kullanılacağ için get metodu. sete ihtiyaç yok
        return scanner;
    }

    public ArrayList<Integer> getKullaniciSayilari() {
        return kullaniciSayilari;
    }


    public abstract void oyna();    //abstract class, abstract fonksiyon içermelidir, abstract fonksiyonun gövdesi olmaz

}
