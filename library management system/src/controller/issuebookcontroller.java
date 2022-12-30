package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JOptionPane;
import GUI.issuebookGUI;
import GUI.transactionGUI;
import model.issuebookmodel;

public class issuebookcontroller {
	private issuebookGUI issue;

	public issuebookcontroller(issuebookGUI issue) {
		this.issue = issue;
		issue.issuebookbtnListener(new issuebtnListener());
		issue.createtransListener(new transListener());
		issue.backbtnListener(new backbtnListener());
	}

	public class transListener implements ActionListener {
		public void actionPerformed(ActionEvent en) {
			int ısbn = Integer.parseInt(issue.getTısbn().getText()); //kitap ödünç alınırken girilen bilgileri alır
			String studentıd = issue.getTstudent().getText();
			transactionGUI transs = new transactionGUI();
			
			transs.getFısbn().setText(String.valueOf(ısbn));//bu bilgileri transaction sayfasında kullanır
			transs.getFıd().setText(studentıd);
			transs.create();

		}
	}

	
	public class issuebtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String title = issue.getTitle();
			int ısbn = issue.getIsbn();
			String author = issue.getAuthor();
			String student = issue.getStudent();

			issuebookmodel model=new issuebookmodel();
			model.issue(ısbn, title, author, student);
		}
	}
	
	
	public class backbtnListener implements ActionListener {
		public void actionPerformed(ActionEvent k) {
			issue.getFrame().setVisible(false);
		}
	}
}
