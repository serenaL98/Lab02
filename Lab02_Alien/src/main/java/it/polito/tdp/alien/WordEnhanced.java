package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	
	private String alienWord;
	private List<String> traslation = new ArrayList<String>();

	/**
	 * @param alienWord
	 * @param traslation
	 */
	public WordEnhanced(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.traslation.add(translation);
	}
	
	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public List<String> getTraslation() {
		return traslation;
	}

	public void setTraslation(List<String> traslation) {
		this.traslation = traslation;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String elenco ="";
		for(String s: traslation) {
			elenco += s+"\n";
		}
		return elenco;
	}

	/*@Override
	public boolean equals(String parola) {
		if(this.alienWord.equals(parola)) {
			return this.alienWord;
		}
		
	}*/
	
	
}
