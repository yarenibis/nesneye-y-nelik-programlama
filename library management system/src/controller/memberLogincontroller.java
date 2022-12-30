package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;
import GUI.librarianMenuGUI;
import GUI.memberLoginGUI;
import GUI.memberMenuGUI;
import model.LibrarianLoginmodel;
import model.memberLoginmodel;

public class memberLogincontroller {

	private memberLoginGUI GUI;


	public memberLogincontroller(memberLoginGUI GUI) {

		this.GUI = GUI;
		GUI.addbtnListener(new btnListener());
	}

	public class btnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String membername = GUI.getName();//kullanıcının girdiği değerler (login için)
			String memberpwd = GUI.getPwd();
			
			String name = GUI.getName(); //login sayfasına girilen 
			String ıd = GUI.getPwd();

			memberLoginmodel member=new memberLoginmodel();
			member.login(membername, memberpwd);
			member.printaccount(name, ıd);
		}
	}
}
				
	

