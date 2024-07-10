import java.util.HashMap;
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
    JLabel userIDLabel = new JLabel("User ID");
    JLabel userPassworLabel = new JLabel("Password: ");
    JLabel msgLabel = new JLabel(); //Success label
    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> OrigLoginInfo){

        logininfo = OrigLoginInfo;

        userIDLabel.setBounds(50,90,75,25);
        userPassworLabel.setBounds(50,120,75,25);


        frame.add(userIDLabel);
        frame.add(userPassworLabel); 

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
