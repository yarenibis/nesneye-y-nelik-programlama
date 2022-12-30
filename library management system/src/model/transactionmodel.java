package model;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class transactionmodel {
private int transno;
private int book_ısbn;
private String studentıd;


	
	
	public transactionmodel(int transno, int book_ısbn, String studentıd) {
	super();
	this.transno = transno;
	this.book_ısbn = book_ısbn;
	this.studentıd = studentıd;
}




	public transactionmodel() {
		super();
	}




	public void transaction(int transno,int book_ısbn,String studentıd) {//ödünç kitap ve öğrenci ile ilgili verileri kaydeder
		
		try {
			FileWriter Writer = new FileWriter("transaction.txt", true);
			Writer.write("" + transno + " " + book_ısbn + " " + studentıd + "\n");
			Writer.close();
			JOptionPane.showMessageDialog(null, "success");

		} catch (Exception m) {
			JOptionPane.showMessageDialog(null, "error");
		}
	}
}
