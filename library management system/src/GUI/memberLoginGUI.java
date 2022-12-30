package GUI;

import java.awt.event.ActionListener;

import controller.LibrarianLogincontroller;
import controller.memberLogincontroller;

public class memberLoginGUI extends login {

	
	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getNameLabel());
		getPanel().add(getPasswordLabel());
		getPanel().add(getNameField());
		getPanel().add(getPasswordField());
		getPanel().add(getLoginbtn());
		memberLogincontroller controller = new memberLogincontroller(this);
		getFrame().setVisible(true);

	}
}
