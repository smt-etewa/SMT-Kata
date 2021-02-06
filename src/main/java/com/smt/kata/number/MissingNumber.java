package com.smt.kata.number;

/****************************************************************************
 * <b>Title</b>: MissingNumber.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> In this Java puzzle, you have a series of numbers start 
 * (e.g. 1….N) and exactly one number in this series is missing. You have to 
 * write a java program to find missing number from series
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class MissingNumber {
	/**
	 * Uses the sum of values to determine which number is missing
	 * @param numbers
	 * @return
	 */
	public int calculateSum(int[] numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		
		int len = numbers.length + 1;
		int idealSum = (len * (len + 1)) / 2;
		return  idealSum - sum;
	}

}
