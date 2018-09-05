import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new  JLabel("The woman was stronger");
    JLabel msg2 = new JLabel("\nTies knotted together");
    JButton button = new JButton("Click for source");
    JLabel msg3 = new JLabel("**    Weak Women    **");

    public JBookQuote2()
    {
        super("Book Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(msg1);
        add(msg2);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(msg3);
        validate();
        repaint();
    }

    public static void main(String[] args)
    {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(270, 200);
        aFrame.setVisible(true);
    }
}