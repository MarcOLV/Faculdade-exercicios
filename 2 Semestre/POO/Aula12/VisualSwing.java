import javax.swing.*;
import java.awt.*;

public class VisualSwing extends JFrame{
    //criar os objetos
    //botão com o texto
    private JButton btn1 = new JButton("Calcular");
    //labels (textos fixos) - rótulo
    private JLabel lbl1 = new JLabel("1o. valor");
    private JLabel lbl2 = new JLabel("2o. valor");
    //caixa de texto - entrada de dados
    private JTextField txt1 = new JTextField(6);
    private JTextField txt2 = new JTextField(6);
    
    //grupo de botões
    ButtonGroup grupo = new ButtonGroup();
    //botões do tipo rádio - escolha única
    private JRadioButton r1 = new JRadioButton("Somar", true); //true - marca o item
    private JRadioButton r2 = new JRadioButton("Multiplicar", false);
    
    //botões do tipo checkbox - escolha múltipla
    private JCheckBox ch1 = new JCheckBox("Opção Adicional", false);
    private JCheckBox ch2 = new JCheckBox("Outra opção", true);
    
    //construtor
    public VisualSwing(){
        //define o layout
        //getContentPane().setLayout(new FlowLayout());
        //layout de grid(linhas, colunas)
        //getContentPane().setLayout(new GridLayout(3,3));
        //layout de regiões
        //getContentPane().setLayout(new BorderLayout());
        //layout nulo
        getContentPane().setLayout(null);
        //adiciona componentes na janela
        /*getContentPane().add(lbl1, BorderLayout.WEST);
        getContentPane().add(txt1, BorderLayout.CENTER);
        getContentPane().add(lbl2, BorderLayout.EAST );
        getContentPane().add(txt2,  BorderLayout.NORTH);
        getContentPane().add(btn1, BorderLayout.SOUTH);*/
        getContentPane().add(lbl1);
        lbl1.setBounds(10, 10, 55, 30);
        getContentPane().add(txt1);
        txt1.setBounds(60, 10, 55, 30);
        getContentPane().add(lbl2);
        lbl2.setBounds(10, 40, 55, 30);
        getContentPane().add(txt2);
        txt2.setBounds(60, 40, 55, 30);
        //adiciona botões do tipo rádio no mesmo grupo
        grupo.add(r1);
        grupo.add(r2);
        getContentPane().add(r1);
        r1.setBounds(10, 80, 100, 30);
        getContentPane().add(r2);
        r2.setBounds(120, 80, 100, 30);
        getContentPane().add(ch1);
        ch1.setBounds(10, 120, 120, 30);
        getContentPane().add(ch2);
        ch2.setBounds(140, 120, 100, 30);
        getContentPane().add(btn1);
        btn1.setBounds(10, 160, 100, 30);
        getContentPane().setBackground(Color.yellow);
        r1.setBackground(Color.yellow);
        r2.setForeground(Color.blue);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //fecha a janela
    }
}
