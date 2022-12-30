package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.addcontroller;
import controller.issuebookcontroller;

public class issuebookGUI implements IGUI{
	private JFrame frame;
	private JPanel panel;
	private JButton issuebtn;
	private JButton back;
	private JLabel lısbn;
	private JLabel ltitle;
	private JLabel lauthor;
	private JLabel lstudent;
	private JTextField tısbn;
	private JTextField ttitle;
	private JTextField tauthor;
	private JTextField tstudent;
    private JButton createtrans;


	public JFrame getFrame() {
		if(frame==null) {
			frame=new JFrame();
			frame.setSize(400, 600);
			
		}
		return frame;
	}


	public JPanel getPanel() {
		if(panel==null) {
			panel=new JPanel();
		}
		return panel;
	}



	public JButton issuebtn() {
		if(issuebtn==null) {
		issuebtn=new JButton("Add");
		issuebtn.setBounds(60, 430, 100, 30);
		}
		return issuebtn;
	}
	
	public JButton getCreatetrans() {
		if(createtrans==null) {
		createtrans=new JButton("Create transaction");
		createtrans.setBounds(60, 470,160, 30);
		}
		return createtrans;
	}


	public JButton getBack() {
		if(back==null) {
		back=new JButton("Back");
		back.setBounds(230,430,100,30);
		}
		return back;
	}


	public JLabel getLısbn() {
		if(lısbn==null) {
		lısbn=new JLabel("ISBN :");
		lısbn.setBounds(50, 60, 150, 30);
		}
		return lısbn;
	}


	public JLabel getLtitle() {
		if(ltitle==null) {
		ltitle=new JLabel("Title :");
		ltitle.setBounds(50, 130, 150, 30);
		}
		return ltitle;
	}


	public JLabel getLauthor() {
		if(lauthor==null) {
		lauthor=new JLabel("Author :");
		lauthor.setBounds(50, 200, 150, 30);
		}
		return lauthor;
	}

    public JLabel getLstudent() {
    	if(lstudent==null) {
    	lstudent=new JLabel("student id :");
    	lstudent.setBounds(50, 270, 150, 30);
    	}
    	return lstudent;
    }

    
    public JTextField getTstudent() {
    	if(tstudent==null) {
    	tstudent=new JTextField();
    	tstudent.setBounds(200, 270, 150, 30);
    	}
    	return tstudent;
    }

	public JTextField getTısbn() {
		if(tısbn==null) {
		tısbn=new JTextField();
		tısbn.setBounds(200, 60, 150, 30);
		}
		return tısbn;
	}


	public JTextField getTtitle() {
		if(ttitle==null) {
		ttitle=new JTextField();
		ttitle.setBounds(200, 130, 150, 30);
		}
		return ttitle;
	}


	public JTextField getTauthor() {
		if(tauthor==null) {
		tauthor=new JTextField();
		tauthor.setBounds(200, 200, 150, 30);
		}
		return tauthor;
	}

   public String getStudent() {//kullanıcının texfield'a girdiği input'u aldım
	   return tstudent.getText();
   }

	public String getTitle() {
		return ttitle.getText();
	}

	public int getIsbn() {
		
		return Integer.parseInt(tısbn.getText());
	}

	public String getAuthor() {
		return tauthor.getText();
	}

	public void issuebookbtnListener(ActionListener listener) {
		issuebtn.addActionListener(listener);
	}
	
	public void createtransListener(ActionListener listener) {
		createtrans.addActionListener(listener);
	}
	
	public void backbtnListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	
	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getLısbn());
		getPanel().add(issuebtn());
		getPanel().add(getBack());
		getPanel().add(getLauthor());
		getPanel().add(getTauthor());
		getPanel().add(getTtitle());
		getPanel().add(getLtitle());
		getPanel().add(getLısbn());
		getPanel().add(getTısbn());
		getPanel().add(getTstudent());
		getPanel().add(getLstudent());
		getPanel().add(getCreatetrans());
		issuebookcontroller cont=new issuebookcontroller(this);
	    frame.setVisible(true);
	}
}
