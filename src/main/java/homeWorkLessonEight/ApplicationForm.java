package homeWorkLessonEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
    class ApplicationForm extends JFrame implements ActionListener {
        TextField text;
        Panel panelDigits;
        Panel panelOperators;
        String buttonDigits[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String buttonOperators[] = {"-", "+", "x", "/"};
        String buttonOperatorsCalcAndCear[] = {"=", "C"};
        Button btnD[] = new Button[10];
        Button btnO[] = new Button[4];
        Button btnCC[] = new Button[2];
        int A = 0, B = 0, output = 0;
        char operator;

        public ApplicationForm () {

            Font font = new Font("Arial", Font.PLAIN, 25);
            text = new TextField();
            text.setBackground(new Color(223, 240, 248));
            text.setPreferredSize(new Dimension(300,40));
            text.setFont(font);
            panelDigits = new Panel();
            add(text, "North");
            add(panelDigits, "Center");
            panelDigits.setLayout(new GridLayout(4, 4));

            for (int i = 0; i < 10; i++) {
                btnD[i] = new Button(buttonDigits[i]);
                btnD[i].setFont(font);
                btnD[i].setBackground(new Color(168, 201, 231, 165));
                btnD[i].addActionListener(this);
                panelDigits.add(btnD[i]);
            }

            for (int j = 0; j < 2; j++) {
                btnCC[j] = new Button(buttonOperatorsCalcAndCear[j]);
                btnCC[j].setFont(font);
                btnCC[j].setBackground(new Color(222, 136, 124, 165));
                btnCC[j].addActionListener(this);
                panelDigits.add(btnCC[j]);
            }

            panelOperators = new Panel();
            add(panelOperators, "West");
            panelOperators.setLayout(new GridLayout(4, 4));
            for (int k = 0; k < 4; k++) {
                btnO[k] = new Button(buttonOperators[k]);
                btnO[k].setFont(font);
                btnO[k].setBackground(new Color(222, 136, 124, 165));
                btnO[k].setPreferredSize(new Dimension(70,50));
                btnO[k].addActionListener(this);
                panelOperators.add(btnO[k]);
            }

            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
        }

        public void actionPerformed(ActionEvent ae) {
            String str = ae.getActionCommand();
            if (str.equals("+")) {
                operator = '+';
                A = Integer.parseInt(text.getText());
                text.setText("");
            } else if (str.equals("-")) {
                operator = '-';
                A = Integer.parseInt(text.getText());
                text.setText("");
            } else if (str.equals("x")) {
                operator = '*';
                A = Integer.parseInt(text.getText());
                text.setText("");
            } else if (str.equals("/")) {
                operator = '/';
                A = Integer.parseInt(text.getText());
                text.setText("");
            } else if (str.equals("=")) {

                B = Integer.parseInt(text.getText());

                switch (operator) {

                    case '+':
                        output = A + B;
                        break;
                    case '-':
                        output = A - B;
                        break;
                    case '*':
                        output = A * B;
                        break;
                    case '/':
                        output = A / B;
                        break;
                }
                text.setText(output + "");
                output = 0;
            } else if (str.equals("C")) {

                text.setText("");
                A = B = output = 0;
            } else {
                text.setText(text.getText() + str);
            }
        }
    }