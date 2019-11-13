/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Ane.Pjanic
 */
public class Textbearbeitung {
            
        public TextArea textAreaEingabe;
        
        public Textbearbeitung(TextArea textAreaEingabe){
            this.textAreaEingabe = textAreaEingabe;
        }
               
        public void sucheVorwaerts(String sucheNach, int sucheAb){
        int start = textAreaEingabe.getText().indexOf(sucheNach,sucheAb);
        if(start>-1){
            textAreaEingabe.selectRange(start ,start+sucheNach.length());
            System.out.println(sucheAb); 
        }
        
    }
    
    public void sucheRueckwaerts(String sucheNach, int sucheAb){
        
        sucheAb = textAreaEingabe.getSelection().getStart() -1;
        sucheAb = textAreaEingabe.getText().lastIndexOf(sucheNach,sucheAb);
        if(sucheAb>-1){
            textAreaEingabe.selectRange(sucheAb ,sucheAb+sucheNach.length());
            System.out.println(sucheAb); 
        }  
        
    }
}
