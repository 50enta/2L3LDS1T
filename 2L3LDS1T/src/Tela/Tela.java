package Tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Turma 2L3LDS1T");

        JPanel painel = new JPanel();
        JPanel painel2 = new JPanel();

        JTextField tx = new JTextField("abcd");

        Color cor = new Color(237, 222, 178);
        painel.setBackground(cor);
        painel.setLayout(new BorderLayout());

        JButton botao = new JButton("primeiro");

        painel2.add(botao);
        painel2.add(new JButton("Segundo"));
        painel.add(tx);
        tx.setBounds(100, 100, 1000, 1000);

        botao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showConfirmDialog(null, "Tem certeza?");
            }

        });

        JPanel painelTitulo = new JPanel();
        JLabel tit = new JLabel("Título da Janela");
        tit.setFont(new Font("arial", Font.BOLD, 40));
        painelTitulo.add(tit);
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
