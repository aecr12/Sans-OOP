package Cekilis;

public class OnNumaraCekilisi extends CekilisYoneticisi{

    @Override
    public void cekilisYap() {
        while (getTalihliSayilar().size() < 10) {
            setTalihliSayi(getRandom().nextInt(80)+1);
            if (getTalihliSayilar().indexOf(getTalihliSayi()) == -1) {
                getTalihliSayilar().add(getTalihliSayi());
            }
        }
        System.out.println("Çekiliş sonucu: " + getTalihliSayilar());
    }
}
