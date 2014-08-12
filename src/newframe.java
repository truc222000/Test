import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class newframe extends JFrame {

public static void main(String[] args) {
newframe frameTabel = new newframe();
}

JLabel welcome = new JLabel("Welcome to a New Frame");
JPanel panel = new JPanel();

newframe(){
super("East West Manager");
setSize(700,500);
setLocation(200,50);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}