import java.awt.*; //importa o pacote gráfico AWT

public class VisualAwt extends Frame{
    //criar os objetos
    //botão com o texto
    private Button btn1 = new Button("Calcular");
    //labels (textos fixos) - rótulo
    private Label lbl1 = new Label("1o. valor");
    private Label lbl2 = new Label("2o. valor");
    //caixa de texto - entrada de dados
    private TextField txt1 = new TextField(6);
    private TextField txt2 = new TextField(6);
    
    //grupo de botões
    CheckboxGroup grupo = new CheckboxGroup();
    //botões do tipo rádio - escolha única
    private Checkbox r1 = new Checkbox("Somar", grupo, true); //true - marca o item
    private Checkbox r2 = new Checkbox("Multiplicar", grupo, false);
    
    //botões do tipo ckeckbox - escolha múltipla
    private Checkbox ch1 = new Checkbox("Opção Adicional", false);
    private Checkbox ch2 = new Checkbox("Outra opção", true);
    
    //construtor
    public VisualAwt(){
        //configura o layout 
        //FlowLayout posiciona componentes um do lado
        //do outro na ordem de inserção
        setLayout(new FlowLayout());
        //add = adicionar os componentes na janela
        add(lbl1); 
        add(txt1);
        add(lbl2);
        add(txt2);
        add(r1);
        add(r2);
        add(ch1);
        add(ch2);
        add(btn1);
    }
    
    
}
