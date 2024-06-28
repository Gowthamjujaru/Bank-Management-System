package Bank.Managment.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;
JButton next;

    JTextField textname,textfname,textEmail,textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000l)+1000L;
    String first = ""+Math.abs(first4);
    SignUp(){

        super("APPLICATION FORM");
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel Iimage = new JLabel(ii3);
        Iimage.setBounds(25,10,100,100);
        add(Iimage);

        JLabel lable1 = new JLabel("application no: "+first4);
        lable1.setBounds(160,20,600,40);
       lable1.setFont(new Font("Raleway",Font.BOLD,38));
       add(lable1);

       JLabel lable2 = new JLabel("Page 1");
       lable2.setFont(new Font("relway",Font.BOLD,22));
       lable2.setBounds(330,70,600,30);
       add(lable2);

       JLabel lable3 = new JLabel("Personal Detail");
       lable3.setFont(new Font("relway",Font.BOLD,22));
       lable3.setBounds(290,90,600,30);
       add(lable3);

       JLabel lableName = new JLabel("Name :");
lableName.setFont(new Font("raleway",Font.BOLD,20));
lableName.setBounds(100,190,100,30);
add(lableName);

textname = new JTextField();
textname.setFont(new Font("raleway",Font.BOLD,14));
textname.setBounds(300,190,400,30);
add(textname);


        JLabel lableFName = new JLabel("Father Name :" );
        lableFName.setFont(new Font("raleway",Font.BOLD,20));
        lableFName.setBounds(100,240,200,30);
        add(lableFName);

        textfname = new JTextField();
        textfname.setFont(new Font("raleway",Font.BOLD,14));
        textfname.setBounds(300,240,400,30);
        add(textfname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("raleway",Font.BOLD,20));
        DOB.setBounds(100,340,400,30);
        add(DOB);
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);
JLabel lableG = new JLabel("Gender");
        lableG.setFont(new Font("raleway",Font.BOLD,20));
        lableG.setBounds(100,290,200,30);
        add(lableG);
 r1 = new JRadioButton("MALE");
 r1.setFont(new Font("ralway",Font.BOLD,14));
 r1.setBackground(new Color(222,255,228));
 r1.setBounds(300,290,90,30);
 add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

JLabel lableEmail = new JLabel("Email");
lableEmail.setFont(new Font("raleway",Font.BOLD,20));
lableEmail.setBounds(100,390,200,30);
add(lableEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);



        JLabel lableMS = new JLabel("Marrital Status");
        lableMS.setFont(new Font("raleway",Font.BOLD,20));
        lableMS.setBounds(100,440,100,30);
        add(lableMS);

m1 = new JRadioButton("married");
        m1.setBackground(new Color(222,255,228));
m1.setBounds(300,440,100,30);
m1.setFont(new Font("ralway",Font.BOLD,14));

add(m1);

        m2 = new JRadioButton("unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        m2.setFont(new Font("ralway",Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("other");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,440,100,30);
        m3.setFont(new Font("ralway",Font.BOLD,14));
        add(m3);

        ButtonGroup  buttonGroup1  =new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);






        JLabel lableAdd = new JLabel("Address");
        lableAdd.setFont(new Font("raleway",Font.BOLD,20));
        lableAdd.setBounds(100,490,200,30);
        add(lableAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel lableCity = new JLabel("CITY");
        lableCity.setFont(new Font("raleway",Font.BOLD,20));
        lableCity.setBounds(100,540,200,30);
        add(lableCity);

        textCity = new JTextField();
        textCity.setFont(new Font("raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel lablePin = new JLabel("PIN");
        lablePin.setFont(new Font("raleway",Font.BOLD,20));
        lablePin.setBounds(100,590,200,30);
        add(lablePin);

        textPin = new JTextField();
        textPin.setFont(new Font("raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel lableState = new JLabel("State");
        lableState.setFont(new Font("raleway",Font.BOLD,20));
        lableState.setBounds(100,640,200,30);
        add(lableState);

        textState = new JTextField();
        textState.setFont(new Font("raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

next = new JButton("Next");
next.setFont(new Font("ralway",Font.BOLD,14));
next.setBackground(Color.BLACK);
next.setForeground(Color.WHITE);
    next.setBounds(620,710,80,30);
   next.addActionListener(this);
    add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
setLocation(360,40);
setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
String name = textname.getText();
String Fname = textfname.getText();
String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
String gender = null;
if(r1.isSelected()){
    gender = "male";
}else if (r2.isSelected()){
gender  = "Female";
}

String email = textEmail.getText();
String marital = null;
if(m1.isSelected()){
    marital = "married";

}else if(m2.isSelected()){
    marital="unmarried";

}
else if(m3.isSelected()){
    marital="other";

}
String address = textAdd.getText();
String city = textCity.getText();
String pincode = textPin.getText();
String State = textState.getText();

try{
if(textname.getText().equals("")){
    JOptionPane.showMessageDialog(null,"fill all the field");
}else{
    Con con1 = new Con();
    String q = "insert into Signup values('" +formno+"','" +name+"','" +Fname+"','" +dob+"','" +gender+"','" +email+"','" +marital+"','" +address+"','" +city+"','" +pincode+"','" +State+"')";
    con1.statement.executeUpdate(q);
new Signup2(formno);
setVisible(false);
}
}catch (Exception E){
    E.printStackTrace();
}
    }


    public static void main(String[] args) {
        new SignUp();
    }

}
