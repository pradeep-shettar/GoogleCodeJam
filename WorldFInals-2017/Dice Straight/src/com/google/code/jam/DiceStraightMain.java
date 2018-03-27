/**
 * 
 */
package com.google.code.jam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Pradeep.Shettar
 *
 */
public class DiceStraightMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numberOfTestCases = scanner.nextLine();
		List<TestCase> testCases = new ArrayList<>();
		for (int testCase = 0; testCase < Integer.parseInt(numberOfTestCases); testCase++) {
			List<Dice> listOfDice = new ArrayList<>();
			String numberOfDice = scanner.nextLine();
			for (int dice = 0; dice < Integer.parseInt(numberOfDice); dice++) {
				String diceValues = scanner.nextLine();
				String[] diceValuesSplit = diceValues.split(" ");
				List<Integer> diceEntries = new ArrayList<>();
				for (String diceValue : diceValuesSplit) {
					diceEntries.add(Integer.parseInt(diceValue));
				}
				Collections.sort(diceEntries);
				listOfDice.add(new Dice(diceEntries, false));
			}
			testCases.add(new TestCase(listOfDice, 1));
		}
		scanner.close();
		System.out.println(testCases.toString());
		updateTheLongestRun(testCases);
	}

	/**
	 * @param dices
	 */
	private static void updateTheLongestRun(List<TestCase> testCases) {
		
	}

}
