package Bank.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textfield;
    JButton b1, b2;

    Deposit(String pin) {
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);


        JLabel lable1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        lable1.setForeground(Color.WHITE);
        lable1.setFont(new Font("System", Font.BOLD, 16));
        lable1.setBounds(460, 180, 400, 35);
        l3.add(lable1);

        textfield = new TextField();
        textfield.setBackground(new Color(65, 125, 128));
        textfield.setForeground(Color.WHITE);
        textfield.setBounds(460, 230, 320, 25);
        textfield.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(textfield);
        b1 = new JButton("DEPOSIT");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textfield.getText();
            Date date = new Date();
            if (e.getSource() == b1) {
                if (textfield.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "please enter the amount");
                } else {
                    Con c = new Con();
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Deposit','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs " + amount + " Deposit sucessfull");
                    setVisible(false);
                    new main_Class(pin);

                }

            } else if (e.getSource() == b2) {
                setVisible(false);
                new main_Class(pin);

            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");

    }
}
