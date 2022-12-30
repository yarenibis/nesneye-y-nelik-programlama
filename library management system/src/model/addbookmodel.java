package model;

import java.io.FileWriter;

import javax.swing.JOptionPane;

import GUI.addbookGUI;

public class addbookmodel  {
	private addbookGUI view;
	private int ısbn;
	private String title;
	private String author;
	private int quant;


	public addbookmodel( int ısbn, String title, String author, int quant) {
		super();
		ısbn = ısbn;
		this.title = title;
		this.author = author;
		this.quant = quant;
	}

	public addbookmodel() {
		super();
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
	public int getQuant() {
		return quant;
	}

	public void addbookdetails(int ısbn,String title,String author,int quant) {//kitap bilgilerini dosyaya ekler
		try {
			FileWriter Writer = new FileWriter("catalog.txt", true);//filewriter=dosyaya yazar
			Writer.write("" + ısbn + " " + title + " " + author + " " + quant + "\n");
			Writer.close();
			JOptionPane.showMessageDialog(null, "success");
			//sıfırdan yeni işlem yapabilmek için ,her işlemden sonra yeni sayfa açar
			view.getFrame().setVisible(false);
			addbookGUI yeni = new addbookGUI();
			yeni.create();

		} catch (Exception m) {
			
		}
	}
}
