package Sonuclar;

import java.util.ArrayList;

public abstract class Sonuclandirici {

    private ArrayList<Integer> sonuc;

    public ArrayList<Integer> getSonuc() {
        return sonuc;
    }

    public void setSonuc(ArrayList<Integer> sonuc) {
        this.sonuc = sonuc;
    }

    public abstract void kontrolEt(ArrayList<Integer> kupon, ArrayList<Integer> cekilis);
    public abstract void kontrolEt(ArrayList<Integer> kupon, ArrayList<Integer> cekilis,ArrayList<Integer> kupon2, ArrayList<Integer> cekilis2);
}
