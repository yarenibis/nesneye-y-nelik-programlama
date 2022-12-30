package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

import GUI.searchGUI;

public class searchcontroller {

		private searchGUI s;

		public searchcontroller(searchGUI s) {
			super();
			this.s = s;
			s.searchbtnListener(new findListener());
		}

		public class findListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String title = s.getFname().getText();
				String filePath = "C:\\Users\\yaren\\eclipse-workspace\\library management system\\catalog.txt";
				try {
					BufferedReader bret = new BufferedReader(new FileReader(filePath));
					String line;
					while ((line = bret.readLine()) != null) {
						String[] parts = line.split(" ");
						String name = parts[1];
						if (name.equals(title)) {
							JOptionPane.showMessageDialog(null, "book is found");
							s.getYauthor().setVisible(true);
							s.getYısbn().setVisible(true);
							s.getYtitle().setVisible(true);
							s.getYquant().setVisible(true);

							s.getY1().setVisible(true);
							s.getY2().setVisible(true);
							s.getY3().setVisible(true);
							s.getY4().setVisible(true);

							s.getY1().setText(parts[0]);
							s.getY2().setText(parts[1]);
							s.getY3().setText(parts[2]);
							s.getY4().setText(parts[3]);
						}

					}

				} catch (Exception p) {

				}

			}
		}
	}

