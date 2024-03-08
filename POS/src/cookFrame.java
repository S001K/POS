import javax.swing.*;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class cookFrame extends JFrame implements ActionListener {
  TextArea orderDisplay;
  JButton buttonTable1;
  JButton buttonTable2;
  JButton buttonTable3;
  JButton buttonTable4;
  JButton buttonTable5;
  JButton buttonTable6;
  JButton buttonTable7;
  JButton buttonTable8;
  JButton buttonOrderReady;
  JTextField idField;
  List<String> tableOneCsv = new ArrayList<String>();
  List<String> tableTwoCsv = new ArrayList<String>();
  List<String> tableThreeCsv = new ArrayList<String>();
  List<String> tableFourCsv = new ArrayList<String>();
  List<String> tableFiveCsv = new ArrayList<String>();
  List<String> tableSixCsv = new ArrayList<String>();
  List<String> tableSevenCsv = new ArrayList<String>();
  List<String> tableEightCsv = new ArrayList<String>();

  cookFrame() {
    // table one reading from csv
    File csvFile1 = new File("table1Csv.csv");
    try (Scanner scanner = new Scanner(csvFile1)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        tableOneCsv.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    File csvFile2 = new File("table2Csv.csv");
    try (Scanner scanner = new Scanner(csvFile2)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        tableTwoCsv.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    File csvFile3 = new File("table3Csv.csv");
    try (Scanner scanner = new Scanner(csvFile3)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        tableThreeCsv.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    File csvFile4 = new File("table4Csv.csv");
    try (Scanner scanner = new Scanner(csvFile4)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        tableFourCsv.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    File csvFile5 = new File("table5Csv.csv");
    try (Scanner scanner = new Scanner(csvFile5)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        tableFiveCsv.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    File csvFile6 = new File("table6Csv.csv");
    try (Scanner scanner = new Scanner(csvFile6)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        tableSixCsv.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    File csvFile7 = new File("table7Csv.csv");
    try (Scanner scanner = new Scanner(csvFile7)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        tableSevenCsv.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    File csvFile8 = new File("table8Csv.csv");
    try (Scanner scanner = new Scanner(csvFile8)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        tableEightCsv.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    orderDisplay = new TextArea(10, 40);
    orderDisplay.setBounds(150, 5, 910, 670);
    orderDisplay.setEditable(false);

    buttonTable1 = new JButton();
    buttonTable1.setBounds(5, 5, 140, 30);
    buttonTable1.addActionListener(this);
    buttonTable1.setText("TABLE 1");
    buttonTable1.setFocusable(false);

    buttonTable2 = new JButton();
    buttonTable2.setBounds(5, 40, 140, 30);
    buttonTable2.addActionListener(this);
    buttonTable2.setText("TABLE 2");
    buttonTable2.setFocusable(false);

    buttonTable3 = new JButton();
    buttonTable3.setBounds(5, 75, 140, 30);
    buttonTable3.addActionListener(this);
    buttonTable3.setText("TABLE 3");
    buttonTable3.setFocusable(false);

    buttonTable4 = new JButton();
    buttonTable4.setBounds(5, 110, 140, 30);
    buttonTable4.addActionListener(this);
    buttonTable4.setText("TABLE 4");
    buttonTable4.setFocusable(false);

    buttonTable5 = new JButton();
    buttonTable5.setBounds(5, 145, 140, 30);
    buttonTable5.addActionListener(this);
    buttonTable5.setText("TABLE 5");
    buttonTable5.setFocusable(false);

    buttonTable6 = new JButton();
    buttonTable6.setBounds(5, 180, 140, 30);
    buttonTable6.addActionListener(this);
    buttonTable6.setText("TABLE 6");
    buttonTable6.setFocusable(false);

    buttonTable7 = new JButton();
    buttonTable7.setBounds(5, 215, 140, 30);
    buttonTable7.addActionListener(this);
    buttonTable7.setText("TABLE 7");
    buttonTable7.setFocusable(false);

    buttonTable8 = new JButton();
    buttonTable8.setBounds(5, 250, 140, 30);
    buttonTable8.addActionListener(this);
    buttonTable8.setText("TABLE 8");
    buttonTable8.setFocusable(false);

    idField = new JTextField(10);
    idField.setBounds(5, 300, 140, 30);

    buttonOrderReady = new JButton();
    buttonOrderReady.setBounds(5, 335, 140, 30);
    buttonOrderReady.addActionListener(this);
    buttonOrderReady.setText("ORDER READY");
    buttonOrderReady.setFocusable(false);

    this.setTitle("POS");
    this.setLayout(null);
    this.setSize(1080, 720);
    this.setResizable(false);
    this.getContentPane().setBackground(Color.DARK_GRAY);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

    this.add(idField);
    this.add(buttonOrderReady);
    this.add(orderDisplay);
    this.add(buttonTable1);
    this.add(buttonTable2);
    this.add(buttonTable3);
    this.add(buttonTable4);
    this.add(buttonTable5);
    this.add(buttonTable6);
    this.add(buttonTable7);
    this.add(buttonTable8);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == buttonTable1) {
      buttonTable1.setEnabled(false);
      buttonTable2.setEnabled(true);
      buttonTable3.setEnabled(true);
      buttonTable4.setEnabled(true);
      buttonTable5.setEnabled(true);
      buttonTable6.setEnabled(true);
      buttonTable7.setEnabled(true);
      buttonTable8.setEnabled(true);
      orderDisplay.setText("");
      for (String order : tableOneCsv) {
        orderDisplay.append(order + "\n");
      }
    }
    if (e.getSource() == buttonTable2) {
      buttonTable1.setEnabled(true);
      buttonTable2.setEnabled(false);
      buttonTable3.setEnabled(true);
      buttonTable4.setEnabled(true);
      buttonTable5.setEnabled(true);
      buttonTable6.setEnabled(true);
      buttonTable7.setEnabled(true);
      buttonTable8.setEnabled(true);
      orderDisplay.setText("");
      for (String order : tableTwoCsv) {
        orderDisplay.append(order + "\n");
      }
    }
    if (e.getSource() == buttonTable3) {
      buttonTable1.setEnabled(true);
      buttonTable2.setEnabled(true);
      buttonTable3.setEnabled(false);
      buttonTable4.setEnabled(true);
      buttonTable5.setEnabled(true);
      buttonTable6.setEnabled(true);
      buttonTable7.setEnabled(true);
      buttonTable8.setEnabled(true);
      orderDisplay.setText("");
      for (String order : tableThreeCsv) {
        orderDisplay.append(order + "\n");
      }
    }
    if (e.getSource() == buttonTable4) {
      buttonTable1.setEnabled(true);
      buttonTable2.setEnabled(true);
      buttonTable3.setEnabled(true);
      buttonTable4.setEnabled(false);
      buttonTable5.setEnabled(true);
      buttonTable6.setEnabled(true);
      buttonTable7.setEnabled(true);
      buttonTable8.setEnabled(true);
      orderDisplay.setText("");
      for (String order : tableFourCsv) {
        orderDisplay.append(order + "\n");
      }
    }
    if (e.getSource() == buttonTable5) {
      buttonTable1.setEnabled(true);
      buttonTable2.setEnabled(true);
      buttonTable3.setEnabled(true);
      buttonTable4.setEnabled(true);
      buttonTable5.setEnabled(false);
      buttonTable6.setEnabled(true);
      buttonTable7.setEnabled(true);
      buttonTable8.setEnabled(true);
      orderDisplay.setText("");
      for (String order : tableFiveCsv) {
        orderDisplay.append(order + "\n");
      }
    }
    if (e.getSource() == buttonTable6) {
      buttonTable1.setEnabled(true);
      buttonTable2.setEnabled(true);
      buttonTable3.setEnabled(true);
      buttonTable4.setEnabled(true);
      buttonTable5.setEnabled(true);
      buttonTable6.setEnabled(false);
      buttonTable7.setEnabled(true);
      buttonTable8.setEnabled(true);
      orderDisplay.setText("");
      for (String order : tableSixCsv) {
        orderDisplay.append(order + "\n");
      }
    }
    if (e.getSource() == buttonTable7) {
      buttonTable1.setEnabled(true);
      buttonTable2.setEnabled(true);
      buttonTable3.setEnabled(true);
      buttonTable4.setEnabled(true);
      buttonTable5.setEnabled(true);
      buttonTable6.setEnabled(true);
      buttonTable7.setEnabled(false);
      buttonTable8.setEnabled(true);
      orderDisplay.setText("");
      for (String order : tableSevenCsv) {
        orderDisplay.append(order + "\n");
      }
    }
    if (e.getSource() == buttonTable8) {
      buttonTable1.setEnabled(true);
      buttonTable2.setEnabled(true);
      buttonTable3.setEnabled(true);
      buttonTable4.setEnabled(true);
      buttonTable5.setEnabled(true);
      buttonTable6.setEnabled(true);
      buttonTable7.setEnabled(true);
      buttonTable8.setEnabled(false);
      orderDisplay.setText("");
      for (String order : tableEightCsv) {
        orderDisplay.append(order + "\n");
      }
    }
    String orderNumber = idField.getText();
    if (e.getSource() == buttonOrderReady) {

      if (!buttonTable1.isEnabled()) {
        for (String order : tableOneCsv) {
          String[] lineSplit = order.split(";");
          if (Integer.parseInt(orderNumber) == Integer.parseInt(lineSplit[0])) {
            tableOneCsv.remove(order);
          }
        }
        orderDisplay.setText("");
        for (String order : tableOneCsv) {
          orderDisplay.append(order + "\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("table1Csv.csv", false))) {
          for (String s : tableOneCsv) {
            bw.write(s);
            bw.newLine();
          }
        } catch (IOException e2) {
          e2.printStackTrace();
        }
      } else if (!buttonTable2.isEnabled()) {
        for (String order : tableTwoCsv) {
          String[] lineSplit = order.split(";");
          if (Integer.parseInt(orderNumber) == Integer.parseInt(lineSplit[0])) {
            tableTwoCsv.remove(order);
          }
        }
        orderDisplay.setText("");
        for (String order : tableTwoCsv) {
          orderDisplay.append(order + "\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("table2Csv.csv", false))) {
          for (String s : tableTwoCsv) {
            bw.write(s);
            bw.newLine();
          }
        } catch (IOException e2) {
          e2.printStackTrace();
        }
      } else if (!buttonTable3.isEnabled()) {
        for (String order : tableThreeCsv) {
          String[] lineSplit = order.split(";");
          if (Integer.parseInt(orderNumber) == Integer.parseInt(lineSplit[0])) {
            tableThreeCsv.remove(order);
          }
        }
        orderDisplay.setText("");
        for (String order : tableThreeCsv) {
          orderDisplay.append(order + "\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("table3Csv.csv", false))) {
          for (String s : tableThreeCsv) {
            bw.write(s);
            bw.newLine();
          }
        } catch (IOException e2) {
          e2.printStackTrace();
        }
      } else if (!buttonTable4.isEnabled()) {
        for (String order : tableFourCsv) {
          String[] lineSplit = order.split(";");
          if (Integer.parseInt(orderNumber) == Integer.parseInt(lineSplit[0])) {
            tableFourCsv.remove(order);
          }
        }
        orderDisplay.setText("");
        for (String order : tableFourCsv) {
          orderDisplay.append(order + "\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("table4Csv.csv", false))) {
          for (String s : tableFourCsv) {
            bw.write(s);
            bw.newLine();
          }
        } catch (IOException e2) {
          e2.printStackTrace();
        }
      } else if (!buttonTable5.isEnabled()) {
        for (String order : tableFiveCsv) {
          String[] lineSplit = order.split(";");
          if (Integer.parseInt(orderNumber) == Integer.parseInt(lineSplit[0])) {
            tableFiveCsv.remove(order);
          }
        }
        orderDisplay.setText("");
        for (String order : tableFiveCsv) {
          orderDisplay.append(order + "\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("table5Csv.csv", false))) {
          for (String s : tableFiveCsv) {
            bw.write(s);
            bw.newLine();
          }
        } catch (IOException e2) {
          e2.printStackTrace();
        }

      } else if (!buttonTable6.isEnabled()) {
        for (String order : tableSixCsv) {
          String[] lineSplit = order.split(";");
          if (Integer.parseInt(orderNumber) == Integer.parseInt(lineSplit[0])) {
            tableSixCsv.remove(order);
          }
        }
        orderDisplay.setText("");
        for (String order : tableSixCsv) {
          orderDisplay.append(order + "\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("table6Csv.csv", false))) {
          for (String s : tableSixCsv) {
            bw.write(s);
            bw.newLine();
          }
        } catch (IOException e2) {
          e2.printStackTrace();
        }
      } else if (!buttonTable7.isEnabled()) {
        for (String order : tableSevenCsv) {
          String[] lineSplit = order.split(";");
          if (Integer.parseInt(orderNumber) == Integer.parseInt(lineSplit[0])) {
            tableSevenCsv.remove(order);
          }
        }
        orderDisplay.setText("");
        for (String order : tableSevenCsv) {
          orderDisplay.append(order + "\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("table7Csv.csv", false))) {
          for (String s : tableSevenCsv) {
            bw.write(s);
            bw.newLine();
          }
        } catch (IOException e2) {
          e2.printStackTrace();
        }

      } else if (!buttonTable8.isEnabled()) {
        for (String order : tableEightCsv) {
          String[] lineSplit = order.split(";");
          if (Integer.parseInt(orderNumber) == Integer.parseInt(lineSplit[0])) {
            tableEightCsv.remove(order);
          }
        }
        orderDisplay.setText("");
        for (String order : tableEightCsv) {
          orderDisplay.append(order + "\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("table8Csv.csv", false))) {
          for (String s : tableEightCsv) {
            bw.write(s);
            bw.newLine();
          }
        } catch (IOException e2) {
          e2.printStackTrace();
        }
      }
    }
  }
}
