import java.util.HashMap;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {

    JFrame frame =  new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Login");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID: ");
    JLabel userPassworLabel = new JLabel("Password: ");
    JLabel msgLabel = new JLabel(""); //Success label
    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> OrigLoginInfo){

        logininfo = OrigLoginInfo;


        //Setting bound for User ID label and Password label
        userIDLabel.setBounds(65,99,75,25);
        userPassworLabel.setBounds(50,150,75,25);

        msgLabel.setBounds(125,250,250,35);
        msgLabel.setFont(new Font(null,Font.ITALIC,25));

        //User ID field and Password field

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125, 150, 200, 25);


        frame.add(userIDLabel);
        frame.add(userPassworLabel); 
        frame.add(msgLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(390,390);
        frame.setLayout(null);
        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
