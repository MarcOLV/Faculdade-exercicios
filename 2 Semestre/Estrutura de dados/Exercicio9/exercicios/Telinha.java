package filaEstaticaSequencial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Telinha extends JFrame {

	private JPanel contentPane;
	private JTextField tfTitulo;
	private JTextField tfDiretor;
	private JTextField tfGenero;
	private JTextField tfPais;
	private JTextField tfAno;
	
	// Nossa fila:
	private TAD_Queue fila;
	private JTextArea taFilme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telinha frame = new Telinha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Telinha() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			
		}
		
		// Iniciar a fila:
		fila = new Queue();
		
		setTitle("Filmes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDtulo:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfTitulo = new JTextField();
		tfTitulo.setBounds(86, 8, 288, 20);
		contentPane.add(tfTitulo);
		tfTitulo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Diretor:");
		lblNewLabel_1.setBounds(10, 49, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		tfDiretor = new JTextField();
		tfDiretor.setBounds(86, 46, 288, 20);
		contentPane.add(tfDiretor);
		tfDiretor.setColumns(10);
		
		JButton btnAdiciona = new JButton("Adiciona");
		btnAdiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaFilme(e);
			}
		});
		btnAdiciona.setBounds(10, 388, 89, 23);
		contentPane.add(btnAdiciona);
		
		JLabel lblNewLabel_2 = new JLabel("G\u00EAnero:");
		lblNewLabel_2.setBounds(10, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		tfGenero = new JTextField();
		tfGenero.setBounds(86, 91, 86, 20);
		contentPane.add(tfGenero);
		tfGenero.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Pa\u00EDs:");
		lblNewLabel_3.setBounds(10, 137, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ano:");
		lblNewLabel_4.setBounds(10, 179, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		tfPais = new JTextField();
		tfPais.setBounds(86, 134, 86, 20);
		contentPane.add(tfPais);
		tfPais.setColumns(10);
		
		tfAno = new JTextField();
		tfAno.setBounds(86, 176, 86, 20);
		contentPane.add(tfAno);
		tfAno.setColumns(10);
		
		JButton btnRemove = new JButton("Remove n\u00E3o a\u00E7\u00E3o");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeFilmesNaoAcao(e);
			}
		});
		btnRemove.setBounds(120, 388, 138, 23);
		contentPane.add(btnRemove);
		
		taFilme = new JTextArea();
		taFilme.setBounds(10, 204, 421, 175);
		contentPane.add(taFilme);
	}
	
	private void adicionaFilme(ActionEvent e) {
		Filme filme = new Filme();
		
		// Obtendo os dados da interface gráfica:
		filme.setTitulo(tfTitulo.getText());
		filme.setDiretor(tfDiretor.getText());
		filme.setGenero(tfGenero.getText());
		filme.setPais(tfPais.getText());
		filme.setAno(Integer.parseInt(tfAno.getText()));
		
		// Enfileirando:
		fila.enqueue(filme);
		
		// Limpar a tela e exibir um status:
		tfTitulo.setText("");
		tfDiretor.setText("");
		tfGenero.setText("");
		tfPais.setText("");
		tfAno.setText("");
		
		taFilme.setText("Adicionado o filme: " + filme.toString());
	}
	
	private void removeFilmesNaoAcao(ActionEvent e) {
		boolean continua = true;
		taFilme.setText("Retirando os filmes: \n");
		while(continua) {
			Filme filme = fila.peek();
			if (filme != null && !filme.getGenero().equals("Ação")){
				fila.dequeue();
				taFilme.setText(taFilme.getText() + filme.toString() + "\n");
			}
			else {
				continua = false;
			}
		}
	}
}
