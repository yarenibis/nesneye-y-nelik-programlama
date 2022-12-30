package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.addcontroller;

public class addbookGUI implements IGUI {
private JFrame frame;
private JPanel panel;
private JButton addbookbtn;
private JButton back;
private JLabel lısbn;
private JLabel ltitle;
private JLabel lauthor;
private JLabel lquantity;
private JTextField tısbn;
private JTextField ttitle;
private JTextField tauthor;
private JTextField tquantity;
private addcontroller cont;

//frame ögelerini getter'lar içinde tanımladım
public JFrame getFrame() {
	if(frame==null) {//null pointer exeption almamak için
		frame=new JFrame();
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	return frame;
}


public JPanel getPanel() {
	if(panel==null) {
		panel=new JPanel();
	}
	return panel;
}



public JButton getAddbookbtn() {
	if(addbookbtn==null) {
	addbookbtn=new JButton("Add");
	addbookbtn.setBounds(60, 430, 100, 30);
	}
	return addbookbtn;
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


public JLabel getLquantity() {
	if(lquantity==null) {
	lquantity=new JLabel("Quantitiy :");
	lquantity.setBounds(50, 270, 150, 30);
	}
	return lquantity;
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


public JTextField getTquantity() {
	if(tquantity==null) {
	tquantity=new JTextField();
	tquantity.setBounds(200, 270, 150, 30);
	}
	return tquantity;
}

public String getTitle() { //jtextfield'a girilen değerleri almak için
	return ttitle.getText();
}

public int getIsbn() {
	return Integer.parseInt(tısbn.getText());
}

public String getAuthor() {
	return tauthor.getText();
}

public int getQ() {
	return Integer.parseInt(tquantity.getText());
}

//butonlara eklenecek actionlistenerları tanımladım
public void addbookbtnListener(ActionListener listener) {
	addbookbtn.addActionListener(listener);
}

public void backbtnListener(ActionListener listener) {
     back.addActionListener(listener);
}


public void create() {  //create metodu içinde frame'i oluşturdum
	this.getFrame().setContentPane(getPanel());
	getPanel().setLayout(null);
	getPanel().add(getLısbn());
	getPanel().add(getAddbookbtn());
	getPanel().add(getBack());
	getPanel().add(getLauthor());
	getPanel().add(getTauthor());
	getPanel().add(getLquantity());
	getPanel().add(getTquantity());
	getPanel().add(getTtitle());
	getPanel().add(getLtitle());
	getPanel().add(getLısbn());
	getPanel().add(getTısbn());
    cont=new addcontroller(this,null); //bu sayfa oluşturulduğunda otomatik olarak controller'de çalışır
    frame.setVisible(true);
}



}
