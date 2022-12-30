package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class login {//bu sınıf librarian ve member için ortak
	
	private JFrame frame;
	private JPanel panel;
	private JButton loginbtn;
	private JLabel nameLabel;
	private JTextField nameField;
	private JLabel passwordLabel;
	private JPasswordField passwordField;

	

	public JFrame getFrame() {
		if (frame == null) {
			frame = new JFrame();
			frame.setSize(600, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		return frame;
	}

	
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}

	
	public JButton getLoginbtn() {
		if (loginbtn == null) {
			loginbtn = new JButton("Login");
			loginbtn.setSize(120, 40);
			loginbtn.setLocation(232, 260);
		}
		return loginbtn;
	}

	
	public JLabel getNameLabel() {
		if(nameLabel==null) {
		nameLabel = new JLabel("Enter name :");
		nameLabel.setBounds(69, 94, 92, 27);
		}
		return nameLabel;
	}

	
	public JTextField getNameField() {
		if(nameField==null) {
		nameField = new JTextField();
		nameField.setBounds(232, 94, 122, 27);
		}
		return nameField;
	}

	
	public JLabel getPasswordLabel() {
		if(passwordLabel==null) {
		passwordLabel = new JLabel("Enter ID :");
		passwordLabel.setBounds(69, 186, 92, 22);
		}
		return passwordLabel;
	}

	public JPasswordField getPasswordField() {
		if(passwordField==null) {
		passwordField = new JPasswordField();
		passwordField.setBounds(235, 192, 119, 27);
		}
		return passwordField;
	}

	public String getName() {
		return nameField.getText();
	}

	
	public String getPwd() {
		return passwordField.getText();
	}

	
	public void addbtnListener(ActionListener listener) {
		getLoginbtn().addActionListener(listener);

	}

}
