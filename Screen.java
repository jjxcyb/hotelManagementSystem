package hotel;
import javax.swing.*;

public class Screen extends JFrame{

    Screen(){
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("screen/367989857.jpg"));
        JLabel label = new JLabel(img);
        label.setBounds(0,0,858,688);
        add(label);



        setLayout(null);
        setLocation(300,80);
        setSize(858,688);
        setVisible(true);

        try{
            Thread.sleep(5000);
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String a[]){

        new Screen();
    }
}
