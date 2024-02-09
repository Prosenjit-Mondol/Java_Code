/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cce122;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialPadGUI extends JFrame implements ActionListener {
    private JTextField textField;
    private StringBuilder s;

    public DialPadGUI() {
        setTitle("Dial Pad");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel(new GridLayout(4, 3));
        String[] buttonLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonsPanel.add(button);
        }
        add(buttonsPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout());
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(e -> deleteLastDigit());
        controlPanel.add(deleteButton);

        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(e -> enterNumber());
        controlPanel.add(enterButton);

        add(controlPanel, BorderLayout.SOUTH);

        s = new StringBuilder();
    }

    private void deleteLastDigit() {
        if (s.length() > 0) {
            s.deleteCharAt(s.length() - 1);
            updateTextField();
        }
    }

    private void enterNumber() {
        JOptionPane.showMessageDialog(this, "Entered number: " + s.toString(), "Number Entered", JOptionPane.INFORMATION_MESSAGE);
        s.setLength(0);
        updateTextField();
    }

    private void updateTextField() {
        textField.setText(s.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        s.append(command);
        updateTextField();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DialPadGUI dialPad = new DialPadGUI();
            dialPad.setVisible(true);
        });
    }
}
