//BOX layout manager
 import java.awt.*; 
 import javax.swing.*;
class BoxDemo extends JFrame
{
BoxDemo ()
{
//create a label and a text field
 JLabel l1= new JLabel ("Enter Name:");
  JTextField t1= new JTextField(20);
   t1.setMaximumSize (t1.getPreferredSize());
//create top horizontal box and add above components to it
 Box horiz1 = Box.createHorizontalBox();
horiz1.add(l1);
horiz1.add(Box.createHorizontalStrut (20)); //gap 20 px]
horiz1.add(t1);
//create a label and a text field
JLabel l2= new JLabel ("Enter Password: ");
 JTextField t2= new JTextField(20);
  t2.setMaximumSize (t2.getPreferredSize());
//create a middel horizontal box and add above components to it
 Box horiz2 = Box.createHorizontalBox();
  horiz2.add(l2);
horiz2.add(Box.createHorizontalStrut (20)); //gap 20 px
horiz2.add(t2);
//create two push buttons
JButton b1= new JButton("OK");
JButton b2= new JButton("Cancel");
//construct the bottom horizontal box and add components in it 
Box horiz3 = Box.createHorizontalBox();
horiz3.add(b1);
horiz3.add(Box.createHorizontalGlue()); //throw buttons apart
horiz3.add(b2);

//add the three horizontal boxes inside a vertical box 
Box vert = Box.createVerticalBox();
vert.add(horiz1);
vert.add(Box.createVerticalStrut (100)); //gap of 100 px 
vert.add(horiz2);
vert.add(Box.createVerticalStrut(100));
vert.add(horiz3);

//add the vertical box to the content pane
Container c = getContentPane();
 c.add(vert);
}
public static void main(String args[])
{
//create frame
BoxDemo bd = new BoxDemo();
 bd.setSize(400,350);
  bd.setVisible(true);
bd.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
}
}