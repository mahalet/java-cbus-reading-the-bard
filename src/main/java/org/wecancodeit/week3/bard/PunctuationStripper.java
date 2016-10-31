package org.wecancodeit.week3.bard;

public class PunctuationStripper {

	

	public String strip(String stripper) {
		 return stripper.replaceAll("[^\\w\\s]","".trim());
		}
	
}
