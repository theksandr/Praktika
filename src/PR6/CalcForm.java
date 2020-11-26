package PR6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcForm extends JFrame {
    JPanel panel1;

    public CalcForm() {
        setTitle("Calculator");
        CalcPanel panel = new CalcPanel();
        add(panel);
        setSize(340, 480);
    }
}

class CalcPanel extends JPanel implements ActionListener {
    private final JButton display;
    private final JPanel panel;
    private String first;
    private String second;
    private String operand;


    public CalcPanel() {
        setLayout(new BorderLayout());

        first = second = operand = "";
        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);
        JButton button = new JButton("=");
        button.addActionListener(this);
        button.setBackground(Color.WHITE);
        add(button, BorderLayout.SOUTH);


        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new GridLayout(5, 4));

        addButton("7", Color.WHITE);
        addButton("8", Color.WHITE);
        addButton("9", Color.WHITE);
        addButton("/", Color.WHITE);

        addButton("4", Color.WHITE);
        addButton("5", Color.WHITE);
        addButton("6", Color.WHITE);
        addButton("*", Color.WHITE);

        addButton("1", Color.WHITE);
        addButton("2", Color.WHITE);
        addButton("3", Color.WHITE);
        addButton("-", Color.WHITE);

        addButton("0", Color.WHITE);
        addButton(".", Color.WHITE);
        addButton("%", Color.WHITE);
        addButton("+", Color.WHITE);
        addButton("C", Color.WHITE);

        add(panel, BorderLayout.CENTER);
    }
    private void addButton(String label,Color color) {
        JButton button = new JButton(label);
        button.addActionListener(this);
        button.setBackground(color);
        panel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!operand.equals("")) {
                second = second + s;
            } else {
                first = first + s;
            }
            display.setText(first + operand + second);
        }
        else if (s.charAt(0) == 'C') {
            first = operand = second = "";

            display.setText(first + operand + second);
        }
        else if (s.charAt(0) == '=') {

            double res = switch (operand) {
                case "+" -> (Double.parseDouble(first) + Double.parseDouble(second));
                case "-" -> (Double.parseDouble(first) - Double.parseDouble(second));
                case "/" -> (Double.parseDouble(first) / Double.parseDouble(second));
                default -> (Double.parseDouble(first) * Double.parseDouble(second));
            };

            display.setText(first + operand + second + "=" + res);

            first = Double.toString(res);

            operand = second = "";

        } else if (s.charAt(0) == '%') {

            double res = switch (operand) {
                case "+" -> (Double.parseDouble(first) + (Double.parseDouble(first)) / 100 * Double.parseDouble(second));
                case "-" -> (Double.parseDouble(first) - (Double.parseDouble(first)) / 100 * Double.parseDouble(second));
                case "/" -> ((Double.parseDouble(first) / (Double.parseDouble(second) / 100)));
                default -> (Double.parseDouble(first) * Double.parseDouble(second) / 100);
            };

            display.setText(first + operand + second + "% =" + res);

            first = Double.toString(res);

            operand = second = "";
        }
        else {
            if (operand.equals("") || second.equals(""))
                if (first.isEmpty()) {
                    first = s;
                } else {
                    operand = s;
                }
            else {
                double te = switch (operand) {
                    case "+" -> (Double.parseDouble(first) + Double.parseDouble(second));
                    case "-" -> (Double.parseDouble(first) - Double.parseDouble(second));
                    case "/" -> (Double.parseDouble(first) / Double.parseDouble(second));
                    default -> (Double.parseDouble(first) * Double.parseDouble(second));
                };


                first = Double.toString(te);

                operand = s;

                second = "";
            }

            display.setText(first + operand + second);
        }
    }
}
