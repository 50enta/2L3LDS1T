package Tela;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tela {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Turma 2L3LDS1T");

        JPanel painel = new JPanel();
        JPanel painel2 = new JPanel();

        Color cor = new Color(237, 222, 178);
        painel.setBackground(cor);
        painel.setLayout(new BorderLayout());

        JButton botao = new JButton("primeiro");

        painel2.add(botao);
        painel2.add(new JButton("Segundo"));

        botao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showConfirmDialog(null, "Tem certeza?");
            }

        });

        JPanel painelTitulo = new JPanel();
        painelTitulo.add(new JLabel("Título da Janela"));
        painelTitulo.setBackground(Color.WHITE);

        painel.add(BorderLayout.NORTH, painelTitulo);
//        painel.add(BorderLayout.NORTH, botao);
        painel.add(BorderLayout.SOUTH, painel2);

//        
//        painel.add(new JButton("Terceiro"));
        janela.add(painel);
        janela.setSize(500, 450);
        janela.setVisible(true);
    }
}
