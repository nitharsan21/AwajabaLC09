package com.awa.awajaba.metier;

import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author developpeur
 */
public class Repas {
   
    private String login;
    private String mdp;
    private String email;
    private LocalDate dateInscription;
    private boolean bloque;
    private Map<Specialite,Integer> specialite;
    

}
