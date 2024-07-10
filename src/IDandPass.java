import java.util.HashMap;

public class IDandPass {

    //Intializing the HashMap
    //Storing username and password in HashMap
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    //constructor
    IDandPass(){

        loginInfo.put("Danil", "Omen");
        loginInfo.put("Ermo", "PRAHA");
        loginInfo.put("danace38", "pilotman123");


    }

    //getter method (sending login info)
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
