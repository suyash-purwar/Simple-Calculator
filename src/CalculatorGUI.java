import Logic.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI {
    CalculatorGUI() {
        // Setting frame for application
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLayout(null);
        frame.setVisible(true);

        // Heading of application
        JLabel heading = new JLabel("Calculator");
        heading.setBounds(50, 50, 300, 50);

        // Text fields for entering two numbers
        JTextField num1 = new JTextField("");
        num1.setBounds(50, 100, 600, 50);
        JTextField num2 = new JTextField("");
        num2.setBounds(50, 150, 600, 50);

        // Buttons for mathematical operations
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton into = new JButton("*");
        JButton divide = new JButton("/");

        // Assigning positions to buttons
        plus.setBounds(50, 200, 50, 50);
        minus.setBounds(100, 200, 50, 50);
        into.setBounds(150, 200, 50, 50);
        divide.setBounds(200, 200, 50, 50);

        // Label for showing alert
        JLabel alertLabel = new JLabel();
        alertLabel.setBounds(50, 250, 600, 70);

        // Providing functionality to each and every button
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!CalculatorLogic.isDataValid(num1.getText().trim(), num2.getText().trim())) {
                    alertLabel.setText("Pass numbers only");
                } else {
                    if (!CalculatorLogic.isFieldEmpty(num1.getText().trim(), num2.getText().trim())) {
                        int res = CalculatorLogic.plus(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
                        alertLabel.setText(String.valueOf(res));
                    } else {
                        alertLabel.setText("Fill all the fields");
                    }
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!CalculatorLogic.isDataValid(num1.getText().trim(), num2.getText().trim())) {
                    alertLabel.setText("Pass numbers only");
                } else {
                    if (!CalculatorLogic.isFieldEmpty(num1.getText().trim(), num2.getText().trim())) {
                        int res = CalculatorLogic.minus(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
                        alertLabel.setText(String.valueOf(res));
                    } else {
                        alertLabel.setText("Fill all the fields");
                    }
                }
            }
        });

        into.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!CalculatorLogic.isDataValid(num1.getText().trim(), num2.getText().trim())) {
                    alertLabel.setText("Pass numbers only");
                } else {
                    if (!CalculatorLogic.isFieldEmpty(num1.getText().trim(), num2.getText().trim())) {
                        int res = CalculatorLogic.into(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
                        alertLabel.setText(String.valueOf(res));
                    } else {
                        alertLabel.setText("Fill all the fields");
                    }
                }
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!CalculatorLogic.isDataValid(num1.getText().trim(), num2.getText().trim())) {
                    alertLabel.setText("Pass numbers only");
                } else {
                    if (!CalculatorLogic.isFieldEmpty(num1.getText().trim(), num2.getText().trim())) {
                        float res = CalculatorLogic.divide(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
                        alertLabel.setText(String.valueOf(res));
                    } else {
                        alertLabel.setText("Fill all the fields");
                    }
                }
            }
        });

        // Appending all elements in a frame
        frame.add(heading); frame.add(num1); frame.add(num2);
        frame.add(plus); frame.add(minus); frame.add(into); frame.add(divide);
        frame.add(alertLabel);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
