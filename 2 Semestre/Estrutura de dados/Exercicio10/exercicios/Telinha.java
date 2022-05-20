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
	private JTextField tfnomeComprador;
	private JTextField tfnomeProduto;
	private JTextField tfvalorProduto;
	
	// Nossa fila:
	private TAD_Queue fila;
	private JTextArea taCompra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Queue fila = new Queue();
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

	public Telinha() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			
		}
		
		// Iniciar a fila:
		fila = new Queue();
		
		setTitle("Compras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do comprador");
		lblNewLabel.setBounds(10, 11, 130, 14);
		contentPane.add(lblNewLabel);
		
		tfnomeComprador = new JTextField();
		tfnomeComprador.setBounds(115, 8, 288, 20);
		contentPane.add(tfnomeComprador);
		tfnomeComprador.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do produto");
		lblNewLabel_1.setBounds(10, 49, 130, 20);
		contentPane.add(lblNewLabel_1);
		
		tfnomeProduto = new JTextField();
		tfnomeProduto.setBounds(110, 46, 288, 20);
		contentPane.add(tfnomeProduto);
		tfnomeProduto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Valor do produto");
		lblNewLabel_4.setBounds(10, 90, 130, 14);
		contentPane.add(lblNewLabel_4);
		
		tfvalorProduto = new JTextField();
		tfvalorProduto.setBounds(100, 90, 86, 20);
		contentPane.add(tfvalorProduto);
		tfvalorProduto.setColumns(10);
		
		JButton btnAdiciona = new JButton("Guardar");
		btnAdiciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaCompra(e);
			}
		});	
		btnAdiciona.setBounds(10, 388, 89, 23);
		contentPane.add(btnAdiciona);
		JButton btnRemove = new JButton("Cancelar");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeCompra(e);
			}
			
		});
		JButton btnListar = new JButton("Atender");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaCompra(e);
			}
		});
		btnRemove.setBounds(120, 388, 138, 23);
		contentPane.add(btnRemove);
 /////////////
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransferirCompra(e);

			}
		});
		btnTransferir.setBounds(270, 388, 138, 23);
		contentPane.add(btnTransferir);

		btnListar.setBounds(420, 388, 138, 23);
		contentPane.add(btnListar);

		taCompra = new JTextArea();
		taCompra.setBounds(10, 204, 700, 100);
		contentPane.add(taCompra);
	}
	
	private void adicionaCompra(ActionEvent e) {
		Compra compra = new Compra();
		// Obtendo os dados da interface gr�fica:
		compra.setNomeComprador(tfnomeComprador.getText());
		compra.setNomeProduto(tfnomeProduto.getText());
		compra.setValorProduto(Integer.parseInt(tfvalorProduto.getText()));
		
		// Enfileirando:
		fila.enqueue(compra);
		
		// Limpar a tela e exibir um status:
		tfnomeComprador.setText("");
		tfnomeProduto.setText("");
		tfvalorProduto.setText("");
		
		taCompra.setText("" + compra.toString());
	}
	
	private void removeCompra(ActionEvent e) {
	if(fila.isFull()){
			taCompra.setText("Cancelando a compra com prioridade \n" + fila.dequeue());
		}
		else{
			taCompra.setText("Cancelando a ultima compra  \n" + fila.dequeue1());
		}
		
	}
	private void TransferirCompra(ActionEvent e) {
		Object prioridade = "";
		if(fila.peek() == null){
			taCompra.setText("Não existe compra para ser colocada em prioridade");
		}
		else if(prioridade != null){	
			prioridade = fila.peek();
			taCompra.setText("Esta compra esta em prioridade agora \n " + prioridade);
		}
	}
	private void listaCompra(ActionEvent e) {
		if(fila.peek() == null){
			taCompra.setText("Não existe compra para ser atendida");
		}
		else{
			taCompra.setText(fila.toString());
		}
		}
	
}
