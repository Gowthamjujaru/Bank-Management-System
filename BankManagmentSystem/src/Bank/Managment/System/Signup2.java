package Bank.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox combobox, combobox2, combobox3, combobox4, combobox5;
    JTextField textpan, textadhar;
    JRadioButton r1, r2, e1, e2;
    JButton Next;
    String formno;

    Signup2(String formno) {
        super("APPLICATION FORM");

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel Iimage = new JLabel(ii3);
        Iimage.setBounds(150, 5, 100, 100);
        add(Iimage);

        this.formno = formno;
        JLabel l1 = new JLabel("Page 2:");
        l1.setFont(new Font("Ralway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional details");
        l2.setFont(new Font("Ralway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);


        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Ralway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = {"Hindu", "Mus", "Chr", "Jain", "other"};
        combobox = new JComboBox(religion);
        combobox.setBackground(new Color(252, 208, 76));
        combobox.setFont(new Font("Ralway", Font.BOLD, 14));
        combobox.setBounds(350, 120, 320, 30);
        add(combobox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Ralway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String category[] = {"General", "OBC", "SC", "ST", "other"};
        combobox2 = new JComboBox(category);
        combobox2.setBackground(new Color(252, 208, 76));
        combobox2.setFont(new Font("Ralway", Font.BOLD, 14));
        combobox2.setBounds(350, 170, 320, 30);
        add(combobox2);


        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Ralway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String income[] = {"Null", "<1,50,000", "<250,000", "<3,50,000", "<500,0000", ">10,00,000"};
        combobox3 = new JComboBox(income);
        combobox3.setBackground(new Color(252, 208, 76));
        combobox3.setFont(new Font("Ralway", Font.BOLD, 14));
        combobox3.setBounds(350, 220, 320, 30);
        add(combobox3);


        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Ralway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);

        String Educational[] = {"Non-gradute", "Gradutation", "Post-Gradutaion", "DR", "Other"};
        combobox4 = new JComboBox(Educational);
        combobox4.setBackground(new Color(252, 208, 76));
        combobox4.setFont(new Font("Ralway", Font.BOLD, 14));
        combobox4.setBounds(350, 270, 320, 30);
        add(combobox4);


        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Ralway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        String Occupation[] = {"Salary", "Self-Employee", "Business", "Student", "Retaired"};
        combobox5 = new JComboBox(Occupation);
        combobox5.setBackground(new Color(252, 208, 76));
        combobox5.setFont(new Font("Ralway", Font.BOLD, 14));
        combobox5.setBounds(350, 340, 320, 30);
        add(combobox5);

        JLabel l8 = new JLabel("Pan No :");
        l8.setFont(new Font("Ralway", Font.BOLD, 18));
        l8.setBounds(100, 390, 150, 30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Ralway", Font.BOLD, 18));
        textpan.setBounds(350, 390, 320, 30);
        add(textpan);

        JLabel l9 = new JLabel("Adhar No :");
        l9.setFont(new Font("Ralway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        add(l9);

        textadhar = new JTextField();
        textadhar.setFont(new Font("Ralway", Font.BOLD, 18));
        textadhar.setBounds(350, 440, 320, 30);
        add(textadhar);

        JLabel l10 = new JLabel(" Senior citizon :");
        l10.setFont(new Font("Ralway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        add(l10);
        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Ralway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 490, 100, 30);
        add(r1);
        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Ralway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(460, 490, 100, 30);
        add(r2);


        JLabel l11 = new JLabel(" Existing Acc :");
        l11.setFont(new Font("Ralway", Font.BOLD, 18));
        l11.setBounds(100, 540, 180, 30);
        add(l11);
        e1 = new JRadioButton("YES");
        e1.setFont(new Font("Ralway", Font.BOLD, 14));
        e1.setBackground(new Color(252, 208, 76));
        e1.setBounds(350, 540, 100, 30);
        add(e1);
        e2 = new JRadioButton("NO");
        e2.setFont(new Font("Ralway", Font.BOLD, 14));
        e2.setBackground(new Color(252, 208, 76));
        e2.setBounds(460, 540, 100, 30);
        add(e2);


        JLabel l12 = new JLabel("FormNo:");
        l12.setFont(new Font("Ralway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Ralway", Font.BOLD, 14));
        l13.setBounds(760, 10, 60, 30);
        add(l13);


        Next = new JButton("Next");
        Next.setFont(new Font("ralway", Font.BOLD, 14));
        Next.setBackground(Color.WHITE);
        Next.setForeground(Color.BLACK);
        Next.setBounds(570, 640, 100, 30);
        Next.addActionListener(this);
        add(Next);


        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) combobox.getSelectedItem();
        String cate = (String) combobox2.getSelectedItem();
        String inc = (String) combobox3.getSelectedItem();
        String edu = (String) combobox4.getSelectedItem();
        String occ = (String) combobox5.getSelectedItem();

        String pan = textpan.getText();
        String adhar = textadhar.getText();

        String scitizen = " ";
        if (r1.isSelected()) {
            scitizen = "Yes";

        } else if (r2.isSelected()) {
            scitizen = "N0";

        }
        String eaccount = " ";
        if (r1.isSelected()) {
            eaccount = "Yes";

        } else if (r2.isSelected()) {
            eaccount = "N0";

        }

        try {
            if (textpan.getText().equals("") || textadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "fill all the fields");
            } else {
                Con c1 = new Con();
                String q = "insert into signuptwo values ('" + formno + "','" + rel + "', '" + cate + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + adhar + "','" + scitizen + "','" + eaccount + "')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("Yes");


    }

}
