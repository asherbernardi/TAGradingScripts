/**
 * Complex4Driver.java
 * 
 * Four arguments are used as parts of two complex numbers.
 *
 * @author Cary Gray (based on another example by Thomas VanDrunen)
 * CSCI 235, Wheaton College, Fall 2019
 * Lab 8
 * Oct. 25, 2018
 */
public class Complex4Driver {

    public static void main(String[] args) {
        // First complex number -- pos 0 real, pos 1 imaginary
        Complex4 comp1 = new Complex4(Double.parseDouble(args[0]),
				      Double.parseDouble(args[1]));

        // Second complex number, similar to first
        Complex4 comp2 = new Complex4(Double.parseDouble(args[2]),
				      Double.parseDouble(args[3]));

        System.out.println("c1 is " + comp1.toString());
        System.out.println("c2 is " + comp2.toString());

        Complex4 answer;   // The number that is the answer to the various ops
        answer = comp1.plus(comp2);
        System.out.println("c1 + c2 = " + answer.toString());
        answer = comp1.minus(comp2);
        System.out.println("c1 - c2 = " + answer.toString());
        answer = comp1.times(comp2);
        System.out.println("c1 * c2 = " + answer.toString());
        answer = comp1.dividedBy(comp2);
        System.out.println("c1 / c2 = " + answer.toString());
    }
}

