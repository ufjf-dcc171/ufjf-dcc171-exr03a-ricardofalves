package exr03a;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Equacao extends JFrame {

    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private final JTextField txt1;
    private final JTextField txt2;
    private final JTextField txt3;
    private double vlr1;
    private double vlr2;
    private double vlr3;
    private JButton resultado = new JButton();

    public Equacao() throws HeadlessException {
        super("Eq. segundo grau");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        label1 = new JLabel("primeiro numero: ");
        txt1 = new JTextField(10);
        add(label1);
        add(txt1);

        label2 = new JLabel("segundo numero: ");
        txt2 = new JTextField(10);
        add(label2);
        add(txt2);

        label3 = new JLabel("terceiro numero: ");
        txt3 = new JTextField(10);
        add(label3);
        add(txt3);

        label4 = new JLabel("raizes: ");
        add(resultado);
        resultado.addActionListener(new Click());
    }

    private class Click implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vlr1 = Double.parseDouble(txt1.getText());
            vlr2 = Double.parseDouble(txt2.getText());
            vlr3 = Double.parseDouble(txt3.getText());
            double delta = (Math.pow(vlr2, 2) - 4 * vlr1 * vlr3);
            double raiz1 = ((-vlr2 + Math.sqrt(delta)) / (2 * vlr1));
            double raiz2 = ((-vlr2 - Math.sqrt(delta)) / (2 * vlr1));
            JOptionPane.showMessageDialog(null, String.format("As raizes sao: %.2f e %.2f", raiz1, raiz2), "janela", JOptionPane.INFORMATION_MESSAGE);

        }
    }

}
