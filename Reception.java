package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(145, 0, 17));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(5,5,270,820);
        panel1.setLayout(null);
        panel1.setBackground(new Color(145, 0, 17));
        add(panel1);

        ImageIcon loader = new ImageIcon(ClassLoader.getSystemResource("screen/200w.gif"));
        Image i = loader.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(i);
        JLabel labelLoader = new JLabel(imageIcon);
        labelLoader.setBounds( 400,300,200,195);
        panel.add(labelLoader);

        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("screen/SV.jfif"));
        Image i2 = logo.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i2);
        JLabel labelLogo = new JLabel(imageIcon2);
        labelLogo.setBounds(5,580,250,250);
        panel1.add(labelLogo);

        JButton customerForm = new JButton("new customer form");
        customerForm.setBounds(30,30,200,30);
        customerForm.setBackground(Color.black);
        customerForm.setForeground(Color.white);
        panel1.add(customerForm);
        customerForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{


                }catch (Exception ex){

                    ex.printStackTrace();
                }
            }
        });

        JButton room = new JButton("add rooms");
        room.setBounds(30,70,200,30);
        room.setBackground(Color.black);
        room.setForeground(Color.white);
        panel1.add(room);
        room.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new addRoom();

                }catch (Exception ex){

                    ex.printStackTrace();
                }
            }
        });

        JButton cInfo = new JButton("customer info");
        cInfo.setBounds(30,110,200,30);
        cInfo.setBackground(Color.black);
        cInfo.setForeground(Color.white);
        panel1.add(cInfo);
        cInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{


                }catch (Exception ex){

                    ex.printStackTrace();
                }
            }
        });


        JButton cOut = new JButton("check out");
        cOut.setBounds(30,150,200,30);
        cOut.setBackground(Color.black);
        cOut.setForeground(Color.white);
        panel1.add(cOut);
        cOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{


                }catch (Exception ex){

                    ex.printStackTrace();
                }
            }
        });

        JButton update = new JButton("update room status");
        update.setBounds(30,190,200,30);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        panel1.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{


                }catch (Exception ex){

                    ex.printStackTrace();
                }
            }
        });

        JButton search = new JButton("search rooms");
        search.setBounds(30,230,200,30);
        search.setBackground(Color.black);
        search.setForeground(Color.white);
        panel1.add(search);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{


                }catch (Exception ex){

                    ex.printStackTrace();
                }
            }
        });







        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }

    public static void main(String[]a){

        new Reception();
    }
}
