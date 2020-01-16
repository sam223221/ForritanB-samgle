package fo.samgle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;

    private ActionListener button1Press;
    private ActionListener button2Press;
    private ActionListener button3Press;

    public Form() {
        frame = new JFrame();
        frame.setSize(620, 480);
        frame.setLayout(null);

        textField = new JTextField();
        textArea = new JTextArea();
    }

    public void Show() {

        button1Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText  = textField.getText();
                Log("Knapp 1: " + inputText);
            }
        };

        button2Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText  = textField.getText();
                Log("Knapp 2: " + inputText);
            }
        };

        button3Press = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText  = textField.getText();
                Log("Knapp 3: " + inputText);
            }
        };

        AddTextField(new Rectangle(10, 10, 600, 25));
        AddButton("Næsti tími", new Rectangle(10, 35, 100, 25), button1Press);
        AddButton("Et", new Rectangle(120, 35, 100, 25), button2Press);
        AddButton("Gang", new Rectangle(230, 35, 100, 25), button3Press);
        AddTextArea(new Rectangle(10, 65, 600, 400));
        frame.setVisible(true);
    }

    private void AddTextField(Rectangle position) {
        textField.setBounds(position);
        frame.add(textField);
    }

    private void AddButton(String caption, Rectangle rectangle, ActionListener actionListener) {
        JButton button = new JButton();
        button.setText(caption);
        button.setBounds(rectangle);
        button.addActionListener(actionListener);
        frame.add(button);
    }

    private void AddTextArea(Rectangle position) {
        textArea.setBounds(position);
        frame.add(textArea);
    }

    private void Log(String text) {
        textArea.append((text + "\n"));
    }
}