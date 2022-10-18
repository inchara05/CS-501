//self-defined package
//package com;

import java.io.File;
import java.io.BufferedReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.filechooser.FileNameExtensionFilter;

/*This Program will display the number of lines, number of words and number of characters from a selected file*/
public class Edition12C12E13C {
	// main method
	public static void main(String[] args) {
		int cycle2 = 1;

		// create a scanner
		Scanner input = new Scanner(System.in);
		System.out.println(
				"*This Program will display the number of lines, number of words and number of characters from a selected file*"
						+ "\nNote: If you wish to select other than text file please select all files from drop down menu when the window pops up"
						+ "\n\nPress 1 if you wish to continue or 0 to exit:");
		cycle2 = input.nextInt();
		if (cycle2 == 1) {

			boolean cycle = true;

			JFileChooser fileChooser = new JFileChooser();

			FileNameExtensionFilter filter = new FileNameExtensionFilter("Select the text file only", "txt"); // filtering
																												// for
																												// selecting
																												// text
																												// file
			fileChooser.setFileFilter(filter);
			fileChooser.setCurrentDirectory(new File("\\")); // setting the directory

			while (cycle) {
				int res = fileChooser.showOpenDialog(null);
				BufferedReader buffer = null; // Reads text from a character-input stream

				if (res == JFileChooser.APPROVE_OPTION) {
					String fileName = fileChooser.getSelectedFile().getName();
					String line;

					try {

						buffer = new BufferedReader(new FileReader(new File(fileChooser.getSelectedFile().getPath()))); // Reads
																														// text
																														// from
																														// a
																														// character-input
																														// stream
						int numOfLines = 0;
						int numOfWords = 0;
						int numOfChar = 0;
						while ((line = buffer.readLine()) != null) {
							numOfLines++;

							String word[] = line.split("[\r \n \t ,;:.]");
							for (int i = 0; i < word.length; i++) {
								if (word[i].length() > 0) {

									numOfWords++;
									numOfChar += word[i].length();
								}
							}

						}
						JOptionPane.showMessageDialog(null,
								"Number of Line(s) : " + numOfLines + "\nNumber of Word(s) : " + numOfWords
										+ "\nNumber of Character(s) : " + numOfChar,
								"Informtion of " + fileName, JOptionPane.INFORMATION_MESSAGE);

					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, e.toString());
					} finally {
						try {
							if (buffer != null)
								buffer.close();
						} catch (IOException ex) {
							JOptionPane.showMessageDialog(null, ex.toString());
						}
					}

				} else if (res == JFileChooser.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "You have selected nothing.");
				} else if (res == JFileChooser.ERROR_OPTION) {
					JOptionPane.showMessageDialog(null, "An error has occurred while selecting the file");
				}

				cycle = confirm();
			}
		}
	}

	private static boolean confirm() {
		int conf = JOptionPane.showConfirmDialog(null, "Do you want to try again?", "Confirm",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		boolean ok = true;

		if (conf == JOptionPane.NO_OPTION) {
			ok = false;
		}

		return ok;

	}

}
