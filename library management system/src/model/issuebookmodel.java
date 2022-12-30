package model;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class issuebookmodel {
private int ısbn;
private String title;
private String author;
private String student;


public issuebookmodel() {
	super();
}


public issuebookmodel(int isbn, String title, String author, String student) {
	super();
	ısbn = isbn;
	this.title = title;
	this.author = author;
	this.student = student;
}

	
public int getIsbn() {
	return ısbn;
}



public String getTitle() {
	return title;
}



public String getAuthor() {
	return author;
}



public String getStudent() {
	return student;
}




public void issue(int ısbn,String title,String author,String student) {//ödünç kitap ve öğrenci verilerini dosyaya kaydeder
	try {

		FileWriter Writer = new FileWriter("view issued books.txt", true);
		Writer.write("" + ısbn + " " + title + " " + author + " " + student + "\n");
		Writer.close();
		JOptionPane.showMessageDialog(null, "success");
		
		

	} catch (Exception m) {
		JOptionPane.showMessageDialog(null, "error");
	}
}
}
