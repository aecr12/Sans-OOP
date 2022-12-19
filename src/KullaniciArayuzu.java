import Cekilis.CekilisYoneticisi;
import Cekilis.OnNumaraCekilisi;
import Cekilis.SansTopuCekilisi;
import Cekilis.SayisalLotoCekilisi;
import Oyun.OnNumara;
import Oyun.SansOyunlari;
import Oyun.SansTopu;
import Oyun.SayisalLoto;
import Sonuclar.OnNumaraSonuclandirici;
import Sonuclar.SansTopuSonuclandirici;
import Sonuclar.SayisalLotoSonuclandirici;
import Sonuclar.Sonuclandirici;


import java.util.Scanner;

public class KullaniciArayuzu {

    Scanner scanner2;

    public void oyunBaslat() {

        scanner2 = new Scanner(System.in);
        System.out.println("1-Sayısal Loto/2-On Numara/3-Şans Topu/4-Loto Makinesi");

        switch (scanner2.nextInt()) {
            case 1:
                SayisalLoto sayisalLoto = new SayisalLoto();
                sayisalLoto.oyna();

                SayisalLotoCekilisi sayisalLotoCekilisi = new SayisalLotoCekilisi();
                sayisalLotoCekilisi.cekilisYap();

                SayisalLotoSonuclandirici sayisalLotoSonuclandirici = new SayisalLotoSonuclandirici();
                sayisalLotoSonuclandirici.kontrolEt(sayisalLoto.getKullaniciSayilari(), sayisalLotoCekilisi.getTalihliSayilar());

                break;

            case 2:
                OnNumara onNumara = new OnNumara();
                onNumara.oyna();

                OnNumaraCekilisi onNumaraCekilisi = new OnNumaraCekilisi();
                onNumaraCekilisi.cekilisYap();

                OnNumaraSonuclandirici onNumaraSonuclandirici = new OnNumaraSonuclandirici();
                onNumaraSonuclandirici.kontrolEt(onNumara.getKullaniciSayilari(), onNumaraCekilisi.getTalihliSayilar());

                break;

            case 3:
                SansOyunlari sansOyunlari = new SansTopu();
                sansOyunlari.oyna();

                CekilisYoneticisi cekilisYoneticisi = new SansTopuCekilisi();
                cekilisYoneticisi.cekilisYap();

                Sonuclandirici sonuclandirici = new SansTopuSonuclandirici();
                sonuclandirici.kontrolEt(sansOyunlari.getKullaniciSayilari(),cekilisYoneticisi.getTalihliSayilar(),((SansTopu) sansOyunlari).getKullaniciSayilariIkinciKume(),((SansTopuCekilisi) cekilisYoneticisi).getIkinciKumeTalihliSayilar());

                break;
            case 4:
                SayisalLoto sayisalLoto1 = new SayisalLoto();
                sayisalLoto1.makineyeOynat();

                SayisalLotoCekilisi sayisalLotoCekilisi1 = new SayisalLotoCekilisi();
                sayisalLotoCekilisi1.cekilisYap();

                SayisalLotoSonuclandirici sayisalLotoSonuclandirici1 = new SayisalLotoSonuclandirici();
                sayisalLotoSonuclandirici1.kontrolEt(sayisalLoto1.getKullaniciSayilari(),sayisalLotoCekilisi1.getTalihliSayilar());


        }
    }

}
