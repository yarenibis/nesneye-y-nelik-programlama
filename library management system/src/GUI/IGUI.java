package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

interface IGUI {  //issuebook ve addbook'ta bulunması gereken metotlar
	//ama her ikisinde farklı şekillerde kullanılır
	public  JFrame  getFrame();
	public JPanel getPanel();
    public void create();
    public JLabel getLısbn();
	public JLabel getLtitle();
	public JLabel getLauthor();
	public JTextField getTısbn();
	public JTextField getTtitle();
	public JTextField getTauthor();
	public String getTitle();
	public int getIsbn();
	public String getAuthor();
	
	
}
