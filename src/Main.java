public class Main {
    public static void main(String[] args) {
        
        IDandPass idPass = new IDandPass();

        LoginPage loginPage = new LoginPage(idPass.getLoginInfo());
    }
}
