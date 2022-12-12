//Generate 500 random numbers.

package practical1;

import java.util.Random;

public class randomNum {

	public static void main(String[] args) {
		Random rnum = new Random();
		System.out.println("Here are 500 random numbers: ");

		for (int i = 0; i <= 500; i++) {
			System.out.print(rnum.nextInt(500) + "  ");
		}
	}
}
