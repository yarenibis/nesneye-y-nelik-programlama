package model;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

import GUI.LibrarianLoginGUI;
import GUI.librarianMenuGUI;

public class LibrarianLoginmodel implements Ilogin {
	private String name;
	private String password;

	public LibrarianLoginmodel() {

	}

	public LibrarianLoginmodel(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public void login(String name, String pwd) {// interface'teki login metodu ,iki sinifta da farklı özelliklerle kullanılmış
		try {

			boolean found = false;
			String filename = "";
			String filepwd = "";
			
            //scanner=dosyadan okuma yapar
			Scanner x = new Scanner(new File("C:\\Users\\yaren\\eclipse-workspace\\library management system\\librarianinfo.txt"));
			x.useDelimiter("[,\n]"); //ayraçlara gelince ayırır
			while (x.hasNext() && !found) {
				filename = x.next();//ilk kısım
				filepwd = x.next();//ikinci kısım
				if (filename.trim().equals(name) && filepwd.trim().equals(pwd)) {//trim=boşlukları kaldırır
					found = true;
					librarianMenuGUI h = new librarianMenuGUI();
					h.create();
				}
			}
		}

		catch (Exception m) {
			JOptionPane.showMessageDialog(null, "mistake");

		}
	}

}
