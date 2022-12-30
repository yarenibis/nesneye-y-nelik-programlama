package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import GUI.addbookGUI;
import GUI.issuebookGUI;
import GUI.librarianMenuGUI;
import GUI.returnbookGUI;
import GUI.searchGUI;
import GUI.transactionGUI;
import GUI.view_issued_booksGUI;
import GUI.viewbooksGUI;


public class librarianMenucontroller {
	private librarianMenuGUI menu;
	private addbookGUI add;
	private returnbookGUI ret;
	private issuebookGUI issued;
	private view_issued_booksGUI ıguı;
	private searchGUI search;
	private transactionGUI trans;

	public librarianMenucontroller(librarianMenuGUI menu) {
		this.menu = menu;
		menu.returnbtnListener(new returnbtnListener());
		menu.addbtnListener(new btnListener());
		menu.viewbtnListener(new viewbtnListener());
		menu.issuebtnListener(new issuebtnListener());
		menu.viewissuedbtnListener(new viewissuedbtnListener());
		menu.searchbookListener(new searchbookListener());
        menu.exitListener(new exitListener());
	}
	
	

	public class searchbookListener implements ActionListener {
		public void actionPerformed(ActionEvent er) {
			search = new searchGUI();
			search.create();
		}
	}

	public class returnbtnListener implements ActionListener {
		public void actionPerformed(ActionEvent er) {
			returnbookGUI ret = new returnbookGUI();
			ret.create();
			String filePath = "C:\\Users\\yaren\\eclipse-workspace\\library management system\\view issued books.txt";
			File file = new File(filePath);

			try {
				BufferedReader bfr = new BufferedReader(new FileReader(file));
				// ilk satırı alır
				// columns'u ilk satırdan alır
				// columns'u tableye tanımlar
				String firstLine = bfr.readLine().trim();
				String[] columns = firstLine.split(" / ");

				DefaultTableModel model1 = (DefaultTableModel) ret.getTable().getModel();
				model1.setColumnIdentifiers(columns);

				Object[] tableLines = bfr.lines().toArray(); 

				for (int i = 0; i < tableLines.length; i++) {
					String linee = tableLines[i].toString().trim();
					String[] dataRoww = linee.split(" "); 
					model1.addRow(dataRoww); 
				}
			} catch (Exception ex1) {
				JOptionPane.showMessageDialog(null, "error");
			}
		}
	}

	public class btnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			addbookGUI a = new addbookGUI();
			a.create();
		}
	}

	public class viewbtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			viewbooksGUI view = new viewbooksGUI();
			view.create();
			String filePath = "C:\\Users\\yaren\\eclipse-workspace\\library management system\\catalog.txt";
			File file = new File(filePath);
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				// ilk satırı alır
				// columns namei ilk satırdan alır
				// columnsnamei tableye tanımlar
				String firstLine = br.readLine().trim();
				String[] columnsname = firstLine.split(" / ");

				DefaultTableModel model = (DefaultTableModel) view.getTable().getModel();
				model.setColumnIdentifiers(columnsname);

				Object[] tableLines = br.lines().toArray();

				for (int i = 0; i < tableLines.length; i++) {
					String line = tableLines[i].toString().trim();
					String[] dataRow = line.split(" ");
					model.addRow(dataRow);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "error");
			}
			
		}
	}

	public class issuebtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			issuebookGUI issue = new issuebookGUI();
			issue.create();
		}
	}

	public class viewissuedbtnListener implements ActionListener {
		public void actionPerformed(ActionEvent ar) {
			view_issued_booksGUI ıguı = new view_issued_booksGUI();
			ıguı.create();
			try {
				String filePath = "C:\\Users\\yaren\\eclipse-workspace\\library management system\\view issued books.txt";
				File file = new File(filePath);
				BufferedReader br = new BufferedReader(new FileReader(file));
				// ilk satırı alır
				// columns namei ilk satırdan alır
				// columnsnamei tableye tanımlar
				String firstLine = br.readLine().trim();
				String[] columnsname = firstLine.split("/");

				DefaultTableModel model = (DefaultTableModel) ıguı.getTable().getModel();
				model.setColumnIdentifiers(columnsname);

				Object[] tableLines = br.lines().toArray();

				for (int i = 0; i < tableLines.length; i++) {
					String line = tableLines[i].toString().trim();
					String[] dataRow = line.split(" ");
					model.addRow(dataRow);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "error");
			}

			
		}

	}
	
	
	public class exitListener implements ActionListener{
		public void actionPerformed(ActionEvent t) {
			JFrame frame=new JFrame("exit");
			if(JOptionPane.showConfirmDialog(frame, "confirm if you want exit","exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
			System.exit(0);
		}
		
	}
}
