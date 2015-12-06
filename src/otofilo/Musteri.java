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
public class Musteri {
    private int musteri_id;
    private String Ad;
    private String Soyad;
    private String e_posta;
    private String adres;
    private String Tel;
    private int kiralanan_arac_sayisi;
    public ArrayList<Araclar>aracid;

    public Musteri(int musteri_id, String Ad, String Soyad, String e_posta, String adres, String Tel, int kiralanan_arac_sayisi) {
        this.musteri_id = musteri_id;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.e_posta = e_posta;
        this.adres = adres;
        this.Tel = Tel;
        this.kiralanan_arac_sayisi = kiralanan_arac_sayisi;
        aracid= new ArrayList<Araclar>();
    }

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public String getE_posta() {
        return e_posta;
    }

    public void setE_posta(String e_posta) {
        this.e_posta = e_posta;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public int getKiralanan_arac_sayisi() {
        return kiralanan_arac_sayisi;
    }

    public void setKiralanan_arac_sayisi(int kiralanan_arac_sayisi) {
        this.kiralanan_arac_sayisi = kiralanan_arac_sayisi;
    }
    
}
