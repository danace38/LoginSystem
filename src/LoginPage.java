import java.util.HashMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {

    //creating a GUI, buttons, fields, and labels
    JFrame frame =  new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID: ");
    JLabel userPassworLabel = new JLabel("Password: ");
    JLabel msgLabel = new JLabel(""); //Success label
    HashMap<String,String> logininfo = new HashMap<String,String>(); //declarign and initializing the HashMap
 

    LoginPage(HashMap<String,String> OrigLoginInfo){

        logininfo = OrigLoginInfo;


        //Setting bound for User ID label and Password label
        userIDLabel.setBounds(65,99,75,25);
        userPassworLabel.setBounds(50,150,75,25);

        msgLabel.setBounds(125,250,300,35);
        msgLabel.setFont(new Font(null,Font.ITALIC,25));

        //User ID field and Password field

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125, 150, 200, 25);

        //Creating log in button
        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);

        //Adding labels and fields to the frame
        frame.add(userIDLabel);
        frame.add(userPassworLabel); 
        frame.add(msgLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setTitle("Login System");
        ImageIcon image = new ImageIcon("src/7067965.png");
        frame.setIconImage(image.getImage());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(390,390);
        frame.setLayout(null);
        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
        //clear out fields when clicking on Reset button
        if(e.getSource()==resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
            msgLabel.setForeground(Color.BLACK);
            msgLabel.setText("Performing Reset");
        }

        //retrieving password and converting it to the String. Storing within the String.
        if(e.getSource()==loginButton){
            String userID = userIDField.getText();
            String userPass = String.valueOf(userPasswordField.getPassword());
    

            //Verify if the user ID is associated with the one inside the Hash Map
            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(userPass)){
                    msgLabel.setForeground(Color.GREEN);
                    msgLabel.setText("Successful Login!");
                    frame.dispose(); //Closing the login frame
                    WelcomePage welcomePage = new WelcomePage(userID); //Next page
                }else{
                    msgLabel.setForeground(Color.DARK_GRAY);
                    msgLabel.setText("Wrong password");

                }
            }
            else{
                msgLabel.setForeground(Color.RED);
                msgLabel.setText("ID DOESN'T EXIST!");
            }

        }
    }

}
