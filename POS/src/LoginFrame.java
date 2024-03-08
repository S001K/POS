import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginFrame extends JFrame {

  private JTextField idField;
  private JPasswordField passwordField;
  private JButton loginButton;
  private JLabel messageLabel;
  private static boolean logReturn = false;
  private User[] userList;
  private static int userLevel;

  public LoginFrame() {
    this.userList = new User[50];
    File csvFile = new File("usersCsv.csv");
    try (Scanner scanner = new Scanner(csvFile)) {
      int i = 0;
      if (scanner.hasNext()) {
        scanner.nextLine();
      }
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(";");
        String ID = parts[0];
        String password = parts[1];
        String name = parts[2];
        String surname = parts[3];
        Long phoneNumber = Long.valueOf(parts[4]);
        int authoryLevel = Integer.valueOf(parts[5]);
        this.userList[i] = new User(ID, password, name, surname, phoneNumber, authoryLevel);
        i++;
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    setTitle("Login");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    JLabel idLabel = new JLabel("ID:");
    c.gridx = 0;
    c.gridy = 0;
    c.anchor = GridBagConstraints.LINE_END;
    add(idLabel, c);

    idField = new JTextField(10);
    c.gridx = 1;
    c.gridy = 0;
    c.anchor = GridBagConstraints.LINE_START;
    add(idField, c);

    JLabel passwordLabel = new JLabel("Password:");
    c.gridx = 0;
    c.gridy = 1;
    c.anchor = GridBagConstraints.LINE_END;
    add(passwordLabel, c);

    passwordField = new JPasswordField(10);
    c.gridx = 1;
    c.gridy = 1;
    c.anchor = GridBagConstraints.LINE_START;
    add(passwordField, c);

    loginButton = new JButton("Login");
    c.gridx = 1;
    c.gridy = 2;
    c.anchor = GridBagConstraints.LINE_START;
    loginButton.addActionListener(new LoginButtonListener());
    add(loginButton, c);

    messageLabel = new JLabel("");
    c.gridx = 1;
    c.gridy = 3;
    c.anchor = GridBagConstraints.LINE_START;
    add(messageLabel, c);

    setSize(400, 300);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);

  }

  public static boolean isLogReturn() {
    return logReturn;
  }

  public static void setLogReturn(boolean LogReturn) {
    logReturn = LogReturn;
  }

  public static void setUserLevel(int i) {
    userLevel = i;
  }

  public static int getUserLevel() {
    return userLevel;
  }

  private class LoginButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      String id = idField.getText();
      String password = new String(passwordField.getPassword());
      for (int i = 0; i < userList.length; i++) {
        if (userList[i].getID().equals(id) && userList[i].getPassword().equals(password)) {
          setUserLevel(userList[i].getAuthoryLevel());
          messageLabel.setText("Logged in successfully!");
          setLogReturn(true);
          messageLabel.setForeground(Color.GREEN);
        }
      }
    }
  }
}
