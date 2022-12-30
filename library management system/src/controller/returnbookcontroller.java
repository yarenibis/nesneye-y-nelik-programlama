package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import GUI.returnbookGUI;

public class returnbookcontroller {
	private returnbookGUI viewreturn;

	public returnbookcontroller(returnbookGUI returnbook) {
		this.viewreturn = returnbook;
		returnbook.deleteListener(new deleteListener());
	}

	
	
	public class deleteListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			int selectedRow = viewreturn.getTable().getSelectedRow() + 1;
			int selecttable=viewreturn.getTable().getSelectedRow();
			DefaultTableModel model = (DefaultTableModel) viewreturn.getTable().getModel();
			model.removeRow(selecttable);
			List<String> lines = new ArrayList<>();
			try (BufferedReader reader = new BufferedReader(new FileReader("view issued books.txt"))) {
				String line = null;
				while ((line = reader.readLine()) != null) {
					lines.add(line);
				}
				lines.remove(selectedRow);
			} catch (IOException e2) {
				System.out.println("Dosya okuma hatasi: " + e2.getMessage());
				return;
			}

			try (BufferedWriter writer = new BufferedWriter(new FileWriter("view issued books.txt"))) {
				for (String line : lines) {
					writer.write(line + "\n");
				}
			} catch (IOException e3) {
				System.out.println("Dosya yazma hatasi: " + e3.getMessage());
				return;
			}

		}
		   

	    
		    

		   
		}
}


