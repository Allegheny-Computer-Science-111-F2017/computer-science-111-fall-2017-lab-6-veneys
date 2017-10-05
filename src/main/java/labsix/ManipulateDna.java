package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/** This class displays an output of dna mutations.
 * The first line will display the original input.
 * This will then be changed.
 */

public class ManipulateDna {

  /** The main entry point for ManipulateDna.
   * The scanner will look for inputs in the input document.
   **/

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Sarah Veney " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string " + dna);
    System.out.println("\nEnter a string containing only C, G, T, and A: " + dna);
    // Step Two: Compute the complement of the DNA String
    //dna.replace(A,t);
    //dna.replace(T,a);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String

    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter

    // Step Six: Display a final thankyou message

  }

}
