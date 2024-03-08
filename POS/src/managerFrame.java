import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.awt.geom.*;
import java.util.List;

public class managerFrame extends JFrame implements ActionListener {

    JLabel labelUsers;
    JLabel labelInv;
    TextArea inventoryDisplay;
    TextArea userDisplay;
    JButton buttonInventory;
    JButton buttonUser;
    JButton buttonAddUser;
    JButton buttonAddItem;
    JButton buttonRemoveUser;
    JTextField FieldItemName;
    JTextField FieldItemAmount;
    JTextField FieldUserID;
    JTextField FieldUserPassword;
    JTextField FieldUserName;
    JTextField FieldUserSurname;
    JTextField FieldUserPhoneNumber;
    JTextField FieldUserLevel;
    JTextField FieldUserIDRemove;
    List<String> invList = new ArrayList<String>();
    List<String> usersList = new ArrayList<String>();

    managerFrame() {

        // Read inventory file and put contents in a list
        File csvInv = new File("ingredients.csv");
        try (Scanner scanner = new Scanner(csvInv)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                invList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Read users file and put contents in a list
        File csvUsers = new File("usersCsv.csv");
        try (Scanner scanner = new Scanner(csvUsers)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                usersList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Inventory Elements
        inventoryDisplay = new TextArea(10, 10);
        inventoryDisplay.setBounds(30, 60, 400, 500);
        inventoryDisplay.setEditable(false);

        // Print Inventory
        for (int i = 0; i < invList.size(); i++) {
            inventoryDisplay.append(invList.get(i) + "\n");
        }

        // Inventory error label
        labelInv = new JLabel("");
        labelInv.setBounds(80, 580, 300, 30);
        labelInv.setFocusable(false);

        buttonInventory = new JButton();
        buttonInventory.setBounds(125, 15, 200, 30);
        buttonInventory.addActionListener(this);
        buttonInventory.setText("Inventory Management");
        buttonInventory.setFocusable(false);

        FieldItemName = new JTextField("Enter Item Name", 10);
        FieldItemName.setBounds(455, 80, 160, 30);

        FieldItemAmount = new JTextField("Enter Item Amount", 10);
        FieldItemAmount.setBounds(455, 120, 160, 30);

        buttonAddItem = new JButton();
        buttonAddItem.setBounds(455, 160, 160, 30);
        buttonAddItem.addActionListener(this);
        buttonAddItem.setText("Add Item");
        buttonAddItem.setFocusable(false);

        // User Management Elements
        userDisplay = new TextArea(10, 10);
        userDisplay.setBounds(855, 60, 400, 500);
        userDisplay.setEditable(false);

        // Print users
        for (int i = 1; i < usersList.size(); i++) {
            userDisplay.append(usersList.get(i) + "\n");
        }

        // User error label

        labelUsers = new JLabel("");
        labelUsers.setBounds(905, 580, 300, 30);
        labelUsers.setFocusable(false);

        buttonUser = new JButton();
        buttonUser.setBounds(955, 15, 200, 30);
        buttonUser.addActionListener(this);
        buttonUser.setText("User Management");
        buttonUser.setFocusable(false);

        FieldUserID = new JTextField("Enter User ID", 10);
        FieldUserID.setBounds(670, 80, 160, 30);

        FieldUserPassword = new JTextField("Enter User Password", 10);
        FieldUserPassword.setBounds(670, 120, 160, 30);

        FieldUserName = new JTextField("Enter User Name", 10);
        FieldUserName.setBounds(670, 160, 160, 30);

        FieldUserSurname = new JTextField("Enter User Surname", 10);
        FieldUserSurname.setBounds(670, 200, 160, 30);

        FieldUserPhoneNumber = new JTextField("Enter User Phone Number", 10);
        FieldUserPhoneNumber.setBounds(670, 240, 160, 30);

        FieldUserLevel = new JTextField("Enter User Level", 10);
        FieldUserLevel.setBounds(670, 280, 160, 30);

        buttonAddUser = new JButton();
        buttonAddUser.setBounds(670, 320, 160, 30);
        buttonAddUser.addActionListener(this);
        buttonAddUser.setText("Add User");
        buttonAddUser.setFocusable(false);

        FieldUserIDRemove = new JTextField("Enter User ID", 10);
        FieldUserIDRemove.setBounds(670, 370, 160, 30);

        buttonRemoveUser = new JButton();
        buttonRemoveUser.setBounds(670, 410, 160, 30);
        buttonRemoveUser.addActionListener(this);
        buttonRemoveUser.setText("Remove User");
        buttonRemoveUser.setFocusable(false);

        this.add(buttonInventory);
        this.add(inventoryDisplay);
        this.add(FieldItemName);
        this.add(FieldItemAmount);
        this.add(buttonAddItem);

        this.add(buttonUser);
        this.add(userDisplay);
        this.add(FieldUserID);
        this.add(FieldUserPassword);
        this.add(FieldUserName);
        this.add(FieldUserSurname);
        this.add(FieldUserPhoneNumber);
        this.add(FieldUserLevel);
        this.add(buttonAddUser);
        this.add(buttonRemoveUser);
        this.add(FieldUserIDRemove);

        this.add(labelUsers);
        this.add(labelInv);

        this.setTitle("Manager Menu");
        this.setLayout(null);
        this.setSize(1300, 660);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    // To draw the line in the middle
    public void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke = new BasicStroke(4);
        g2d.setStroke(stroke);
        g2d.draw(new Line2D.Float(650, 0, 650, 700));
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Add item to inventory , name: String amount: Float seperated with (.)
        if (e.getSource() == buttonAddItem) {
            boolean flag = false;
            try {
                Integer.parseInt(FieldItemName.getText());
                labelInv.setText("Item name can't have an integer value.");
                labelInv.setForeground(Color.RED);
            } catch (NumberFormatException a) {
                try {
                    List<String> tempinvList = new ArrayList<String>();
                    String tempItem;
                    Float itemAmount;
                    itemAmount = Float.parseFloat(FieldItemAmount.getText());
                    for (String item : invList) {
                        String splitItem[] = item.split(";");
                        if (splitItem[0].equals(FieldItemName.getText())) {
                            itemAmount += Float.parseFloat(splitItem[1]);
                            tempItem = FieldItemName.getText() + ";" + String.valueOf(itemAmount);
                            tempinvList.add(tempItem);
                            labelInv.setText("Item successfully added.");
                            labelInv.setForeground(Color.GREEN);
                            flag = true;
                        } else {
                            tempinvList.add(item);
                        }
                    }
                    // If given item does not exist, then nothing happens.
                    if (!flag) {
                        labelInv.setText("Item not found.");
                        labelInv.setForeground(Color.RED);
                    } else {
                        invList.clear();
                        for (String item : tempinvList) {
                            invList.add(item);
                        }
                        // print new list
                        inventoryDisplay.setText("");
                        for (int i = 0; i < invList.size(); i++) {
                            inventoryDisplay.append(invList.get(i) + "\n");
                        }
                        // Edit csv
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ingredients.csv", false))) {
                            for (String s : invList) {
                                bw.write(s);
                                bw.newLine();
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            System.out.println("File not found");
                        }
                    }
                } catch (NumberFormatException f) {
                    labelInv.setText("Item amount must have a float value.");
                    labelInv.setForeground(Color.RED);
                }

            }
        }

        // Delete user
        if (e.getSource() == buttonRemoveUser) {
            String userId = FieldUserIDRemove.getText();
            for (String userLine : usersList) {
                String splitLine[] = userLine.split(";");
                // if given id is different, keep the user in list
                if (splitLine[0].equals(userId)) {
                    userDisplay.setText("");
                    usersList.remove(userLine);
                    for (int i = 1; i < usersList.size(); i++) {
                        userDisplay.append(usersList.get(i) + "\n");
                    }
                    // Delete from csv
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("usersCsv.csv", false))) {
                        for (String s : usersList) {
                            bw.write(s);
                            bw.newLine();
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        System.out.println("File not found");
                    }

                    // Return message
                    labelUsers.setText("User successfully removed.");
                    labelUsers.setForeground(Color.GREEN);
                    break;
                }
                labelUsers.setText("User not found.");
                labelUsers.setForeground(Color.RED);
            }
        }

        // Add user
        if (e.getSource() == buttonAddUser) {
            labelUsers.setText("");
            // check for proper user format
            if (!FieldUserID.getText().equals("") && !FieldUserPassword.getText().equals("")
                    && !FieldUserName.getText().equals("")
                    && !FieldUserSurname.getText().equals("") && !FieldUserPhoneNumber.getText().equals("")
                    && !FieldUserLevel.getText().equals("")) {
                try {
                    Integer.parseInt(FieldUserPhoneNumber.getText());
                    Integer.parseInt(FieldUserLevel.getText());
                    String newUser = FieldUserID.getText() + ";" + FieldUserPassword.getText() + ";"
                            + FieldUserName.getText() + ";" + FieldUserSurname.getText() + ";"
                            + FieldUserPhoneNumber.getText() + ";" + FieldUserLevel
                                    .getText()
                            + ";";
                    userDisplay.setText("");
                    usersList.add(newUser);
                    for (int i = 1; i < usersList.size(); i++) {
                        userDisplay.append(usersList.get(i) + "\n");
                    }
                    // Add to csv
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("usersCsv.csv", false))) {
                        for (String s : usersList) {
                            bw.write(s);
                            bw.newLine();
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        System.out.println("File not found");
                    }
                    labelUsers.setText("User successfully added.");
                    labelUsers.setForeground(Color.GREEN);
                } catch (NumberFormatException c) {
                    c.printStackTrace();
                    labelUsers.setText("Phone number and Level must be an integer.");
                    labelUsers.setForeground(Color.RED);
                }
            } else {
                labelUsers.setText("Please enter values in correct format.");
                labelUsers.setForeground(Color.RED);
            }
        }

    }
}
