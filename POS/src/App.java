
public class App {
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        boolean login = LoginFrame.isLogReturn();
        while (login == false) {
            login = LoginFrame.isLogReturn();
            System.out.println();
            if (login == true) {
                int level = LoginFrame.getUserLevel();
                if (level == 0) {// waiter
                    loginFrame.dispose();
                    new MyFrame();
                    return;
                } else if (level == 1) {// cook
                    loginFrame.dispose();
                    new cookFrame();
                    return;
                } else if (level == 2) {// manager
                    loginFrame.dispose();
                    new managerFrame();
                    return;
                }
            }
        }
    }
}
