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
public class Ucret {
    private int Gunluk_ucret;
    private int Yillik_ucret;
    private int Aylik_ucret;
    public ArrayList<Araclar>aracid;
    public ArrayList<Araclar>model;
    public ArrayList<indirim>Musteri_id;

    public Ucret(int Gunluk_ucret, int Yillik_ucret, int Aylik_ucret) {
        this.Gunluk_ucret = Gunluk_ucret;
        this.Yillik_ucret = Yillik_ucret;
        this.Aylik_ucret = Aylik_ucret;
        aracid = new ArrayList<Araclar>();
        model = new ArrayList<Araclar>();
        Musteri_id = new ArrayList<indirim>();
    }

    public int getGunluk_ucret() {
        return Gunluk_ucret;
    }

    public void setGunluk_ucret(int Gunluk_ucret) {
        this.Gunluk_ucret = Gunluk_ucret;
    }

    public int getYillik_ucret() {
        return Yillik_ucret;
    }

    public void setYillik_ucret(int Yillik_ucret) {
        this.Yillik_ucret = Yillik_ucret;
    }

    public int getAylik_ucret() {
        return Aylik_ucret;
    }

    public void setAylik_ucret(int Aylik_ucret) {
        this.Aylik_ucret = Aylik_ucret;
    }
    
}
