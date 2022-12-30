package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import GUI.memberMenuGUI;
import GUI.searchGUI;

public class memberMenucontroller {
	private memberMenuGUI menu;
	private searchGUI g;

	public memberMenucontroller(memberMenuGUI menu) {
		this.menu = menu;
		menu.addsearchbtnListener(new searchListener());

	}

	public class searchListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			searchGUI g1 = new searchGUI();
			g1.create();
		}
	}

}




