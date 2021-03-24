import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  JLabel resetLabel;
  int leftCount;
  int rightCount;

  Counter() {
	JFrame frame = new JFrame("Let's Count");
	frame.setLayout(new FlowLayout());
	frame.setSize(200,110);
	JButton left = new JButton("Left");
	JButton right = new JButton("Right");
  JButton reset = new JButton("Reset");
  leftCount = 0;
  rightCount = 0;
	left.addActionListener(this);
	right.addActionListener(this);
  reset.addActionListener(this);
	frame.add(left);
	frame.add(right);
  frame.add(reset);
	leftLabel = new JLabel("Count: " + leftCount);
  rightLabel = new JLabel("Count: " + rightCount);  
	frame.add(leftLabel);
  frame.add(rightLabel);
  frame.add(reset);
	frame.setVisible(true);
  }
public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left")) 
  {
	  leftCount += 1;
    leftLabel.setText("Count: " + leftCount);
    
  }
  else if(ae.getActionCommand().equals("Right"))
  {
	  rightCount += 1;
    rightLabel.setText("Count: " + rightCount);
  }
  else
  {
    rightCount = 0;
    leftCount = 0;
    leftLabel.setText("Count: " + leftCount);
    rightLabel.setText("Count: " + rightCount);
  }
 }
}