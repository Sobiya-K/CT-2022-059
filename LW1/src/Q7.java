import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
        String time=sdf.format(new Date());

        frame.setTitle(time);
        frame.setSize(300,200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
