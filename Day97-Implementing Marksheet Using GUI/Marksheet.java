import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.File;
 class Marksheet extends JPanel implements ActionListener {
   
JFrame f;
JLabel d1, d2, d3, d4, r1, r2, r3, r4, r5, title, s1, s2, s3, s4, s5, tot,
avg, roll, name, piclabel;
JTextField n, rnum, avg1, tot1, m1, m2, m3, m4, m5;
JButton submit;
Marksheet () {
f = new JFrame("MARKSHEET");
f.setSize(550, 800);
piclabel = new JLabel(new ImageIcon("profile.png"));
piclabel.setBounds(330, 100, 150, 150);
f.add(piclabel);
// f.setVisible(true); add this in last step of constructor otherwise 
// won't visible
title = new JLabel("STUDENT MARKSHEET");
title.setBounds(200, 50, 200, 30);
d1 = new JLabel("Enter student details in the below text fields");
d1.setBounds(30, 100, 300, 30);
name = new JLabel("NAME -> ");
name.setBounds(30, 150, 100, 30);
 roll = new JLabel("ROLL NO -> ");
roll.setBounds(30, 200, 100, 30);
 d2 = new JLabel("Enter student's marks/100 in the below text fields");
d2.setBounds(30, 250, 300, 30);
s1 = new JLabel("SUBJECT 1 -> ");
s2 = new JLabel("SUBJECT 2 -> ");
s3 = new JLabel("SUBJECT 3 -> ");
s4 = new JLabel("SUBJECT 4 -> ");
s5 = new JLabel("SUBJECT 5 -> ");
s1.setBounds(30, 300, 100, 30);
s2.setBounds(30, 350, 100, 30);
s3.setBounds(30, 400, 100, 30);
s4.setBounds(30, 450, 100, 30);
s5.setBounds(30, 500, 100, 30);
tot = new JLabel("TOTAL -> ");
tot.setBounds(30, 550, 100, 30);
avg = new JLabel("AVERAGE -> ");
avg.setBounds(30, 600, 100, 30);
d3 = new JLabel();
d3.setBounds(150, 250, 100, 30);
f.add(d3);
d4 = new JLabel();
d4.setBounds(330, 250, 100, 30);
f.add(d4);
r1 = new JLabel();
r1.setBounds(330, 300, 100, 30);
f.add(r1);
r2 = new JLabel();
r2.setBounds(330, 350, 100, 30);
f.add(r2);
r3 = new JLabel();
r3.setBounds(330, 400, 100, 30);
f.add(r3);
r4 = new JLabel();
r4.setBounds(330, 450, 100, 30);
f.add(r4);
r5 = new JLabel();
r5.setBounds(330, 500, 100, 30);
f.add(r5);
f.add(name);
f.add(roll);
f.add(s1);
f.add(s2);
f.add(s3);
f.add(s4);
f.add(s5);
f.add(tot);
f.add(avg);
f.add(d1);
f.add(d2);
f.add(title);
n = new JTextField();
n.setBounds(150, 150, 150, 30);
rnum = new JTextField();
rnum.setBounds(150, 200, 150, 30);
m1 = new JTextField();
m1.setBounds(150, 300, 150, 30);
m2 = new JTextField();
m2.setBounds(150, 350, 150, 30);
m3 = new JTextField();
m3.setBounds(150, 400, 150, 30);
m4 = new JTextField();
m4.setBounds(150, 450, 150, 30);
m5 = new JTextField();
m5.setBounds(150, 500, 150, 30);
//!-->REST CODE REFER GITHUB PROFILE--------------->//

f.add(n);
f.add(rnum);
f.add(m1);
f.add(m2);
f.add(m3);
f.add(m4);
f.add(m5);
submit = new JButton("SUBMIT");
submit.setBounds(250, 650, 100, 30);
submit.addActionListener(this);
f.add(submit);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == submit) {
n.setEditable(false);
rnum.setEditable(false);
m1.setEditable(false);
m2.setEditable(false);
m3.setEditable(false);
m4.setEditable(false);
m5.setEditable(false);
d1.setText("Student details:");
d2.setText("SUBJECTS");
d3.setText("MARKS/100");
d4.setText("PASS/FAIL");
String mark1, mark2, mark3, mark4, mark5;
int TOTAL;
mark1 = m1.getText();
mark2 = m2.getText();
mark3 = m3.getText();
mark4 = m4.getText();
mark5 = m5.getText();
if (Integer.parseInt(mark1) >= 35)
r1.setText("PASS");
else
r1.setText("FAIL");
if (Integer.parseInt(mark2) >= 35)
r2.setText("PASS");
else
r2.setText("FAIL");
if (Integer.parseInt(mark3) >= 35)
r3.setText("PASS");
else
r3.setText("FAIL");
if (Integer.parseInt(mark4) >= 35)
r4.setText("PASS");
else
r4.setText("FAIL");
if (Integer.parseInt(mark5) >= 35)
r5.setText("PASS");
else
r5.setText("FAIL");
TOTAL = Integer.parseInt(mark1) + Integer.parseInt(mark2) + 
Integer.parseInt(mark3)
+ Integer.parseInt(mark4) + Integer.parseInt(mark5);
tot1 = new JTextField(Integer.toString(TOTAL) + "/500");
f.add(tot1);
tot1.setBounds(150, 550, 150, 30);
tot1.setEditable(false);
float AVERAGE = (float) TOTAL / 5;
avg1 = new JTextField(Float.toString(AVERAGE) + "/100");
f.add(avg1);
avg1.setBounds(150, 600, 150, 30);
avg1.setEditable(false);
submit.setVisible(false);
f.remove(submit);
}
}
public static void main(String[] args) {
Marksheet m = new Marksheet();
}
}


