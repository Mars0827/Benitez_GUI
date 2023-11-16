package Calculator;

import javax.swing.*;

public class Calculator extends JFrame{
    private JPanel jpanel;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextArea lblResult;
    private JButton btnCompute;



    public Calculator(){

        btnCompute.addActionListener(e -> {
            String input1Text = tfNumber1.getText();
            String input2Text = tfNumber2.getText();

            int num1 = Integer.parseInt(input1Text);
            int num2 = Integer.parseInt(input2Text);
            int res =0;

            if(cbOperations.getSelectedIndex()==0) {
                res = num1+num2;
            }
            else if(cbOperations.getSelectedIndex()==1) {
                res = num2-num1;
            }
            else if(cbOperations.getSelectedIndex()==2) {
                res = num1*num2;
            }
            else if(cbOperations.getSelectedIndex()==2) {
                res = num1/num2;
            }

            lblResult.append(String.valueOf(res+ "\n"));
        });
    }

    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Calculator");

    }
}
