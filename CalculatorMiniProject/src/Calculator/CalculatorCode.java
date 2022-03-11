package Calculator;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//ActionListener to performed the action in the box
public class CalculatorCode implements ActionListener {

	JFrame f;
	JTextField t;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, beq, bdel, bdec, bclr;
//integer double values
	static double a = 0, b = 0, result = 0;
	static int opeartor = 0;

	CalculatorCode() {
		// Design and layout of Calculator GUI
		f = new JFrame("Calculator");
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// For closed
		f.setBounds(20, 20, 300, 350);
		f.setResizable(false);
		Font fo = new Font("Arial", Font.BOLD, 20);
		// text box
		t = new JTextField();
		t.setFont(fo);
		t.setBackground(Color.cyan);
		t.setForeground(Color.blue);
		t.setBounds(40, 40, 200, 50);
		f.add(t);
		// Button
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		badd = new JButton("+");
		badd.setFont(fo);
		bsub = new JButton("-");
		badd.setFont(fo);
		bmul = new JButton("*");
		bmul.setFont(fo);
		bdiv = new JButton("/");
		bdiv.setFont(fo);
		beq = new JButton("=");
		beq.setFont(fo);
		bdec = new JButton(".");
		bdec.setFont(fo);
		bdel = new JButton("Delete");
		bclr = new JButton("Clear");
		// button layouts 789/
		b7.setBounds(40, 100, 50, 40);
		b8.setBounds(90, 100, 50, 40);
		b9.setBounds(140, 100, 50, 40);
		bdiv.setBounds(190, 100, 50, 40);

		// button layouts 4567*
		b4.setBounds(40, 140, 50, 40);
		b5.setBounds(90, 140, 50, 40);
		b6.setBounds(140, 140, 50, 40);
		bmul.setBounds(190, 140, 50, 40);

		// button layouts 123-
		b1.setBounds(40, 180, 50, 40);
		b2.setBounds(90, 180, 50, 40);
		b3.setBounds(140, 180, 50, 40);
		bsub.setBounds(190, 180, 50, 40);

		// operators
		bdec.setBounds(40, 220, 50, 40);
		b0.setBounds(90, 220, 50, 40);
		beq.setBounds(140, 220, 50, 40);
		badd.setBounds(190, 220, 50, 40);

		// Del/clr
		bdel.setBounds(40, 260, 100, 40);
		bclr.setBounds(140, 260, 100, 40);

//Action add
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bdec.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);

//for add button
		f.add(t);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(badd);
		f.add(bsub);
		f.add(bmul);
		f.add(bdiv);
		f.add(beq);
		f.add(bdec);
		f.add(bdel);
		f.add(bclr);

	}

	public static void main(String[] args) {
		new CalculatorCode();

	}

//body define for ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bclr) {
			t.setText("");
		}
		if (e.getSource() == bdel) {
			String s = t.getText();
			t.setText("");
			for (int i = 0; i < s.length() - 1; i++)
				t.setText(t.getText() + s.charAt(i));

		}
		if (e.getSource() == b1) {
			t.setText(t.getText().concat("1"));
		}
		if (e.getSource() == b2) {
			t.setText(t.getText().concat("2"));
		}
		if (e.getSource() == b3) {
			t.setText(t.getText().concat("3"));
		}
		if (e.getSource() == b4) {
			t.setText(t.getText().concat("4"));
		}
		if (e.getSource() == b5) {
			t.setText(t.getText().concat("5"));
		}
		if (e.getSource() == b6) {
			t.setText(t.getText().concat("6"));
		}
		if (e.getSource() == b7) {
			t.setText(t.getText().concat("7"));
		}
		if (e.getSource() == b8) {
			t.setText(t.getText().concat("8"));
		}
		if (e.getSource() == b9) {
			t.setText(t.getText().concat("9"));
		}
		if (e.getSource() == b0) {
			t.setText(t.getText().concat("0"));
		}
		if (e.getSource() == bdec) {
			t.setText(t.getText().concat("."));
		}
		if (e.getSource() == badd) {
			a = Double.parseDouble(t.getText());
			opeartor = 1;
			t.setText("");
		}
		if (e.getSource() == bsub) {
			a = Double.parseDouble(t.getText());
			opeartor = 2;
			t.setText("");
		}
		if (e.getSource() == bmul) {
			a = Double.parseDouble(t.getText());
			opeartor = 3;
			t.setText("");
		}
		if (e.getSource() == bdiv) {
			a = Double.parseDouble(t.getText());
			opeartor = 4;
			t.setText("");
		}
		// switch for action perform
		if (e.getSource() == beq) {
			b = Double.parseDouble(t.getText());
			switch (opeartor) {
			case 1:
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3:
				result = a * b;
				break;
			case 4:
				result = a / b;
				break;

			}
			t.setText("" + result);

		}

	}

}