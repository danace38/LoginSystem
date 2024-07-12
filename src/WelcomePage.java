import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("src/7067965.png");
    JLabel welcomeLabel = new JLabel("Welcome!");



    WelcomePage(String userID){

        frame.setTitle("Welcome Page");
        frame.setIconImage(image.getImage());

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        welcomeLabel.setText("Hello, " + userID);

        
        frame.add(welcomeLabel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
