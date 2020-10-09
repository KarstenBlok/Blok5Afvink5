import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Afvink5Vertalen extends JFrame implements ActionListener {
    private JButton VertaalButton;
    private JLabel label;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        Afvink5Vertalen frame = new Afvink5Vertalen();
        frame.setSize(600, 200);
        frame.createGUI();
        frame.setVisible(true);
    }

    void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        label = new JLabel("Voer hier je 1 lettercode in");
        VertaalButton = new JButton("vertaal");
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField1.setPreferredSize(new Dimension(70, 25));
        textField2.setPreferredSize(new Dimension(550, 120));
        window.add(label);
        window.add(textField1);
        window.add(VertaalButton);
        window.add(textField2);
        VertaalButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String x = textField1.getText().toUpperCase();
        String nietzolegestring = "";
        try {
            for (int i = 0; i < x.length(); i++) {
                char z = x.charAt(i);
                String a = Character.toString(z);
                String y = Translator.one2three(a);
                nietzolegestring += y+" ";
            textField2.setText(nietzolegestring);
        }} catch (NotAnAA notAnAA) {
            textField2.setText(notAnAA.getMessage());
            }
        }

    }
