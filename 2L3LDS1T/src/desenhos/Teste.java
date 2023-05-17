package desenhos;

import javax.swing.JFrame;

public class Teste extends JFrame {

    public Teste() {
        super("Nossa Janela");

        this.add(new Painel());

        this.setSize(700, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Teste();
    }

}
