package PR7;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.util.Random;

public class TicTacForm extends JFrame {
    private JPanel panel;
    private JCheckBox checkBox;
    TicTacToe TicTacToe;
    private boolean fieldEmpty;
    JButton[] buttons;
    private boolean missed;

    public TicTacForm() {

        setTitle("Tic-Tac-Toe");
        setSize(500,500);

        setLayout(new BorderLayout());

        checkBox = new JCheckBox("Player 1", false);
        checkBox.addItemListener(new SelectSide());
        add(checkBox, BorderLayout.NORTH);
        panel = new JPanel();
        fieldEmpty = true;
        missed = false;

        add(panel,BorderLayout.CENTER);

        panel.setLayout(new GridLayout(3, 3));
        buttons = new JButton[9];


        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setPreferredSize(new Dimension(50, 50));
            buttons[i].setBackground(Color.WHITE);
            buttons[i].addMouseListener(new CellClicked());
            buttons[i].setFont(new Font("TimesRoman", Font.BOLD, 45));
            panel.add(buttons[i]);
        }
        TicTacToe = new TicTacToe(buttons);
    }

    class CellClicked implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            checkBox.setEnabled(false);
            missed = false;
            JButton button =(JButton)e.getSource();
            if (button.getText().equals("") && !button.getText().equals(TicTacToe.getComputerSide())) {
                button.setText(TicTacToe.getHumanSide());
                missed = true;
            }

            if (TicTacToe.checkWin(TicTacToe.getHumanSide())) {
                JOptionPane.showMessageDialog(TicTacForm.this, "You won");
                checkBox.setEnabled(true);
                TicTacToe.clearField();
            }
            if (TicTacToe.isTableFull()) {
                JOptionPane.showMessageDialog(TicTacForm.this, "Draw");
                checkBox.setEnabled(true);
                TicTacToe.clearField();
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (missed) {
                Random r = new Random();
                while (true) {
                    int i = r.nextInt(9);
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setText(TicTacToe.getComputerSide());
                        break;
                    }
                }
                if (TicTacToe.checkWin(TicTacToe.getComputerSide())) {
                    JOptionPane.showMessageDialog(TicTacForm.this, "You lost");
                    checkBox.setEnabled(true);
                    TicTacToe.clearField();
                }
                if (TicTacToe.isTableFull()) {
                    JOptionPane.showMessageDialog(TicTacForm.this, "Draw");
                    checkBox.setEnabled(true);
                    TicTacToe.clearField();
                }
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    class SelectSide implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            TicTacToe.changeSides();
            if (e.getStateChange() == ItemEvent.SELECTED) {
                checkBox.setText("Player 1");

            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                checkBox.setText("Player 2");
            }

        }
    }
}
