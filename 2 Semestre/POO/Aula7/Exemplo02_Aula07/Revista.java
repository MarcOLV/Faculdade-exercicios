
import javax.swing.JOptionPane;

public class Revista extends Publicacao{
    private String editor;
    private String local;

    public Revista(String editor, String local, String titulo) {
        super(titulo, "");
        this.editor = editor;
        this.local = local;
    }

    public String getEditor() {
        return editor;
    }

    public String getLocal() {
        return local;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public void leitura(){
        String t;
        t = JOptionPane.showInputDialog("Digite o título");
        this.setTitulo(t);
        editor = JOptionPane.showInputDialog("Digite o editor");
        local = JOptionPane.showInputDialog("Digite o local");
    }

    @Override
    public void imprimir() {
        System.out.println("Título: " + getTitulo() + 
                "\nEditor: " + editor + 
                "\nLocal: " + local);
    }
    
    
}
