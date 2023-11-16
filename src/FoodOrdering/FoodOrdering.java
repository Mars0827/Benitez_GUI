package FoodOrdering;

import LeapYear.LeapYear;

import javax.swing.*;

public class FoodOrdering extends JFrame{
    private JCheckBox cTea;
    private JCheckBox cSoftDrinks;
    private JCheckBox cFries;
    private JCheckBox cBurger;
    private JCheckBox cPizza;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel jpanel;

    public FoodOrdering(){
        FoodOrdering a = this;
        boolean isTrue;
        btnOrder.addActionListener(e -> {
            float result = 0;
            if (cPizza.isSelected()) {
                result = result + 100;
            }
            if (cBurger.isSelected()) {
                result = result + 80;
            }
            if (cFries.isSelected()) {
                result = result + 65;
            }
            if (cSoftDrinks.isSelected()) {
                result = result + 55;
            }
            if (cTea.isSelected()) {
                result = result + 50;
            }
            if (cSundae.isSelected()) {
                result = result + 40;
            }
            if(rbNone.isSelected()){
                result = result;
            }
            if(rb5.isSelected()){
                result = (float) (result - (result * 0.05));
            }
            if(rb10.isSelected()){
                result = (float) (result - (result * 0.10));
            }
            if(rb15.isSelected()){
                result = (float) (result - (result * 0.15));
            }
            JOptionPane.showMessageDialog(a, "Total price is Php " + String.format("%.2f", result));
        });
    }

    public static void main(String[] args) {
        FoodOrdering app = new FoodOrdering();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");

    }


}
