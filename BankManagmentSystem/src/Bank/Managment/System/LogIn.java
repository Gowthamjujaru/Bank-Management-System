package Bank.Managment.System;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class LogIn extends JFrame implements ActionListener {
    JLabel lable1, lable2, lable3;
    JTextField textField2;
    JPasswordField jPasswordField3;
    JButton button1, button2, button3;

    LogIn() {
        super("Bank Management System");
        // Load and scale the bank icon
        ImageIcon bankIcon = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image bankImage = bankIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledBankIcon = new ImageIcon(bankImage);
        JLabel bankLabel = new JLabel(scaledBankIcon);
        bankLabel.setBounds(350, 10, 100, 100);
        add(bankLabel);

        // Load and scale the card icon
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel Iimage = new JLabel(ii3);
        Iimage.setBounds(630, 350, 100, 100);
        add(Iimage);


        lable1 = new JLabel("WELCOME TO ATM");
        lable1.setForeground(Color.WHITE);
        lable1.setFont(new Font("AvantaGarde", Font.BOLD, 38));
        lable1.setBounds(230, 125, 450, 40);
        add(lable1);

        lable2 = new JLabel("CARD NO");
        lable2.setFont(new Font("ralway", Font.BOLD, 28));
        lable2.setForeground(Color.WHITE);
        lable2.setBounds(150, 190, 375, 30);
        add(lable2);

        textField2 = new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        jPasswordField3 = new JPasswordField(15);
        jPasswordField3.setBounds(325, 250, 230, 30);
        jPasswordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(jPasswordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);


        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);


        lable3 = new JLabel("PIN: ");
        lable3.setFont(new Font("ralway", Font.BOLD, 28));
        lable3.setForeground(Color.WHITE);
        lable3.setBounds(150, 250, 375, 30);
        add(lable3);


        ImageIcon backbg = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = backbg.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel Iiimage = new JLabel(iii3);
        Iiimage.setBounds(0, 0, 850, 450);
        add(Iiimage);


        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        //  setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {
                Con c = new Con();
                String cardno = textField2.getText();
                String pin = jPasswordField3.getText();
                String q = "select * from login where card_no = '" + cardno + "' and  pin = '" + pin + "'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()) {
                    setVisible(false);
                    new main_Class(pin);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect cardNo/Pin");
                }


            } else if (e.getSource() == button2) {
                textField2.setText("");
                jPasswordField3.setText("");
            } else if (e.getSource() == button3) {
                new SignUp();
                setVisible(false);

            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new LogIn();
    }
}
