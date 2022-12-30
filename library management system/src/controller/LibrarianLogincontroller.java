package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;
import GUI.LibrarianLoginGUI;
import GUI.librarianMenuGUI;
import model.LibrarianLoginmodel;

public class LibrarianLogincontroller {
	private LibrarianLoginGUI GUI;
	private LibrarianLoginmodel model;

	public LibrarianLogincontroller(LibrarianLoginGUI GUI) {

		this.GUI = GUI;
		GUI.addbtnListener(new btnListener());
	}

	public class btnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String name = GUI.getName();
			String pwd = GUI.getPwd();

			model=new LibrarianLoginmodel();
			model.login(name, pwd);
		}
	}
}


