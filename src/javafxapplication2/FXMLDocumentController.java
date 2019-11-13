/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ArrayList;
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

    //@FXML
    //public Label staticLabel;
    //@FXML
    //public Button forewardBtn;
    @FXML
    private TextArea textFieldSuche;
    //@FXML
    //public Button backBtn;
    @FXML
    private TextArea textAreaEingabe;
    private Textbearbeitung textbearbeitung;

    @FXML
    public void handleSucheVorwaerts(ActionEvent event) {
        textbearbeitung.sucheVorwaerts(textFieldSuche.getText(), textAreaEingabe.getCaretPosition());
    }

    @FXML
    public void handleSucheRueckwaerts(ActionEvent event) {
        textbearbeitung.sucheRueckwaerts(textFieldSuche.getText(), textAreaEingabe.getCaretPosition());
    } 

    //Ähnlich wie der Konstruktor - 4init
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textbearbeitung = new Textbearbeitung(textAreaEingabe);
        textAreaEingabe.setText("Halli Hallo Lorem ipsum dolor sit amet, consetetur sadipscing elitr, \nsed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. \nAt vero eos et accusam et justo duo dolores et \nea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. \nLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut \nlabore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo \ndolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        //textbearbeitung = new Textbearbeitung(textAreaEingabe);
        //textbearbeitung.fuelleTextArea();
        //textFieldSuche.setText("Hallo");
        //int i = textAreaEingabe.getCaretPosition();
        //System.out.println(i);
        //textAreaEingabe.selectRange(5,10);
    }
}
