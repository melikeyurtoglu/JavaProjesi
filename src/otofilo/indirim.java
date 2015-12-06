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
public class indirim {
    private int indirim_orani;
    public ArrayList<Musteri>Musteri_id;

    public indirim(int indirim_orani) {
        this.indirim_orani = indirim_orani;
        Musteri_id = new ArrayList<Musteri>();
    }

    public int getIndirim_orani() {
        return indirim_orani;
    }

    public void setIndirim_orani(int indirim_orani) {
        this.indirim_orani = indirim_orani;
    }
    
}
