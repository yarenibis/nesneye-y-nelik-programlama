package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

import GUI.librarianMenuGUI;
import GUI.memberLoginGUI;
import GUI.memberMenuGUI;

public class memberLoginmodel implements Ilogin,login2 {
	private GUI.login GUI;
	private memberMenuGUI menu;
	private String name;
	private String password;

	public memberLoginmodel() {

	}

	public memberLoginmodel(String name, String password) {
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

	public void login(String membername, String memberpwd) {
		try {

			boolean found = false;

			String memberfilename = "";
			String memberfilepwd = "";

			Scanner x = new Scanner(new File("C:\\Users\\yaren\\eclipse-workspace\\library management system\\memberinfo.txt"));
			x.useDelimiter("[,\n]");
			while (x.hasNext() && !found) {
				memberfilename = x.next();
				memberfilepwd = x.next();
				if (memberfilename.trim().equals(membername) && memberfilepwd.trim().equals(memberpwd)) {
					found = true;
					menu = new memberMenuGUI();
					menu.create();
				}
			}
		}
		catch (Exception m) {
			JOptionPane.showMessageDialog(null, "mistake");
		}
	}
	
	
	

	public void printaccount(String name, String ıd) {//account sayfası için gerekli bilgileri dosyadan çeker
		try {
			//ad ve ıd girildiğinde bu bilgileri çekip account sayfasında kullanır
			menu.getFname().setText(name); 
			menu.getFıd().setText(ıd);
			String filePath = "C:\\Users\\yaren\\eclipse-workspace\\library management system\\view issued books.txt";

			BufferedReader bret = new BufferedReader(new FileReader(filePath));//okuma yapar
			String line;
			while ((line = bret.readLine()) != null) {
				String[] parts = line.split(" ");//boşlukları gördükçe parçalara ayırıp diziye atar
				String studentıd = parts[3];//dosyada son sütun student ıd bilgilerini içerir
				if (ıd.equals(studentıd)) {

					menu.getFissued_books().setText(parts[1]);//ödünç alınan kitabı gösterir

				}
			}
		}
		catch (Exception b) {

		}
	}
}
