import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new  JLabel("The woman was stronger");
    JLabel msg2 = new JLabel("\nTies knotted together");

    public JBookQuote()
    {
        super("My favourite quotes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(msg1);
        add(msg2);
    }

    public static void main(String[] args)
    {
        JBookQuote frame = new JBookQuote();
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
