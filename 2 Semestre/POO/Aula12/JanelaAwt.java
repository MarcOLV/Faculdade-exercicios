public class JanelaAwt {
    public static void main(String[] args) {
        VisualAwt janela = new VisualAwt();
        //configura a janela
        //tamanho
        janela.setSize(160, 240);
        //posicionamento da janela
        janela.setLocation(200, 240);
        //titulo da janela
        janela.setTitle("Calculadora");
        //Visibilidade
        janela.setVisible(true);
        
    }
    
}
