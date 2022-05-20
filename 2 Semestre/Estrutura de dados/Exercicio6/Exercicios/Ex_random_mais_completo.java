/**
 * Ex_random_mais_complexo.java
 * @author Ledón
 * @version 1.00 2017/2/16
 */

import java.util.*;

public class Ex_random_mais_completo {

    public static void main (String args[]) {
    	new Ex_random_mais_completo();
    }
    
    public Ex_random_mais_completo () {
    	//Geração aleatória dos itens do vetor:
    	float vet [] = new float[10];
    	for (int i=0; i < vet.length; i++) {
    		vet[i] = geraFloat();
    	}    	
    	System.out.println("\nVetor de 10 elementos gerados aleatoriamente");
    	System.out.println("com valores entre 0 e 9,999: \n");
        visualizaVetor(vet);  
        System.out.println("\n");
        
        //Demonstramos o algoritmo de Fisher-Yates para aleatorizar uma lista (com ArrayList):
        ArrayList lista = new ArrayList();
        lista.add(1.2f); lista.add(4.3f); lista.add(6.1f); lista.add(-7.7f);
        lista.add(0.4f); lista.add(-8.8f); lista.add(9.0f); lista.add(3.3f);
        System.out.println("\nLista original:");
        visualizaArrayList(lista);
        aleatorizarLista(lista);	
        System.out.println("\nLista anterior aleatorizada com o algoritmo de Fisher-Yates:");
        visualizaArrayList(lista);
        System.out.println("\n");
        
        //Demonstramos o algoritmo de Fisher-Yates para aleatorizar um vetor:
        double a[] = {1.2, 4.3, 6.1, -7.7, 0.4, -8.8, 9.0, 3.3 };
        System.out.println("\n\nVetor original:");
        visualizaVetor(a);
        aleatorizarVetor(a);	
        System.out.println("\nVetor anterior aleatorizado com o algoritmo de Fisher-Yates:");
        visualizaVetor(a);	
        System.out.println("\n");	
    }
    
    public float geraFloat() { 
    	//Oracle, nextFloat(): "Retorna o próximo valor real pseudo-aleatório uniformemente 
    	//distribuído entre 0,0 e 1,0 a partir da sequência deste gerador de números aleatórios."
    	Random rnd = new Random();
    	float numero = rnd.nextFloat();
    	return (numero * 10);
    }
    
    public void visualizaVetor(float vetor[]) {
    	for (int i=0; i < vetor.length; i++) {
    		System.out.print(vetor[i] + "  ||  ");
    	}    
    	System.out.println();    	
    }
    
    public void visualizaArrayList(ArrayList lista) {
    	for (int i=0; i < lista.size(); i++) {
    		System.out.print(lista.get(i) + "  ||  ");
    	}    
    	System.out.println();    	
    }   
    	    
    public void visualizaVetor( double vet[] ) {
    	for (int i=0; i < vet.length; i++) {
    		System.out.print(vet[i] + "  ||  ");
    	}    
    	System.out.println();    	
    } 
    	    	
    public void aleatorizarLista(ArrayList lista) { //parâmetro por referência
       // Algoritmo de Fisher-Yates, implementado em Java com ArrayList
       ArrayList listaTemp = new ArrayList(); // criamos uma lista auxiliar adicional
       Random rnd = new Random();
       while ( lista.size() > 1 ) {  
       		// selecionamos aleatoriamente uma posição da lista inicial:
    		int posAleat = rnd.nextInt(lista.size());
    		// adicionamos o elemento sorteado no final da lista auxiliar:
    		listaTemp.add(lista.get(posAleat)); 
    		// eliminamos o elemento da lista original:
    		lista.remove(posAleat);
       }
       // adicionamos o único restante no final da lista adicional:
       listaTemp.add(lista.get(0)); 
       lista.clear(); //limpamos a lista original
       // por último, passamos todos os elementos da lista adicional para a lista original
       for (int i=0; i < listaTemp.size(); i++) { 
    		lista.add(listaTemp.get(i)); 
       }               		
    } 
    	
    public void aleatorizarVetor( double vet[] ) { //parâmetro por referência
       // Algoritmo de Fisher-Yates, implementado em Java, utilizando vetores
       // Criamos um vetor auxiliar adicional, do mesmo tamanho do original:
       double vetTemp [] = new double[vet.length]; 
       Random rnd = new Random();
       int N = vet.length;
       int pos = 0;
       while ( N > 1 ) {  
       		// selecionamos aleatoriamente uma posição da lista inicial:
    		int posAleat = rnd.nextInt(N); //gera um número entre 0 e N-1
    		// adicionamos o elemento sorteado no final da lista auxiliar:
    		vetTemp[pos] = vet[posAleat]; 
    		// eliminamos o elemento da lista original:
    		deslocaEsquerda(vet, posAleat+1, N-1);
    		N--;
    		pos++;
       }
       // adicionamos o único restante no final da lista adicional:
       vetTemp[pos] = vet[0]; 
       // por último, passamos todos os elementos da lista adicional para a lista original:
       for (int i=0; i < vetTemp.length; i++) { 
    		vet[i] = vetTemp[i]; 
       }               		
    }     	
    	
    void deslocaEsquerda (double vet[], int de, int ate) { 
		if(de>ate)return;
		if(de<=0)de=1;
		if(ate > vet.length-1)ate=vet.length-1;
		// elimina o item na posição (d-1) e desloca os restantes
		for (int i = (de - 1); i < ate; i++) vet[i] = vet[i+1];
		vet[ate] = 0; // só para marcar o item final
	}		
	
    
}