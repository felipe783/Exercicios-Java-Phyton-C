package br.com.dio.service;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class FinishedGameButton extends JButton {

    public FinishedGameButton(final ActionListener actionListener){
        this.setText("Concluir");
        this.addActionListener(actionListener);
    }
}
