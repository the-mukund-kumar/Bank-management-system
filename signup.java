package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JButton next;
    JTextField textname, textfname,em;
    JDateChooser dateChooser;
    Random ran=new Random();
    long first4=(ran.nextLong() % 9000L) +1000L;
    String first =" "+Math.abs(first4);

    signup(){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,10,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1.");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelname=new JLabel("Name");
        labelname.setFont(new Font("Ralway",Font.BOLD,14));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textname=new JTextField();
        textname.setFont(new Font("Ralway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        JLabel labelf1=new JLabel("Father's Name");
        labelf1.setFont(new Font("Ralway",Font.BOLD,14));
        labelf1.setBounds(100,240,200,30);
        add(labelf1);

        textfname=new JTextField();
        textfname.setFont(new Font("Ralway",Font.BOLD,14));
        textfname.setBounds(300,240,400,30);
        add(textfname);

        JLabel DOB=new JLabel("DAte of Birth");
        DOB.setFont(new Font("Ralway",Font.BOLD,14));
        DOB.setBounds(100,280,400,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,280,400,30);
        add(dateChooser);

        JLabel labelg=new JLabel("Gender");
        labelg.setFont(new Font("ralway",Font.BOLD,14));
        labelg.setBounds(100,320,200,30);
        add(labelg);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,320,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,320,90,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Ralway",Font.BOLD,14));
        email.setBounds(100,350,200,30);
        add(email);

        JTextField em=new JTextField();
        em.setFont(new Font("Ralway",Font.BOLD,14));
        em.setBounds(300,350,400,30);
        add(em);

        JLabel labelmarital=new JLabel("Marital status:");
        labelmarital.setFont(new Font("Ralway",Font.BOLD,14));
        labelmarital.setBounds(100,380,200,30);
        add(labelmarital);

//        JTextField textmarital=new JTextField();
//        textmarital.setFont(new Font("Ralway",Font.BOLD,14));
//        textmarital.setBounds(300,470,400,30);
//        add(textmarital);

        r3=new JRadioButton("Married");
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,380,100,30);
        add(r3);

        r4=new JRadioButton("Unmarried");
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,380,100,30);
        add(r4);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel labeladdress=new JLabel("Address:");
        labeladdress.setFont(new Font("Ralway",Font.BOLD,14));
        labeladdress.setBounds(100,410,200,30);
        add(labeladdress);

        JTextField  textaddress=new JTextField();
        textaddress.setFont(new Font("Ralway",Font.BOLD,14));
        textaddress.setBounds(300,410,400,30);
        add(textaddress);

        JLabel labelcity=new JLabel("City:");
        labelcity.setFont(new Font("Ralway",Font.BOLD,14));
        labelcity.setBounds(100,450,200,30);
        add(labelcity);

        JTextField textcity=new JTextField();
        textcity.setFont(new Font("Ralway",Font.BOLD,14));
        textcity.setBounds(300,450,400,30);
        add(textcity);

        JLabel labelpin=new JLabel("Pin Code:");
        labelpin.setFont(new Font("Ralway",Font.BOLD,14));
        labelpin.setBounds(100,490,200,30);
        add(labelpin);

        JTextField textpin=new JTextField();
        textpin.setFont(new Font("Ralway",Font.BOLD,14));
        textpin.setBounds(300,490,400,30);
        add(textpin);

        JLabel labelstate=new JLabel("State:");
        labelstate.setFont(new Font("Ralway",Font.BOLD,14));
        labelstate.setBounds(100,530,200,30);
        add(labelstate);

        JTextField textstate=new JTextField();
        textstate.setFont(new Font("Ralway",Font.BOLD,14));
        textstate.setBounds(300,530,400,30);
        add(textstate);

        next=new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,610,80,30);
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

    }

    public static void main(String[] args) {
        new signup();
    }
}
