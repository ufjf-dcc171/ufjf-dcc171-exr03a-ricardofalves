package exr03a;

import javax.swing.JFrame;

public class Exr03a {

    public static void main(String[] args) {
        Equacao janela = new Equacao();
        janela.setSize(200, 300);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

}
