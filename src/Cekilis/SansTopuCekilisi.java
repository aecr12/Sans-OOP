package Cekilis;

import java.util.ArrayList;

public class SansTopuCekilisi extends CekilisYoneticisi {

    private ArrayList<Integer> ikinciKumeTalihliSayilar = new ArrayList<>();

    public ArrayList<Integer> getIkinciKumeTalihliSayilar() {
        return ikinciKumeTalihliSayilar;
    }
    @Override
    public void cekilisYap() {

        while (getTalihliSayilar().size() < 5) {
            setTalihliSayi(getRandom().nextInt(34)+1);
            if (getTalihliSayilar().indexOf(getTalihliSayi()) == -1) {
                getTalihliSayilar().add(getTalihliSayi());
            }
        }
        while (getIkinciKumeTalihliSayilar().size()<1){
            setTalihliSayi(getRandom().nextInt(14)+1);
            if(getIkinciKumeTalihliSayilar().indexOf(getTalihliSayi())==-1){
                getIkinciKumeTalihliSayilar().add(getTalihliSayi());
            }
        }
        System.out.println("1. küme çekiliş sonuçları: "+getTalihliSayilar());
        System.out.println("2. küme çekiliş sonuçları: "+getIkinciKumeTalihliSayilar());
    }

}

