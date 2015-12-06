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
public class Kontrol {
    private String Trafik_sigortasi;
    private String muayene_tarihi;
    private String hasar_tespit;
    private String Ariza;
    public ArrayList<Araclar>aracid;

    public Kontrol(String Trafik_sigortasi, String muayene_tarihi, String hasar_tespit, String Ariza) {
        this.Trafik_sigortasi = Trafik_sigortasi;
        this.muayene_tarihi = muayene_tarihi;
        this.hasar_tespit = hasar_tespit;
        this.Ariza = Ariza;
        aracid= new ArrayList<Araclar>();
    }

    public String getTrafik_sigortasi() {
        return Trafik_sigortasi;
    }

    public void setTrafik_sigortasi(String Trafik_sigortasi) {
        this.Trafik_sigortasi = Trafik_sigortasi;
    }

    public String getMuayene_tarihi() {
        return muayene_tarihi;
    }

    public void setMuayene_tarihi(String muayene_tarihi) {
        this.muayene_tarihi = muayene_tarihi;
    }

    public String getHasar_tespit() {
        return hasar_tespit;
    }

    public void setHasar_tespit(String hasar_tespit) {
        this.hasar_tespit = hasar_tespit;
    }

    public String getAriza() {
        return Ariza;
    }

    public void setAriza(String Ariza) {
        this.Ariza = Ariza;
    }
    
}
