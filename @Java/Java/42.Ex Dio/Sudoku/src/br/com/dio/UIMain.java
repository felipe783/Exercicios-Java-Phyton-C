package br.com.dio;

import br.com.dio.ui.custom.frame.MainFrame;
import br.com.dio.ui.custom.painel.MainPainel;

import javax.swing.*;
import java.awt.*;

public class UIMain {

    public static void main(String[] args) {
        var dimension = new Dimension(600,600);
        JPanel mainPanel = new MainPainel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

}
