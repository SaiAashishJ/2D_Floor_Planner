import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ControlPanel extends JPanel{

    public JButton click;

    ControlPanel()
    {
        Border border = BorderFactory.createLineBorder(Color.black, 4);

        controlPanel.setBounds(10, 10, 313, 725);
        controlPanel.setBackground(new Color(0xffdc44));

        JPanel filePanel = new JPanel();
        filePanel.setBounds(30, 10, 253, 92);
        filePanel.setBackground(new Color(0xFFFFFF));

        JLabel newFile = new JLabel();
        ImageIcon ifile = new ImageIcon("ifile.jpg");
        newFile.setIcon(ifile);
        newFile.setBounds(0, 0, 70, 50);
        newFile.setBorder(border);

        filePanel.add(newFile);

        JPanel toolPanel = new JPanel();
        toolPanel.setBounds(30, 112, 253, 92);
        toolPanel.setBackground(new Color(0xFFFFFF));

        JPanel roomPanel = new JPanel();
        roomPanel.setBounds(30, 214, 253, 92);
        roomPanel.setBackground(new Color(0xFFFFFF));

        click = new JButton("Press Me");
        click.setBounds(20, 20, 150, 50);
        roomPanel.add(click);

        JPanel doorPanel = new JPanel();
        doorPanel.setBounds(30, 316, 253, 92);
        doorPanel.setBackground(new Color(0xFFFFFF));

        JPanel windowPanel = new JPanel();
        windowPanel.setBounds(30, 418, 253, 92);
        windowPanel.setBackground(new Color(0xFFFFFF));

        JPanel furniturePanel = new JPanel();
        furniturePanel.setBounds(30, 520, 253, 92);
        furniturePanel.setBackground(new Color(0xFFFFFF));

        JPanel fixturePanel = new JPanel();
        fixturePanel.setBounds(30, 622, 253, 92);
        fixturePanel.setBackground(new Color(0xFFFFFF));

        controlPanel.add(filePanel);
        controlPanel.add(toolPanel);
        controlPanel.add(roomPanel);
        controlPanel.add(doorPanel);
        controlPanel.add(windowPanel);
        controlPanel.add(furniturePanel);
        controlPanel.add(fixturePanel);
    }

    
}
