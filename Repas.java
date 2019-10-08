package com.awa.awajaba.metier;

import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author developpeur
 */
public class Repas {
   
    private int id;
    private String login;
    private String mdp;
    private String email;
    private LocalDate dateInscription;
    private boolean bloque;
  
    
     public Repas(int id, String login, String mdp, String email, LocalDate dateInscription, boolean bloque) {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
        this.email = email;
        this.dateInscription = dateInscription;
        this.bloque = bloque;
    }
    
     public int getNumero(){
        return this.id ;
    }
    
    public void setNumero(int id){
        this.id = id ;
    }
    
    public int getDate(){
        return this.Date ;
    }
    
    public void setDate(int date){
        this.date = date ;
    }

    

}
