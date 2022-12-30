package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.searchcontroller;

public class searchGUI {
	private JFrame frame;
	private JPanel panel;
	private JLabel labelname;
	private JTextField fname;
	private JButton search;

	private JLabel yısbn, ytitle, yauthor, yquant;
	private JLabel y1, y2, y3, y4, y5;

	public JFrame getFrame() {
		if (frame == null) {
			frame = new JFrame();
			frame.setSize(400, 600);
		}
		return frame;
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}

	public JLabel getLabelname() {
		if (labelname == null) {
			labelname = new JLabel("Book name");
			labelname.setBounds(50, 100, 100, 25);
		}
		return labelname;
	}

	public JTextField getFname() {
		if (fname == null) {
			fname = new JTextField();
			fname.setBounds(200, 100, 100, 25);
		}
		return fname;
	}

	public JButton getSearch() {
		if (search == null) {
			search = new JButton("Search");
			search.setBounds(50, 175, 120, 30);
		}
		return search;
	}

	public JLabel getYısbn() {
		if (yısbn == null) {
			yısbn = new JLabel("ısbn :");
			yısbn.setBounds(50, 255, 100, 25);
			yısbn.setVisible(false);
		}
		return yısbn;
	}

	public JLabel getYtitle() {

		if (ytitle == null) {
			ytitle = new JLabel("title :");
			ytitle.setBounds(50, 305, 100, 25);
			ytitle.setVisible(false);
		}
		return ytitle;
	}

	public JLabel getYauthor() {
		if (yauthor == null) {
			yauthor = new JLabel("author :");
			yauthor.setBounds(50, 355, 100, 25);
			yauthor.setVisible(false);
		}
		return yauthor;
	}

	public JLabel getYquant() {
		if (yquant == null) {
			yquant = new JLabel("quantitiy :");
			yquant.setBounds(50, 405, 100, 25);
			yquant.setVisible(false);
		}
		return yquant;
	}

	public JLabel getY1() {
		if (y1 == null) {
			y1 = new JLabel();
			y1.setBounds(200, 255, 100, 25);
			y1.setVisible(false);
		}
		return y1;
	}

	public JLabel getY2() {
		if (y2 == null) {
			y2 = new JLabel();
			y2.setBounds(200, 305, 100, 25);
			y2.setVisible(false);
		}
		return y2;
	}

	public JLabel getY3() {
		if (y3 == null) {
			y3 = new JLabel();
			y3.setBounds(200, 355, 100, 25);
			y3.setVisible(false);
		}
		return y3;
	}

	public JLabel getY4() {
		if (y4 == null) {
			y4 = new JLabel();
			y4.setBounds(200, 405, 100, 25);
			y4.setVisible(false);
		}
		return y4;
	}

	public void searchbtnListener(ActionListener listener) {
		search.addActionListener(listener);

	}

	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getFname());
		getPanel().add(getLabelname());
		getPanel().add(getSearch());
		getPanel().add(getYtitle());
		getPanel().add(getYısbn());
		getPanel().add(getYauthor());
		getPanel().add(getYquant());
		getPanel().add(getY1());
		getPanel().add(getY3());
		getPanel().add(getY2());
		getPanel().add(getY4());
		searchcontroller l = new searchcontroller(this);
		getFrame().setVisible(true);
	}

}
