package Bank.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    Mini(String pin) {
        this.pin = pin;
        getContentPane().setBackground(new Color(255, 204, 204));
        setSize(400, 600);
        setLocation(20, 20);
        setVisible(true);
        setLayout(null);

        JLabel lable1 = new JLabel();
        lable1.setBounds(20, 140, 400, 200);
        add(lable1);

        JLabel lable2 = new JLabel("GTech");
        lable2.setFont(new Font("System", Font.BOLD, 15));
        lable2.setBounds(150, 20, 200, 20);
        add(lable2);

        JLabel lable3 = new JLabel();
        lable3.setBounds(20,80,300,20);
        add(lable3);

        JLabel lable4 = new JLabel();
        lable4.setBounds(20,400,300,20);
        add(lable4);
        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM login WHERE pin = '" + pin + "'");
            while(resultSet.next()){
                lable3.setText("Card No : " + resultSet.getString("card_no").substring(0, 4) + "XXXXXXXX" + resultSet.getString("card_no").substring(12));

            }

        }catch (Exception e){
            e.printStackTrace();
        }try{
            int balance = 0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");

            while (resultSet.next()){
                lable1.setText(lable1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");


                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            lable4.setText("YOUR TOTAL BALANCE : RS."+balance);


        }catch (Exception e){
            e.printStackTrace();
        }
        button = new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Mini("");
    }
}
