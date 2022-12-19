package Cekilis;

import java.util.ArrayList;
import java.util.Random;

public class CekilisYoneticisi {

    private Random random = new Random();   //rastgele sayı üretecek.
    private ArrayList<Integer> talihliSayilar = new ArrayList<>();  //sayıları tutacak
    private int talihliSayi;    //kontrol edecek

    public Random getRandom() {
        return random;
    }

    public ArrayList<Integer> getTalihliSayilar() {
        return talihliSayilar;
    }

    public int getTalihliSayi() {
        return talihliSayi;
    }

    public void setTalihliSayi(int talihliSayi) {
        this.talihliSayi = talihliSayi;
    }

    public void cekilisYap() {
        while (talihliSayilar.size() < 6) {
            setTalihliSayi(getRandom().nextInt(90)+1);
            if (getTalihliSayilar().indexOf(getTalihliSayi()) == -1) {  //eklenecek sayı arraylistte varsa eklenmeyecek
                getTalihliSayilar().add(getTalihliSayi());
            }
        }
        System.out.println("Çekiliş sonucu: " + getTalihliSayilar());
    }

}
