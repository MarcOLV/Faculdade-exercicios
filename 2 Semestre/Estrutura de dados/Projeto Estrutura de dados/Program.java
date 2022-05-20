
import javax.swing.JOptionPane;

public class Program 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {   
        Pilha pedido = new Pilha();

        JOptionPane.showMessageDialog(null, 
            "BEM VINDO A AUTO-LOJAGUNÇO"
        );

        String finalizarPedido;
        int qtdeclientes = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de clientes "));
        
        Pilha pedidos[] = new Pilha[qtdeclientes];
        Queue fila = new Queue(qtdeclientes);

        for(int i=0;i<qtdeclientes;i++){
        do {
            menu();
            Produto produto;
            int numeroProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do produto desejado: "));
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do produto: "));
            
            switch(numeroProduto)
            {
                case 1:
                   
                    produto = produtoModel(numeroProduto, quantidade);
                    
                    if( produto != null) 
                    {
                        pedido.push(produto);
                    }
                    
                    break;
                case 2:
                    produto = produtoModel(numeroProduto, quantidade);
                    
                    if( produto != null) 
                    {
                        pedido.push(produto);
                    }
                    break;
                case 3:
                    produto = produtoModel(numeroProduto, quantidade);
                    
                    if( produto != null) 
                    {
                        pedido.push(produto);
                    }
                    break;
                case 4:
                    produto = produtoModel(numeroProduto, quantidade);
                    
                    if( produto != null) 
                    {
                        pedido.push(produto);
                    }
                    break;
                case 5:
                    produto = produtoModel(numeroProduto, quantidade);
                    
                    if( produto != null) 
                    {
                        pedido.push(produto);
                    }
                    break;
                case 6:
                    produto = produtoModel(numeroProduto, quantidade);
                    
                    if( produto != null) 
                    {
                        pedido.push(produto);
                    }
                    break;
            }
            
            
           int retornodomenu;
        do{ 
          retornodomenu = Integer.parseInt(menu2());
            switch(retornodomenu){

                case 1:
                    JOptionPane.showMessageDialog(null, pedido.toString());
                break;
            
                case 2:
                    pedido.pop();
                    JOptionPane.showMessageDialog(null, "O ultimo produto foi excluido");
                break;

                case 3:
                    menu();
                    pedido.pop();
                    Produto produto1;
                    int numeroProduto1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do produto desejado: "));
                    int quantidade1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do produto: "));
                    produto1 = produtoModel(numeroProduto1, quantidade1);
                    if( produto1 != null) 
                    {
                        pedido.push(produto1);
                    }
                    break;
            }
        
        } while(retornodomenu != 4);
       
            finalizarPedido = JOptionPane.showInputDialog(null, "Finalizar pedido (S/N) ? ");
            
        } while(!finalizarPedido.equalsIgnoreCase("s"));
        
        
        JOptionPane.showMessageDialog(null, pedido.toString());
        JOptionPane.showMessageDialog(null, " Valor total do pedido: "+ pedido.valorTotal());

        String pago;
        pago = (JOptionPane.showInputDialog(null, " Pagar pedido? \n (S/N)"));

        if(pago.equalsIgnoreCase("s")){
            Pilha pedidoaux = pedido.clone();
            pedidos[i] = pedidoaux;
            pedido = new Pilha();

        }else{
            pedido.pop();
            JOptionPane.showMessageDialog(null, " Não esta pago!, Caloteiro");
            pedidos[i] = new Pilha();
        }
        
    } ////

        fila.enqueue(pedidos);
        
        JOptionPane.showMessageDialog(null," Fila de pedidos " + fila.toString());

        for(int i=0; i <= fila.getTotal(); i++){

            JOptionPane.showMessageDialog(null," Preparando pedido " + fila.peek());

            JOptionPane.showMessageDialog(null," Pedido Pronto ");

            fila.dequeue();

            JOptionPane.showMessageDialog(null," " + fila.toString());
            JOptionPane.showMessageDialog(null," Volte sempre ");
        }
    }
    
    public static void menu() 
    {
        JOptionPane.showMessageDialog(null, 
            "--------- MENU ------------\n ---Produtos no estoque ----\n" + 
            "\n 1 - Farol R$ 180 \n 2 - Roda R$ 500 \n 3 - Espatamento R$ 150 \n 4 - Bomba de gasolina R$ 120 \n 5 - Retrovisor R$ 150 \n 6 - Pneu R$ 200"
        );
    }

    public static String menu2() 
    {
        return JOptionPane.showInputDialog(null, 
            "--------- MENU ------------\n ---Pedidos----\n" + 
            "\n 1 - Consultar Produto \n 2 - Excluir ultimo produto inserido \n 3 - Editar ultimo produto \n 4 - Sair"
        );
    }

    
    
    public static Produto produtoModel(int numeroProduto, int quantidade) 
    {
        Estoque estoque = new Estoque();
        Produto produto = new Produto();
        
        numeroProduto -= 1;
        if(quantidade <= estoque.quantidade[numeroProduto]) 
        {
            produto = new Produto(estoque.produtos[numeroProduto], quantidade, estoque.precos[numeroProduto]);
                        
            // Atualiza estoque
            estoque.quantidade[numeroProduto] -= quantidade;
        } 
        else {
            JOptionPane.showMessageDialog(null, "Essa quantidade não possui no estoque !!! ");
            produto = new Produto(); 
        }
        
        return produto;
    }
}
