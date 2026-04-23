package br.com.dio.service;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    public ResetButton(final ActionListener actionListener){
        this.setText("Resetar");
        this.addActionListener(actionListener);
    }
}
