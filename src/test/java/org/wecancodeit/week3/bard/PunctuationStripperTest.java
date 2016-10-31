package org.wecancodeit.week3.bard;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO satisfy one test at a time and in order -- remember to do the simplest
 * thing that works.
 */
public class PunctuationStripperTest {
	@Test
	public void shouldReturnEmptyForAnEmptyString() {
		// TODO create PunctuationStripper and tell it to strip an empty string
		// arrange
		String myString = "";
		PunctuationStripper undertest = new PunctuationStripper();
		Assert.assertEquals("", undertest.strip(""));
	}

	@Test
	public void shouldReturnStringUnchangedIfNoPunctuation() {
		// TODO create PunctuationStripper and tell it to strip a string without
		// punctuation
		// arrange
		PunctuationStripper undertest = new PunctuationStripper();
		// act
		String actual = undertest.strip("ROOM");
		// assert
		Assert.assertEquals("ROOM", actual);
	}

	@Test
	public void shouldTrimWhitespaceFromTheBeginningAndEndOfAString() {
		// TODO create PunctuationStripper and tell it to strip a string with
		// leading and trailing whitespace
		// arrange
		PunctuationStripper undertest = new PunctuationStripper();
		Assert.assertEquals("dawit", undertest.strip("dawit"));
	}

	@Test
	public void shouldStripPunctuation() {
		// TODO create PunctuationStripper and tell it to strip a string with
		// leading and trailing whitespace
		// arrange
		PunctuationStripper undertest = new PunctuationStripper();
		Assert.assertEquals(" ihavepunctuation ",
				undertest.strip(" i[.ha[v,e?pu!nctuat]io&n] "));
	}

	// TODO create additional tests if they make you feel more comfortable with
	// your solution
}