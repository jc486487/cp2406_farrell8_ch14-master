import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener
{
    final int SIZE = 200;
    Container con = getContentPane();
    JButton button = new JButton("Click!");
    public JFrameDisableButton()
    {
        super("Disable Button");
        con.setLayout(new FlowLayout());
        setSize(SIZE, SIZE);
        setVisible(true);
        con.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        button.setEnabled(false);
    }

    public static void main(String[] args)
    {
        JFrameDisableButton frame =
                new JFrameDisableButton();
    }
}
