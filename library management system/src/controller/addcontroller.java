package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.io.FileWriter;
import java.io.Writer;

import javax.naming.BinaryRefAddr;
import javax.swing.JOptionPane;

import GUI.addbookGUI;
import GUI.librarianMenuGUI;
import model.addbookmodel;

public class addcontroller {
    private addbookmodel model;
	private addbookGUI view;

	public addcontroller(addbookGUI view,addbookmodel model) {
		this.model=model;
		this.view = view;
		view.addbookbtnListener(new addbtnListener());
		view.backbtnListener(new backbtnListener());
	}

	
	public class backbtnListener implements ActionListener { 
		public void actionPerformed(ActionEvent k) {
			view.getFrame().setVisible(false); //back butonu
		}
	}

	
	public class addbtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String title = view.getTitle();  //texfield'a girilen input'u değişkene atadım
			int ısbn = view.getIsbn();
			String author = view.getAuthor();
			int q = view.getQ();
			
			addbookmodel m=new addbookmodel();
			m.addbookdetails(ısbn, title, author, q);
		    
		}
	}

}
