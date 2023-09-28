import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private Dice dice1 = new Dice(), dice2 = new Dice();



    public GUI() {
        super("Dice");
        setSize(300,300);
        Dimension screenSize = getToolkit().getScreenSize();
        setLocation((screenSize.width-getWidth())/2, (screenSize.height-getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton bRoll = new JButton("ROLL");
        bRoll.setBounds(90,20,100,50);
        bRoll.setBackground(Color.BLACK);
        bRoll.setForeground(Color.WHITE);
        add(bRoll);

        ImageIcon diceOne = new ImageIcon("resources/dice1.png\n");
        ImageIcon diceTwo = new ImageIcon("resources/dice1.png\n");

        JLabel label = new JLabel("ROLL THE DICE NOW");
        label.setBounds(70,100,300,100);
        add(label);

        add(new JLabel(diceOne)).setBounds(50,50,100,100);
        add(new JLabel(diceTwo)).setBounds(150,50,100,100);


        bRoll.addActionListener(e -> {
            dice1.roll();
            dice2.roll();

            if (dice1.getNumberOfEyes() == dice2.getNumberOfEyes()) {
                label.setText("Congrats you have a pasch of " + dice1.getNumberOfEyes());
            } else label.setText("Dice one: " + dice1.getNumberOfEyes() + "  |  Dice two: " + dice2.getNumberOfEyes());
        });


        setVisible(true);
    }




}
