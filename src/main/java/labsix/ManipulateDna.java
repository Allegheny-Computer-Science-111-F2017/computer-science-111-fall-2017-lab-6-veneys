package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
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
    System.out.println("Okay, I am going to manipulate the DNA string \"" + dna + "\"");
    System.out.println("\nEnter a string containing only C, G, T, and A: " + dna);
    // Step Two: Compute the complement of the DNA String
    String s0 = dna;
    String s1 = s0.replace('a','T');
    String s2 = s1.replace('c','G');
    String s3 = s2.replace('g','C');
    String complement = s3.replace('t','A');
    System.out.println("The complement of " + dna.toUpperCase() + " is " + complement.toUpperCase());
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random r1 = new Random();
    String alphabet1 = "ACTG";
    int N1 = alphabet1.length();
    char randomChar = alphabet1.charAt(r1.nextInt(N1));
    String sub1 = dna.substring(0,2);
    String sub2 = dna.substring(2);
    String dnaPlusLetter = sub1 + randomChar + sub2;
    System.out.println("Inserting " + randomChar + " at position 2 gives " + dnaPlusLetter.toUpperCase());
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    Random generator = new Random();
    int ranPos;
    ranPos = generator.nextInt(4);
    String firstpart = dna.substring(0,ranPos);
    String secondpart = dna.substring(ranPos + 1);
    String dnaMinusRanLet = firstpart + secondpart;
    System.out.println("Deleting from position " + ranPos + " gives " + dnaMinusRanLet.toUpperCase());
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int ranPos2;
    String alphabet = "ACTG";
    int N = alphabet.length();
    Random r = new Random();
    ranPos2 = generator.nextInt(4);
    String part1 = dna.substring(0,ranPos2);
    String part2 = dna.substring(ranPos2 + 1);
    char ranChar = alphabet.charAt(r.nextInt(N)); 
    String step5 = part1 + ranChar + part2;
    System.out.println("Changing position " + ranPos2 + " gives " + step5.toUpperCase());
    // Step Six: Display a final thankyou message
    System.out.println("\nThank you for using the ManipulateDna program. Have a nice day.");
  }

}
