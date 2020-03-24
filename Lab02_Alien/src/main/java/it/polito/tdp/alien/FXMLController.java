package it.polito.tdp.alien;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	private AlienDictionary dizionario;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TextField txtParolaAliena;
    
    @FXML
    private Button btnTranslate;
    
    @FXML
    private TextArea txtTraduzione;
    
    @FXML
    private Button btnReset;

    @FXML
    void doTranslate(ActionEvent event) {
    	// TODO - add the button and complete this
    	//inserire una parola che contenga lettere maiuscole, minuscole
   
    	//prendo la stringa che mi viene passata
    	String stemp = txtParolaAliena.getText();
    	txtParolaAliena.clear();
    	
    	//Lo considero come vettore: se ha due contenitori aggiungere nel dizionario, se uno restituire la traduzione
    	String array[] = stemp.split(" ");
    	
    	//controllo se quella è effettivamente una parola
    	for(int i=0; i<array.length; i++) {
    		for(Character c: array[i].toCharArray()) {
    			if( !(Character.isLetter(c)) ) {
        			this.txtTraduzione.setText("Inserire una parola!\n");
        			return;
    			}
    		}
    	}
    	
    	String trad;
    	
    	if(array.length == 2) {
    		this.dizionario.addWord(array[0], array[1]);
    	}
    	else if(array.length == 1) {
    		trad = this.dizionario.traduzione(array[0]);
    		txtTraduzione.setText(trad);
    		}
    	else
    		txtTraduzione.setText("Inserire una parola con traduzione oppure cercare una parola.\n");
    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	// TODO - add the button and complete this 
    }
    
    
    @FXML
    void initialize() {
    	 assert txtParolaAliena != null : "fx:id=\"txtParolaAliena\" was not injected: check your FXML file 'Scene.fxml'.";
         assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
         assert txtTraduzione != null : "fx:id=\"txtTraduzione\" was not injected: check your FXML file 'Scene.fxml'.";
         assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

         dizionario = new AlienDictionary();
    }
    
}