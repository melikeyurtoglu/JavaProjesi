/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otofilo;

import java.util.ArrayList;

/**
 *
 * @author melike
 */
public class KarZarar {
    private int Gunluk_kiralanacak_arac;
    private int Yillik_kiralanacak_arac;
    private int Aylik_kiralanacak_arac;
    
    public ArrayList<Ucret>gunlukucret;
    public ArrayList<Ucret>aylikucret;
    public ArrayList<Ucret>yillikucret;
    public ArrayList<Araclar>aracid;

    public KarZarar(int Gunluk_kiralanacak_arac, int Yillik_kiralanacak_arac, int Aylik_kiralanacak_arac, int Gunluk_ucret, int Yillik_ucret, int Aylik_ucret) {
        this.Gunluk_kiralanacak_arac = Gunluk_kiralanacak_arac;
        this.Yillik_kiralanacak_arac = Yillik_kiralanacak_arac;
        this.Aylik_kiralanacak_arac = Aylik_kiralanacak_arac;
        aracid= new ArrayList<Araclar>();
        gunlukucret = new ArrayList<Ucret>();
        aylikucret = new ArrayList<Ucret>();
        yillikucret = new ArrayList<Ucret>();
    }

    public int getGunluk_kiralanacak_arac() {
        return Gunluk_kiralanacak_arac;
    }

    public void setGunluk_kiralanacak_arac(int Gunluk_kiralanacak_arac) {
        this.Gunluk_kiralanacak_arac = Gunluk_kiralanacak_arac;
    }

    public int getYillik_kiralanacak_arac() {
        return Yillik_kiralanacak_arac;
    }

    public void setYillik_kiralanacak_arac(int Yillik_kiralanacak_arac) {
        this.Yillik_kiralanacak_arac = Yillik_kiralanacak_arac;
    }

    public int getAylik_kiralanacak_arac() {
        return Aylik_kiralanacak_arac;
    }

    public void setAylik_kiralanacak_arac(int Aylik_kiralanacak_arac) {
        this.Aylik_kiralanacak_arac = Aylik_kiralanacak_arac;
    }

}
