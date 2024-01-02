package hotel;

import hotel.rooms.Rooms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addRoom extends JFrame implements ActionListener {

    JTextField t2;
    JComboBox t3,t4;

    JButton b1,b2;
    addRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(145, 0, 17));
        panel.setLayout(null);
        add(panel);

        JLabel l1 =new JLabel("add rooms");
        l1.setForeground(Color.white);
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma", Font.ITALIC,22));
        panel.add(l1);

        JLabel l2 =new JLabel("room number");
        l2.setForeground(Color.white);
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(l2);

        JLabel l3 =new JLabel("Availability");
        l3.setForeground(Color.white);
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(l3);

        JLabel l4 =new JLabel("type");
        l4.setForeground(Color.white);
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(l4);

        JLabel l5 =new JLabel("prices:");
        l5.setForeground(Color.white);
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(l5);


        JLabel l6 =new JLabel("type 1 = $320");
        l6.setForeground(Color.white);
        l6.setBounds(200,190,156,20);
        l6.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(l6);

        JLabel l7 =new JLabel("type 2 = $300");
        l7.setForeground(Color.white);
        l7.setBounds(200,230,156,20);
        l7.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(l7);

        JLabel l8 =new JLabel("type 3 = $280");
        l8.setForeground(Color.white);
        l8.setBounds(200,270,156,20);
        l8.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(l8);

        JLabel l9 =new JLabel("type 4 = $250");
        l9.setForeground(Color.white);
        l9.setBounds(200,310,156,20);
        l9.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(l9);


        t2 = new JTextField();
        t2.setForeground(Color.white);
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma", Font.BOLD,14));
        t2.setBackground(Color.yellow);
        panel.add(t2);

        t3 = new JComboBox(new String[]{"Available","occupied"});
        t3.setForeground(Color.white);
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma", Font.BOLD,14));
        t3.setBackground(Color.yellow);
        panel.add(t3);

        t4 = new JComboBox(new String[]{"premium deluxe room","premium king room","twin deluxe suite", "single deluxe suite"});
        t4.setForeground(Color.white);
        t4.setBounds(200,150,156,20);
        t4.setFont(new Font("Tahoma", Font.BOLD,14));
        t4.setBackground(Color.yellow);
        panel.add(t4);

        b1 = new JButton("add");
        b1.setBounds(64,351,111,33);
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("back");
        b2.setBounds(198,351,111,33);
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("screen/SV.jfif"));
        Image img = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(img);
        JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(500,60,300,300);
        panel.add(imgLabel);





        setUndecorated(false);
        setSize(885,500);
        setVisible(true);
        setLayout(null);
        setLocation(20,200);

    }
    Rooms[]r1 = new Rooms[100];
    int x=0;
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try {
                String number = t2.getText();
                String available = (String) t3.getSelectedItem();
                boolean occupied;
                if (available == "Available"){
                    occupied = false;
                }else occupied = true;
                String type =(String) t4.getSelectedItem();
                r1[x] = new Rooms(type,number,occupied);
                JOptionPane.showMessageDialog(null,"room successfully added\n"+ r1[x].toString());
                setVisible(true);
                x++;
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }else setVisible(false);

    }

    public static void main(String a[]){
        new addRoom();
    }
}
