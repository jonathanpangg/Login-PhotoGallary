import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Image;
public class Login implements ActionListener{
	private final String USER = "Username";
	private final String PASS = "Password";
	private int x1 = 0;
	private String x3 = "";
	private long x5 = 0;
	private int [] x6;
	private static JFrame frame;
	private JPanel panel;
	private JLabel label1;
	private JTextField text1;
	private JLabel label2;
	private JPasswordField text2;
	private JButton button1;
	private JButton button2;
	private JButton button4;
	private JButton button6;
	private JButton button7;
	private ImageIcon image;
	private static JFrame options;
	private static JFrame picture1;
	public Login(){
		frame.setSize(270, 125);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
		label1 = new JLabel("Username: ");
		label1.setBounds(10, 10, 80, 25);
		panel.add(label1);
		
		text1 = new JTextField("");
		text1.setBounds(80, 10, 175, 25);
		panel.add(text1);
		
		label2 = new JLabel("Password: ");
		label2.setBounds(10, 40, 80, 25);
		panel.add(label2);
		
		text2 = new JPasswordField("");
		text2.setBounds(80, 40, 175, 25);
		text2.addActionListener(this);
		panel.add(text2);
		
		button1 = new JButton("Login");
		button1.setBounds(0, 70, 80, 25);
		button1.addActionListener(this);
		panel.add(button1);
	}
	public Login(JFrame options, int x1){
		options = new JFrame("Options");
		options.setSize(150, 300);
		options.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		options.add(panel);

		button2 = new JButton("Waves");
		button2.setBounds(35, 10, 80, 20);
		button2.addActionListener(this);
		panel.add(button2);

		button4 = new JButton("AP1 Graph");
		button4.setBounds(35, 40, 80, 20);
		button4.addActionListener(this);
		panel.add(button4);

		button6 = new JButton("Convergence");
		button6.setBounds(35, 70, 80, 20);
		button6.addActionListener(this);
		panel.add(button6);

		button7 = new JButton("Maclaurin");
		button7.setBounds(35, 100, 80, 20);
		button7.addActionListener(this);
		panel.add(button7);

		options.setResizable(false);
		options.setVisible(true);
	}
	public Login(JFrame picture1){
		picture1 = new JFrame("Waves");
		picture1.setSize(1500, 1500);
		picture1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());	
		image = new ImageIcon(getClass().getResource("screenshot.png"));
		Image itest = image.getImage();
		Image newimage = (Image)(itest.getScaledInstance(600, 900, java.awt.Image.SCALE_SMOOTH));
		image = new ImageIcon(newimage);
		label1 = new JLabel(image); 
		panel.add(label1); 
		picture1.add(panel);
		
		picture1.pack();
		picture1.setResizable(false);
		picture1.setVisible(true);
	}
	public Login(JFrame picture1, String x3){
		picture1 = new JFrame("AP1 Graph");
		picture1.setSize(1500, 1500);
		picture1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		image = new ImageIcon(getClass().getResource("IMG_0831.JPG"));
		Image itest = image.getImage();
		Image newimage = (Image)(itest.getScaledInstance(600, 900, java.awt.Image.SCALE_SMOOTH));
		image = new ImageIcon(newimage);
		label1 = new JLabel(image); 
		panel.add(label1); 
		picture1.add(panel);

		picture1.pack();
		picture1.setResizable(false);
		picture1.setVisible(true);
	}
	public Login(JFrame picture1, long x5){
		picture1 = new JFrame("Convergence");
		picture1.setSize(1500, 1500);
		picture1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		image = new ImageIcon(getClass().getResource("IMG_3820.JPG"));
		Image itest = image.getImage();
		Image newimage = (Image)(itest.getScaledInstance(600, 900, java.awt.Image.SCALE_SMOOTH));
		image = new ImageIcon(newimage);
		label1 = new JLabel(image); 
		panel.add(label1); 
		picture1.add(panel);

		picture1.pack();
		picture1.setResizable(false);
		picture1.setVisible(true);
	}
	public Login(JFrame picture1, int [] x6){
		picture1 = new JFrame("Maclaurin");
		picture1.setSize(1500, 1500);
		picture1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		image = new ImageIcon(getClass().getResource("IMG_3476.JPG"));
		Image itest = image.getImage();
		Image newimage = (Image)(itest.getScaledInstance(600, 900, java.awt.Image.SCALE_SMOOTH));
		image = new ImageIcon(newimage);
		label1 = new JLabel(image); 
		panel.add(label1); 
		picture1.add(panel);

		picture1.pack();
		picture1.setResizable(false);
		picture1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button1){
			String password = text2.getText();
			String username = text1.getText();
			if(password.equals(PASS) && username.equals(USER)){
				JOptionPane.showMessageDialog(null, "Welcome!");
				new Login(options, x1);
			}
			else{
				JOptionPane.showMessageDialog(null, "Either your username or password is incorrect! ");
			}
		}
		else if(e.getSource()==button2){
			new Login(picture1);
		}
		else if(e.getSource()==button4){
			new Login(picture1, x3);
		}
		else if(e.getSource()==button6){
			new Login(picture1, x5);
		}
		else if(e.getSource()==button7){
			new Login(picture1, x6);
		}
	}
	public static void main(String [] args){
		frame = new JFrame("Login");
		new Login();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
