/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Clases.Clshistory;
import Modelo.Modelhistoria;

/**
 *
 * @author agos1
 */
public class ctlhistory {
    
    private Modelhistoria modelhistoria;

    public ctlhistory() {
        this.modelhistoria = new Modelhistoria();
    }
    
    
    public boolean Createhistory (Clshistory history){
        try{
            switch (history.getTipo_historia()){
                case "historias reales":
                    this.modelhistoria.Createhistory(history);
                break;
            }
            return true;
            
        }catch (Exception e){
            return false;
        }
    }
    
    public boolean Edithistory (Clshistory history){
        try{
            switch (history.getTipoHistoria()){
                
                case "historias reales":
                    this.modelhistoria.Edithistory((Clshistory)history);
                break;
            }
            return true;
            
        }catch (Exception e){
            return false;
        }
    }
    
    public boolean Deletehistory (String titulo){
        
        try{           
                    
            this.modelhistoria.Deletehistory(titulo);
                
            
            return true;
            
        }catch (Exception e){
            return false;
        }
    }
    
    public Clshistory Searchhistorybytitulo (String titulo, String type){
        Clshistory history = null;
        try{
            switch (type){
                case "historias reales":
                    
                    history = this.modelhistoria.Searchhistorybytitulo(titulo);
                    
                break;
            }
            return history;
            
        }catch (Exception e){
            return null;
        }
    }
    
    public Clshistory Searchhistorybydescripcion (String descripcion_corta, String type){
        Clshistory history = null;
        try{
            switch (type){
                case "historias reales":
                    history = this.modelhistoria.Searchhistorybydescripcion(descripcion_corta);
                break;
            }
            return history;
            
        }catch (Exception e){
            return null;
        }
    }

    

    
}
