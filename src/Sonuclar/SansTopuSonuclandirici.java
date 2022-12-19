package Sonuclar;

import java.util.ArrayList;

public class SansTopuSonuclandirici extends Sonuclandirici {

    private ArrayList<Integer> sonucIkinciKume;

    public ArrayList<Integer> getSonucIkinciKume() {
        return sonucIkinciKume;
    }

    @Override
    public void kontrolEt(ArrayList<Integer> kupon, ArrayList<Integer> cekilis) {

    }

    @Override
    public void kontrolEt(ArrayList<Integer> kupon, ArrayList<Integer> cekilis, ArrayList<Integer> kupon2, ArrayList<Integer> cekilis2) {
        setSonuc(new ArrayList<>(kupon));
        getSonuc().retainAll(cekilis);
        System.out.println("1. kümede bildiğiniz sayılar: " + getSonuc());

        sonucIkinciKume = new ArrayList<>(kupon2);
        sonucIkinciKume.retainAll(cekilis2);
        System.out.println("2. kümede bildiğiniz sayılar: " + sonucIkinciKume);

        if (getSonuc().size()+sonucIkinciKume.size() <= 1) {
            System.out.println(getSonuc().size() + " sayı bildiniz\n" + "Kazanamdınız!!!");
        } else if (getSonuc().size()+sonucIkinciKume.size() <= 4) {
            System.out.println(getSonuc().size() + " sayı bildiniz\n" + "İkramiye kazandınız!!!");
        } else {
            System.out.println(getSonuc().size() + " sayı bildiniz\n" + "BÜYÜK İKRAMİYE KAZANDINIZ!!!!!");
        }

    }
}
