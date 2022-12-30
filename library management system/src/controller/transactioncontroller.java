package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JOptionPane;

import GUI.addbookGUI;
import GUI.transactionGUI;
import model.transactionmodel;

public class transactioncontroller {
	private transactionGUI trans;

	public transactioncontroller(transactionGUI trans) {
		super();
		this.trans = trans;
		trans.createtransListener(new createtransListener());
	}

	public class createtransListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int transno = Integer.parseInt(trans.getFtrans().getText());
			int book_ısbn = Integer.parseInt(trans.getFısbn().getText());
			String studentıd = trans.getFıd().getText();

			transactionmodel model=new transactionmodel();
			model.transaction(transno, book_ısbn, studentıd);
		}
	}

}
