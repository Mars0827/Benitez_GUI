package LeapYear;

import javax.swing.*;

public class LeapYear extends JFrame{
    private JTextField tfYear ;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public LeapYear(){
        btnCheckYear.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());

            if (year % 400 == 0) {
                JOptionPane.showMessageDialog(this, " Leap year");
            }
            else if (year % 100 == 0) {
                JOptionPane.showMessageDialog(this, " Not a Leap year");
            }

            else if (year % 4 == 0) {
                JOptionPane.showMessageDialog(this, "Leap year");
            }
            else {
                JOptionPane.showMessageDialog(this, "Not a Leap year");
            }
        });
    }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");

    }
}
