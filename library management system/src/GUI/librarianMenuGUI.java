package GUI;


	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

import controller.LibrarianLogincontroller;
import controller.addcontroller;
import controller.librarianMenucontroller;
import controller.librarycontroller;

	public class librarianMenuGUI {
		private JFrame frame;
		private JPanel panel;
		private JButton searchbookbtn;
	    private JButton addbtn;
	    private JButton viewbtn;
	    private JButton issuebtn;
	    private JButton viewissuedbtn;
	    private JButton returnbtn;
	    private JButton transaction;
	    private JButton exitbtn;
	   
	   public JFrame getFrame() {
			if(frame==null) {
				frame=new JFrame();
				frame.setSize(400,700);
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
		
        
		
		public JButton getAddbtn() {
			if(addbtn==null) {
		     addbtn=new JButton("add books");
		     addbtn.setBounds(100, 30, 200, 50);
			}
			return addbtn;
		}


		
		

		public JButton getViewbtn() {
			if(viewbtn==null) {
			viewbtn=new JButton("view books");
			viewbtn.setBounds(100, 110, 200,50);
			}
			return viewbtn;
		}




		public JButton getIssuebtn() {
			if(issuebtn==null) {
			issuebtn=new JButton("issue book");
			issuebtn.setBounds(100, 190, 200, 50);
			}
			return issuebtn;
		}



		public JButton getViewissuedbtn() {
			if(viewissuedbtn==null) {
			viewissuedbtn=new JButton("view issued books");
			viewissuedbtn.setBounds(100, 270, 200, 50);
			}
			return viewissuedbtn;
		}



		public JButton getReturnbtn() {
			if(returnbtn==null) {
			returnbtn=new JButton("return book");
			returnbtn.setBounds(100, 350, 200, 50);
			}
			return returnbtn;
		}

        public JButton getSearchbookbtn() {
        	if(searchbookbtn==null) {
        		searchbookbtn=new JButton("Search book");
        		searchbookbtn.setBounds(100, 430, 200, 50);
        	}
        	return searchbookbtn;
        }
        
       
        public JButton getExitbtn() {
			if(exitbtn==null) {
			exitbtn=new JButton("EXİT");
			exitbtn.setBounds(100, 510, 200,50);
			}
			return exitbtn;
		}
		
       

		public void addbtnListener(ActionListener listener) {
		    addbtn.addActionListener(listener);
		  }
		
		public void viewbtnListener(ActionListener listener) {
		    viewbtn.addActionListener(listener);
		  }
		
		public void issuebtnListener(ActionListener listener) {
		    issuebtn.addActionListener(listener);
		  }
		
		public void viewissuedbtnListener(ActionListener listener) {
		    viewissuedbtn.addActionListener(listener);
		  }
		
		public void returnbtnListener(ActionListener listener) {
		    returnbtn.addActionListener(listener);
		  }
		
		public void searchbookListener(ActionListener listener) {
		    searchbookbtn.addActionListener(listener);
		}
		
		public void exitListener(ActionListener listener) {
			exitbtn.addActionListener(listener);
		}
		
		
		
		public void create() {
			this.getFrame().setContentPane(getPanel());
			getPanel().setLayout(null);
			getPanel().add(getAddbtn());
			getPanel().add(getViewbtn());
			getPanel().add(getIssuebtn());
			getPanel().add(getViewissuedbtn());
			getPanel().add(getReturnbtn());
			getPanel().add(getSearchbookbtn());
			getPanel().add(getExitbtn());
			librarianMenucontroller add=new librarianMenucontroller(this);
			frame.setVisible(true);
		}
	  
		}
