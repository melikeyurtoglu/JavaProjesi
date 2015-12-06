/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otofilo;

/**
 *
 * @author melike
 */
public class Otofilo {
    private String adi;
    private String Kurulustarihi;
    private int filoid;
    private int aracsayisi;

    public Otofilo(String adi, String Kurulustarihi, int filoid, int aracsayisi) {
        this.adi = adi;
        this.Kurulustarihi = Kurulustarihi;
        this.filoid = filoid;
        this.aracsayisi = aracsayisi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getFiloid() {
        return filoid;
    }

    public void setFiloid(int filoid) {
        this.filoid = filoid;
    }

   

    public int getAracsayisi() {
        return aracsayisi;
    }

    public void setAracsayisi(int aracsayisi) {
        this.aracsayisi = aracsayisi;
    }
    
}
