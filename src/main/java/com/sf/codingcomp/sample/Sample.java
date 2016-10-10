package com.sf.codingcomp.sample;

/**
 * A simple example class
 */
public class Sample {
	public boolean isBlank(String stringToTest) {
		return stringToTest.replace(" ", "").replaceAll("\\t", "").isEmpty();
	}

	public boolean isAlpha(String stringToTest) {
		return false;
	}
}
