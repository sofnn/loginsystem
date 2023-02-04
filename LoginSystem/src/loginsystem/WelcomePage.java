package loginsystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WelcomePage {
    
    JButton menuButton = new JButton("menu");
    JFrame frame=new JFrame();
    JLabel welcomeLabel= new JLabel("hiii");
    
    WelcomePage(){
        
        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null,Font.BOLD,15));
        
        menuButton.setBounds(125,200,100,25);
        menuButton.setFont(new Font(null,Font.PLAIN,25));
        
        frame.add(welcomeLabel);
        frame.add(menuButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}



