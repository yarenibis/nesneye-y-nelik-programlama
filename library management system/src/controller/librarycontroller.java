package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.LibrarianLoginGUI;
import GUI.libraryGUI;
import GUI.memberLoginGUI;



public class librarycontroller {
	private libraryGUI l;
	private LibrarianLoginGUI m;
	private memberLoginGUI member;

	public librarycontroller(libraryGUI l) {
		this.l = l;
		l.addButtonListener(new ButtonListener());//librarian için actionlistener
		l.addmButtonListener(new memberbtnListener());//member butonu için
	}

	
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			LibrarianLoginGUI m = new LibrarianLoginGUI();
			m.create();
		}
	}

	
	class memberbtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			memberLoginGUI member = new memberLoginGUI();
			member.create();
		}
	}

}




