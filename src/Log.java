import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

public class Log extends JFrame {

public static void main(String[] args) {
	Log frameTabel = new Log();
}

JButton blogin = new JButton("Sign In");
JButton bcancel = new JButton("Cancel");

JPanel panel = new JPanel();

JLabel headerTxt = new JLabel ("Sign In");
JLabel text1 = new JLabel ("Enter your Soundsonline (SOL) email and password to login");
JLabel userName = new JLabel ("User ID");
JLabel pwd = new JLabel ("Password");

JTextField userInput = new JTextField(15);
JPasswordField pwInput = new JPasswordField(15);

//create new font
Font signInFont = new Font("Arial", Font.BOLD, 30);
Font titleFont = new Font("Serif", Font.BOLD, 20);

Border lineBorder = new LineBorder(Color.RED, 5);
Border titledBorder = new TitledBorder(lineBorder, "Sign In", TitledBorder.LEFT,
        TitledBorder.BELOW_BOTTOM, titleFont, Color.RED);

Log(){
	super("East West Manager");
	setSize(700,500);
	setLocation(200,50);
	panel.setLayout (null); 
	
	headerTxt.setBounds(20, 30, 400, 40);
	text1.setBounds(20, 70, 400, 20);
	userName.setBounds(100, 200, 100, 30);
	pwd.setBounds(100, 230, 100, 30);
	userInput.setBounds(200,200,200,20);
	pwInput.setBounds(200,230,200,20);
	blogin.setBounds(200,270,80,20);
	bcancel.setBounds(300, 270, 80, 20);
	
   
	//headerTxt.setBorder(titledBorder);
	//headerTxt.setHorizontalAlignment(JLabel.CENTER);
	//set font to Jlabel
	headerTxt.setFont(signInFont);
	
	panel.add(headerTxt);
	panel.add(text1);
	panel.add(userName);
	panel.add(pwd);
	panel.add(userInput);
	panel.add(pwInput);
	panel.add(blogin);
	panel.add(bcancel);
	
	getContentPane().add(panel);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	actionlogin();
}

public void actionlogin(){
	blogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			String puname = userInput.getText();
			String ppaswd = pwInput.getText();
			if(puname.equals("test") && ppaswd.equals("12345")) {
				newframe regFace =new newframe();
				regFace.setVisible(true);
				dispose();
			} 
			else {
				JOptionPane.showMessageDialog(null,"Wrong Password / Username");
				userInput.setText("");
				pwInput.setText("");
				userInput.requestFocus();
			}

		}
	});
}
}