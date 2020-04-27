package edu.zzu.project25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Demo10_Gui {

	public static void main(String[] args) {
         Frame f = new Frame("Äã³òÉ¶£¿");
         f.setSize(400, 500);
         f.setLocation(500, 500);
        // f.setIconImage(Toolkit.getDefaultToolkit());
         Button b1 = new Button("°´Å¥Ò»");
         Button b2 = new Button("°´Å¥2");
         Button b3 = new Button("°´Å¥3");
         Button b4 = new Button("°´Å¥4");
         f.add(b1);
         f.add(b2);
         f.add(b3);
         f.add(b4);
         
         f.setLayout(new FlowLayout());
		 f.addWindowListener(new MyWindowListener());
		 b1.addMouseListener(new MouseAdapter() {
			 @Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		 b1.addKeyListener(new KeyAdapter() {
			 @Override
			public void keyReleased(KeyEvent e) {
				System.exit(0);
			}
		});
         f.setVisible(true);
         
	}

}
class MyWindowListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("clased");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("clased");
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	
}
