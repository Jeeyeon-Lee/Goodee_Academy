package bclass.step2;

import javax.swing.JFrame;

public class DMain extends JFrame{
	JFrame jf = new DMain();
	
	public void initDisplay() {
		this.setVisible(true);
		this.setSize(100,200);
		this.setTitle("this 창");
		super.setVisible(true);
		super.setSize(200,300);
		super.setTitle("super 창");
		jf.setVisible(true);
		jf.setSize(300,400);
		jf.setTitle("jf 창");
		
	}
	public static void main(String[] args) {
		DMain dm = new DMain();
		dm.initDisplay();
	}

}
