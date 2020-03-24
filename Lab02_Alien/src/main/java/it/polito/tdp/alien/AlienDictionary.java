package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	/* CASO CON LA CLASSE Word
	private List<Word> dictionary = new ArrayList<Word>();
	
	public void addWord(String alien, String translation) {
		//se la traduzione è già presente aggiornare
		if(cercaParola(alien) != null) {
			cercaParola(alien).setTraslation(translation);
		}
		else
			this.dictionary.add(new Word(alien, translation));
	}
	
	public Word cercaParola(String alien) {
		for(Word w: dictionary) {
			if(w.getAlienWord().equals(alien)) {
				return w;
			}
		}
		return null;
	}

	//metodo che da' la traduzione
	public String traduzione( String alien) {
		//se la parola è nel dizionario dammi la traduzione
		if(cercaParola(alien)!= null) {
			return cercaParola(alien).getTraslation();
		}
		else
			return null;
	}
*/
	
	// ESERCIZIO 2: CASO CON LA CLASSE WordEnhanced
	private List<WordEnhanced> dictionary = new ArrayList<WordEnhanced>();
	
	public void addWord(String alien, String translation) {
		//se la traduzione è già presente aggiungere altra traduzione
		if(cercaParola(alien) != null) {
			cercaParola(alien).getTraslation().add(translation);
		}
		else
			this.dictionary.add(new WordEnhanced(alien, translation));
	}
	
	public WordEnhanced cercaParola(String alien) {
		for(WordEnhanced w: dictionary) {
			if(w.getAlienWord().equals(alien)) {
				return w;
			}
		}
		return null;
	}

	//metodo che da' la traduzione
	public String traduzione( String alien) {
		//se la parola è nel dizionario dammi la traduzione
		if(cercaParola(alien)!= null) {
			return cercaParola(alien).toString();
		}
		else
			return null;
	}
	
}
