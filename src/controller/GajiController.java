/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GajiDao;
import java.util.List;
import model.Gaji;

/**
 *
 * @author saeful
 */
public class GajiController {
    private GajiDao gajidao = new GajiDao();
    
    public List<Gaji> getAll(){
        return gajidao.getAll();
    }
    
    public Gaji save(Gaji gaji){
        return gajidao.save(gaji);
    }
    
    public Gaji getID(Gaji g){
        return gajidao.getID(g);
    }
    
    public Gaji update(Gaji gaji){
        return gajidao.update(gaji);
    }
    
    public Gaji delete(Gaji gaji){
        return gajidao.delete(gaji);
    }
    
    public List<Gaji> searching(String teks){
        return gajidao.searching(teks);
    }
}
