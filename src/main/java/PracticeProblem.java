/**
	* Lesson: Random Module
	* Author: Jacky Lui
	* Date Last Modified: April 16, 2026
	*/
import java.util.Random;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int randomNumber(int num1, int num2) {
		Random random = new Random();
		if (num1 ==num2) { 
			return num1;
		}
		int result = random.nextInt(Math.max(num1, num2) - Math.min(num1, num2)) + Math.min(num1, num2);
		return result;
	}

	public static char randomChar(String word) {
		Random random = new Random();
		char randomChar = word.charAt(random.nextInt(word.length()));
		return randomChar;
	}

	public static int randomEvenNumber(int num1, int num2) {
		Random random = new Random();
		if (num1 == num2) {
		if (num1%2 == 0) { 
			return num1;
		}
		if (num1%2 < 0) {
			return 0;
		}
	}
		int result = random.nextInt(Math.max(num1, num2) - Math.min(num1, num2)) + Math.min(num1, num2);
		return ((result / 2 + 1) * 2);
	}

}
