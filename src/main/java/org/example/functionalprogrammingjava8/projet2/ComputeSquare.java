package org.example.functionalprogrammingjava8.projet2;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComputeSquare extends JFrame {

    JTextField number;
    JTextField square;
    JButton submit;
    JButton myButton;
    JPanel panel;


    public ComputeSquare() {

        number = new JTextField(10);
        square = new JTextField(10);
        submit = new JButton("Submit");
       myButton= new JButton("Presse me");
       myButton.addActionListener(x-> System.out.println("Button Pressed"));
        submit.addActionListener(x -> {
            try {
                int num = Integer.parseInt(number.getText());
                square.setText(Integer.toString(num * num));
            } catch (NumberFormatException e) {
                System.out.println(number.getText() + " is  not a number.");
            }
        });

        panel = new JPanel();
        setSize(200, 130);
        panel.add(number);
        panel.add(submit);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComputeSquare();
    }
}
