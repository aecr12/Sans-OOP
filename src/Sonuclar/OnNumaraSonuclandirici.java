package Sonuclar;

import java.util.ArrayList;

public class OnNumaraSonuclandirici extends Sonuclandirici {


    @Override
    public void kontrolEt(ArrayList<Integer> kupon, ArrayList<Integer> cekilis) {
        setSonuc(new ArrayList<>(kupon));
        getSonuc().retainAll(cekilis);
        System.out.println("Bildiğiniz Sayilar: "+getSonuc());

        if (getSonuc().size() <= 3) {
            System.out.println(getSonuc().size() + " sayı bildiniz\n" + "Kazanamdınız!!!");
        } else if (getSonuc().size() <= 7) {
            System.out.println(getSonuc().size() + " sayı bildiniz\n" + "İkramiye kazandınız!!!");
        } else {
            System.out.println(getSonuc().size() + " sayı bildiniz\n" + "BÜYÜK İKRAMİYE KAZANDINIZ!!!!!");
        }
    }

    @Override
    public void kontrolEt(ArrayList<Integer> kupon, ArrayList<Integer> cekilis, ArrayList<Integer> kupon2, ArrayList<Integer> cekilis2) {

    }

}
