import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTVDownload2 extends JFrame implements ItemListener
{
    JComboBox<String> programBox = new JComboBox<String>();
    JLabel programList = new JLabel("                Program List               ");
    JTextField descripField = new JTextField(45);
    String[] progs = {"Breaking Bad",
            "Orange is the New Black", "Twilight Zone",
            "Parks and Recreation", "Everybody Loves Raymond"};

    String[] descrips = {"", "Teacher becomes meth dealer",
            "Life in women's prison",
            "Classic science fiction episodes",
            "Comedy in local government office",
            "Family comedy with meddling in-laws"};

    public JTVDownload2()
    {
        super("JTVDownload");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        programBox.addItemListener(this);
        add(programList);
        programBox.addItem("none");
        for(int x = 0; x < progs.length; ++x)
            programBox.addItem(progs[x]);
        add(programBox);
        programBox.setEditable(true);
        add(descripField);
    }

    public static void main(String[] arguments)
    {
        JTVDownload2 frame = new JTVDownload2();
        frame.setSize(500,250);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list)
    {
        Object source = list.getSource();
        if(source == programBox)
        {
            int num = programBox.getSelectedIndex();
            try
            {
                descripField.setText(descrips[num]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                descripField.setText("Sorry - request not recognized");
            }
        }
    }
}
