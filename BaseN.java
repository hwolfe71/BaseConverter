/**
 * BaseN.java
 * @author Herb Wolfe Jr <hwolfe71@gmail.com>
 *
 * Simple program to convert from base 10 to any other base between 2 and 36
 *
 */

import javax.swing.*;

public class BaseN {
	public static void main(String [] args) {
        String input, result, message;
		int intOne, intTwo;

		input = JOptionPane.showInputDialog("\n\nEnter an integer:\t\t");
		intOne = Integer.parseInt(input);

        do {
		    input = JOptionPane.showInputDialog("\n\nEnter a base between 2 and 35 to convert it to:\t\t");
    		intTwo = Integer.parseInt(input);
        } while ((intTwo < 2) || (intTwo > 35));

        // If converting to base 10, we're done
        if (intTwo == 10) {
            result = Integer.toString(intTwo);
        } else {
            result = toBaseN(intOne, intTwo);
        }

        message = "The number " + intOne + ", in base " + intTwo + " is:\n" + result;

        JOptionPane.showMessageDialog(null, message, "Base N Output",
                JOptionPane.PLAIN_MESSAGE);

	} // end main()

    private static String toBaseN(int num, int base) {
        String temp = new String("");
        int r;

        char [] digits = {'0','1','2','3','4','5','6','7','8','9',
            'A','B','C','D','E','F','G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z' };

        while (num >= 1) {
            r = num % base;
            temp = digits[r] + temp;
            num /= base;
        }
        return temp;
    } // end toBaseN()


} // end class BaseN
