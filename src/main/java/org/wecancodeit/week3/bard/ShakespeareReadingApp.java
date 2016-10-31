package org.wecancodeit.week3.bard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ShakespeareReadingApp {

	private static final String Path = null;
	/**
	 * This is how we create a constant in Java.
	 * 
	 * TODO Replace this with the location of the Yorick.txt file in the
	 * src/main/resources folder of your local computer.
	 */
	public static String SHAKESPEARE_FILEPATH = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-reading-the-bard\\src\\main\\resources\\Yorick.txt";

	// private static String sampleString;

	/**
	 * TODO load the file at SHAKESPEARE_FILEPATH via a {@link BufferedReader}
	 */
	public static void main(String[] args) throws IOException {
		readAndWriteToSystemOut();
		writeFileReplacingPunctuationWithLinebreaks();
		tryToReadAFileThatDoesntExist();
	}

	/**
	 * <p>
	 * TODO load the file at SHAKESPEARE_FILEPATH via a {@link BufferedReader}
	 * </p>
	 * 
	 * <p>
	 * TODO read each line of text, then write each line to System.out
	 * </p>
	 * 
	 * *
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * <p>
	 */
	private static void readAndWriteToSystemOut() throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(
				SHAKESPEARE_FILEPATH))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			System.err.println("FINALLY BLOCK");
		}
	}

	/**
	 * <p>
	 * TODO read the input file and write a new file
	 * </p>
	 * 
	 * <p>
	 * TODO create and use an instance of {@link PunctuationStripper} to replace
	 * punctuation with newlines and remove other newlines, trimming space at
	 * the beginning and ends of lines
	 * </p>
	 * 
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * </p>
	 * 
	 * <p>
	 * Example:
	 * </p>
	 * 
	 * <pre>
	 * Now get you to my lady's chamber, and tell her, let her paint an
	 * inch thick, to this favour she must come; make her laugh at that.
	 * </pre>
	 * 
	 * <p>
	 * would become:
	 * </p>
	 * 
	 * <pre>
	 * Now get you to my lady
	 * s chamber
	 * and tell her
	 * let her paint an inch thick
	 * to this favour she must come
	 * make her laugh at that
	 * </pre>
	 * 
	 * @throws IOException
	 */
	 

	private static void writeFileStrippingPunctuation() throws IOException {
		PrintWriter writer = new PrintWriter("TheNewYorick.txt", "UTF-8");
		PunctuationStripper ps = new PunctuationStripper();

		try (BufferedReader br = new BufferedReader(new FileReader(
				SHAKESPEARE_FILEPATH))) {

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(ps.strip(line)); // This prints on console
				// for test only

				writer.println(ps.strip(line));
			}
		}
		writer.close();
	}

	/*
	 * FileReader file = new FileReader(
	 * "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-reading-the-bard\\src\\main\\resources\\Yorick.txt"
	 * ); BufferedReader reader = new BufferedReader(file); String text ="";
	 * String line = reader.readLine(); while(line != null); { text += line;
	 * line = reader.readLine(); } for( int i = 0 ; i< 1; i++);
	 * 
	 * reader.close(); System.out.println(text); }
	 */
	/*
	 * if(newFile.exists()) System.out.println("the file already exists"); else
	 * { try { newFile.createNewFile(); } catch(Exception e) {
	 * e.printStackTrace(); }
	 * 
	 * try { FileWriter fileW = new FileWriter(newFile); BufferedWriter buffW =
	 * new BufferedWriter(fileW); buffW.write("this is my codeeval project");
	 * buffW.close(); } catch(Exception e) { e.printStackTrace(); } finally {
	 * System.out.println("FINALLY BLOCK"); } } }
	 */

	/**
	 * <p>
	 * TODO try to read a file that doesn't exist, catch the exception that is
	 * thrown, then write an error to {@link System#err} (same syntax as writing
	 * to {@link System#out})
	 * </p>
	 * 
	 * <p>
	 * TODO Close the {@link BufferedReader} you use in a finally block
	 * </p>
	 */
	private static void tryToReadAFileThatDoesntExist() throws IOException {
		String fileName = "FileAintThere.txt";

	      
	       String line;

	       try {
	          
	           FileReader fileReader =  new FileReader(fileName);

	           
	           BufferedReader bufferedReader = new BufferedReader(fileReader);

	           while((line = bufferedReader.readLine()) != null) {
	               System.out.println(line);
	           }  

	           
	           bufferedReader.close();         
	       }
	       catch(FileNotFoundException ex) {
	           System.err.println("UNABLE TO OPEN '" +  fileName + "'" + "BECAUSE IT DOES NOT EXIST");  }

	}
	private static void writeFileReplacingPunctuationWithLinebreaks() throws IOException {
        PunctuationStripper ps = new PunctuationStripper();
        
        try (BufferedReader buffer = new BufferedReader(new FileReader(
                SHAKESPEARE_FILEPATH))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(ps.strip(line.replaceAll("[^\\w\\s]", "\n")));
            }
        } finally {
            System.err.println("Finally Block!");
            System.out.println();
        }
    }
}