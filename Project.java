import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Project implements ActionListener{

    public Frame frame;
    public JPanel canvasPanel;    // The panel where the floor plan is to be drawn
    public JPanel controlPanel;   // The panel where the controls buttons will be added
    public  ArrayList<JPanel> rooms = new ArrayList<JPanel>();
    public JButton newRoom;
    int roomNum = 0;

    public Project() {

        frame = new Frame("2D Floor Planner");

        // Maximum frame = ~1280x750

        controlPanel = new JPanel();
        canvasPanel = new JPanel();

        //Canvas Panel

        canvasPanel.setBounds(333, 10, 935, 725);
        canvasPanel.setBackground(Color.lightGray);

        //Control Panel

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

        JPanel doorPanel = new JPanel();
        doorPanel.setBounds(30, 316, 253, 92);
        doorPanel.setBackground(new Color(0xFFFFFF));

        JPanel windowPanel = new JPanel();
        windowPanel.setBounds(30, 418, 253, 92);
        windowPanel.setBackground(new Color(0xFFFFFF));

        JPanel furniturePanel = new JPanel();
        furniturePanel.setBounds(30, 520, 253, 92);
        furniturePanel.setBackground(new Color(0xFFFFFF));
// aashish
        JPanel fixturePanel = new JPanel();
        fixturePanel.setBounds(30, 622, 253, 92);
        fixturePanel.setBackground(new Color(0xFFFFFF));








































        newRoom = new JButton("New Room");
        newRoom.setBounds(20, 20, 150, 50);
        roomPanel.add(newRoom);

        newRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == newRoom) {

                    JDialog dialog = new JDialog(frame, "Room Type");

                    JTextField text1 = new JTextField();
                    JTextField text2 = new JTextField();
                    // StringBuilder roomtype = new StringBuilder("Bedroom");

                    String roomName[] = { "Bedroom", "Bathroom", "Kitchen", "Dining Room", "Drawing Room"};

                    JComboBox roomType = new JComboBox(roomName);

                    // roomType.addItemListener(new ItemListener() {

                    //     @Override
                    //     public void itemStateChanged(ItemEvent e) {

                            
                    //         // roomtype = new StringBuilder(roomType.getSelectedItem().toString());
                    //     }
                    // });

                    roomType.setBounds(50, 25, 200, 35);

                    dialog.add(roomType);
                    





                    text1.setBounds(100, 80, 100, 30);
                    text2.setBounds(100, 120, 100, 30);

                    JLabel l1 = new JLabel("Length");
                    JLabel l2 = new JLabel("Width");

                    l1.setBounds(30, 80, 100, 30);
                    l2.setBounds(30, 120, 100, 30);

                    JButton sub = new JButton("Submit");
                    sub.setBounds(120, 170, 60, 40);

                    
                    sub.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int room_Length = Integer.parseInt(text1.getText());
                            int room_Width = Integer.parseInt(text2.getText());
                            Addroom(room_Length, room_Width, roomType.getSelectedItem().toString());
                            dialog.dispose();
                        }
                    });

                    dialog.add(text1);
                    dialog.add(text2);
                    dialog.add(l1);
                    dialog.add(l2);
                    dialog.add(sub);

                    dialog.setSize(300, 300);
                    dialog.setLocation(200, 200);
                    dialog.setLayout(null);
                    dialog.setVisible(true);

                }
            }
        });








































        controlPanel.setLayout(null);
        controlPanel.add(filePanel);
        controlPanel.add(toolPanel);
        controlPanel.add(roomPanel);
        controlPanel.add(doorPanel);
        controlPanel.add(windowPanel);
        controlPanel.add(furniturePanel);
        controlPanel.add(fixturePanel);

        frame.add(controlPanel);
        frame.add(canvasPanel);
        
    }

    public static void main(String[] args) {
        Project p1 = new Project();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newRoom)
        {
            System.out.println("Hello");
        }
    }

    public void Addroom(int l, int b, String roomType)
    {
        rooms.add(new JPanel());
        rooms.get(roomNum).setPreferredSize(new Dimension(l, b));
        roomNum++;
    }
}