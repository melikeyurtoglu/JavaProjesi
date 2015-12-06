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
public class Araclar {
    private String plaka;
    private String marka;
    private String modeli;
    private int Aracid;
    public ArrayList<Otofilo> filo_id;

    public String getPlaka() {
        return plaka;
    }

    public Araclar(String plaka, String marka, String modeli, int Aracid) {
        this.plaka = plaka;
        this.marka = marka;
        this.modeli = modeli;
        this.Aracid = Aracid;
        filo_id= new ArrayList<Otofilo>();
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public int getAracid() {
        return Aracid;
    }

    public void setAracid(int Aracid) {
        this.Aracid = Aracid;
    }
}
