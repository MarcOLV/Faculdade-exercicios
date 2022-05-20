public class JanelaSwing {
    public static void main(String[] args) {
        VisualSwing janela = new VisualSwing();
        janela.setSize(160,240);
        janela.setLocation(450, 240);
        janela.setTitle("Calculadora");
        janela.setVisible(true);
        //para proibir redimensionar a janela
        //janela.setResizable(false);
    }
    
}
