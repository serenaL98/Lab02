package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String traslation;

	/**
	 * @param alienWord
	 * @param traslation
	 */
	public Word(String alienWord, String traslation) {
		super();
		this.alienWord = alienWord;
		this.traslation = traslation;
	}
	
	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTraslation() {
		return traslation;
	}

	public void setTraslation(String traslation) {
		this.traslation = traslation;
	}

	/*@Override
	public boolean equals(String parola) {
		if(this.alienWord.equals(parola)) {
			return this.alienWord;
		}
		
	}*/

	public boolean isParola(String parola) {
    	boolean eParola = true;
    	for(int i=0; i<parola.length(); i++) {
    		if( !(Character.isLetter(parola.charAt(i))) ) {
    			eParola = false;
    			return eParola;
    		}
    	}
    	return eParola;
    }
	
}
