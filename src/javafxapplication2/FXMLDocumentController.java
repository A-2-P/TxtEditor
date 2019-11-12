/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Ane.Pjanic
 */
public class FXMLDocumentController implements Initializable {

   @FXML
    private Label staticLabel;
    @FXML
    private Button forewardBtn;
    @FXML
    private TextArea textFieldSuche;
    @FXML
    private Button backBtn;
    @FXML
    private TextArea textAreaEingabe;
    
    
    @FXML
    private void handleSucheVorwaerts(ActionEvent event) {
        sucheVorwaerts(textFieldSuche.getText(), textAreaEingabe.getCaretPosition());
    }

    @FXML
    private void handleSucheRueckwaerts(ActionEvent event) {
        sucheRueckwaerts(textFieldSuche.getText(), textAreaEingabe.getCaretPosition());

    }
    
    public void sucheVorwaerts(String sucheNach, int sucheAb){
             
        int start = textAreaEingabe.getText().indexOf(sucheNach,sucheAb);
        if(start>-1){
            textAreaEingabe.selectRange(start ,start+sucheNach.length());
            System.out.println(sucheAb);
        }
        
    }
    
    public void sucheRueckwaerts(String str, int pos){
        int j[];
        for (int index = 0; index < -1; index++) {
            //int j[index] = textAreaEingabe.getText().indexOf(str,pos);
        }
        
        int i = textAreaEingabe.getText().indexOf(str,pos);
        if(i>-1){
            textAreaEingabe.selectRange(i ,i+str.length());
        }
        
    }
    //Ähnlich wie der Konstruktor - 4init
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textAreaEingabe.setText("Halli Hallo Lorem ipsum dolor sit amet, consetetur sadipscing elitr, \nsed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. \nAt vero eos et accusam et justo duo dolores et \nea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. \nLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut \nlabore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo \ndolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        //textFieldSuche.setText("Hallo");
        //int i = textAreaEingabe.getCaretPosition();
        //System.out.println(i);
        //textAreaEingabe.selectRange(5,10);
    }
    
   
}
