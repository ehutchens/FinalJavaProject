import java.awt.*;
import javax.swing.*;
import java.util.*;


public class jFrame extends JPanel {
	
	public jFrame() {
		setOpaque(false);
		setLayout(new FlowLayout());
		
	}

	public void adventCalendar(){
		JFrame frame2;
		frame2 = new JFrame("Advent Calendar");
	
		//creating the buttons
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
	    JButton b6=new JButton("6");
	    JButton b7=new JButton("7");
		JButton b8=new JButton("8");
	    JButton b9=new JButton("9");
		JButton b10=new JButton("10");
		JButton b11=new JButton("11");
		JButton b12=new JButton("12");
		JButton b13=new JButton("13");
		JButton b14=new JButton("14");
	    JButton b15=new JButton("15");
	    JButton b16=new JButton("16");
		JButton b17=new JButton("17");
	    JButton b18=new JButton("18");
		JButton b19=new JButton("19");
		JButton b20=new JButton("20");
		JButton b21=new JButton("21");
		JButton b22=new JButton("22");
		JButton b23=new JButton("23");
	    JButton b24=new JButton("24");
	    JButton b25=new JButton("25");
			
		//Adding an action to button 1
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "trial");
			}
		});
		
	    //adding the buttons to the frame
		frame2.add(b1);
		frame2.add(b2);
		frame2.add(b3);
		frame2.add(b4);
		frame2.add(b5);
		frame2.add(b6);
		frame2.add(b7);
		frame2.add(b8);
		frame2.add(b9);
		frame2.add(b10);
		frame2.add(b11);
		frame2.add(b12);
		frame2.add(b13);
		frame2.add(b14);
		frame2.add(b15);
		frame2.add(b16);
		frame2.add(b17);
		frame2.add(b18);
		frame2.add(b19);
		frame2.add(b20);
		frame2.add(b21);
		frame2.add(b22);
		frame2.add(b23);
		frame2.add(b24);
		frame2.add(b25);
		
		//setting the frame up and displaying it
		frame2.setLayout(new GridLayout(5,5));
		frame2.setSize(700,500);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLocationRelativeTo(null);
		

}
	public frame1() {
		
		JFrame frame1 = new JFrame("Advent Calendar");
		JPanel title = new JPanel();

		JButton startButton = new JButton("Start");
		JButton endButton = new JButton("End");
		
		jFrame c = new jFrame();
		c.add(startButton);
		c.add(endButton);
		c.add(title);
		
		frame1.add(c);
		frame1.setSize(700, 500);
		frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true); 
	}
	
	public void paint(Graphics g) {
		Image a = Toolkit.getDefaultToolkit().getImage("25DaysOfChristmas.jpg");
		g.drawImage(a,0,0,getSize().width,getSize().height,this);
		super.paint(g);
		
		
	}

}
