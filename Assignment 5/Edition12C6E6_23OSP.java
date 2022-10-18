//self-defined package
//package com;

import java.util.Scanner;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* This Program will count the number of occurances 
of a character from the string you have entered */
public class Edition12C6E6_23OSP {
	// main method

	public static void main(String[] args) {

		int cycle2 = 1;
		// create a scanner
		Scanner input = new Scanner(System.in);
		System.out.println(
				"*This Program will count the number of occurances of a character from the string you have entered*"
						+ "\n\nPress 1 if you wish to continue or 0 to exit:");
		cycle2 = input.nextInt();
		if (cycle2 == 1) {
			boolean cycle = true;
			boolean cycle1 = true;

			JPanel p = new JPanel();
			JLabel l = new JLabel();
			p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

			while (cycle) {
				JTextField str = new JTextField();
				l.setText("Enter a string(letters + digits + special charcters):");
				p.add(l);
				p.add(str);

				int a = JOptionPane.showConfirmDialog(null, p, null, JOptionPane.OK_CANCEL_OPTION);

				try {

					if (a == JOptionPane.OK_OPTION && str.getText().length() > 0) {

						while (cycle1) {
							JTextField ch = new JTextField();
							l.setText("<html>Your String is : " + str.getText() + "<br>Enter a character:");
							p.add(l);
							p.remove(str);
							p.add(ch);

							int b = JOptionPane.showConfirmDialog(null, p, null, JOptionPane.OK_CANCEL_OPTION);
							if (b == JOptionPane.OK_OPTION) {
								try {
									if (ch.getText().length() == 1) {
										int occurance = count(str.getText(), ch.getText().charAt(0));
										JOptionPane.showMessageDialog(null,
												"The number of Occurance of the entered charcter is: \n" + occurance);

									} else {
										throw new Exception("Enter only one charcter at a time");
									}
								} catch (Exception e) {

									JOptionPane.showMessageDialog(null, e.getMessage(), "Warning Message",
											JOptionPane.WARNING_MESSAGE);
								}

							} else if (b == JOptionPane.CANCEL_OPTION) {

								cycle1 = exit();

							}
							p.removeAll();
						}
						cycle = confirm();
						cycle1 = cycle;
						p.removeAll();

					} else if (a == JOptionPane.CANCEL_OPTION) {

						cycle = exit();
						cycle1 = cycle;

					} else if (a == JOptionPane.OK_OPTION && str.getText().length() == 0) {
						throw new Exception("Please Enter only string");
					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Warning Message", JOptionPane.WARNING_MESSAGE);
				}

				p.removeAll();
			}
		}
	}

	// counting the characters
	public static int count(String str, char a) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				cnt++;
			}
		}
		return cnt;
	}

	private static boolean confirm() {
		int conf = JOptionPane.showConfirmDialog(null, "Do you want to try with the new string?", "Confirm",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		boolean ok = true;

		if (conf == JOptionPane.NO_OPTION) {
			ok = false;
		}

		return ok;

	}

	private static boolean exit() {
		int exit = JOptionPane.showConfirmDialog(null, "Do you want to Exit?", "Exit", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		boolean notOk = true;

		if (exit == JOptionPane.YES_OPTION) {
			notOk = false;
		}

		return notOk;

	}

}
