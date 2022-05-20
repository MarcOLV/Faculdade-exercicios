import java.util.ArrayList;

import java.util.ArrayList;

public class InvercaoDeVetor{
    public static void main(String [] args){
        new InvercaoDeVetor();
    }
    public InvercaoDeVetor(){
        //declaramos um vetor:
        double vet[] = {9.5, 6.3, 1.2, 5.4, 0.5, 4.3};
        ArrayList al = new ArrayList();
        for (int i = 0; i < vet.length; i++){
            al.add(vet[i]);
        }
                
        System.out.println("Vetor original:");
        visualizar(vet);

        invertaVetor(vet);
        System.out.println("Vetor invertido:");
        visualizar(vet);

        //declaramos um vetor:
        double vet1[] = {9.5, 6.3, 1.2, 5.4, 0.5, 4.3, 4.2};
        ArrayList al1 = new ArrayList();
        for (int i = 0; i < vet1.length; i++){
            al1.add(vet1[i]);
        }
                
        System.out.println("Vetor original:");
        visualizar(vet1);

        invertaVetor(vet1);
        System.out.println("Vetor invertido:");
        visualizar(vet1);
                
        System.out.println("ArrayList original:");
        visualizar(al);

        invertaVetor(al);
        System.out.println("Vetor invertido:");
        visualizar(al);
                
        System.out.println("ArrayList original:");
        visualizar(al1);

        invertaVetor(al1);
        System.out.println("Vetor invertido:");
        visualizar(al1);
    }
    public void invertaVetor(double[] a){
        double aux; // armazena um dos valores trocados
        for (int i = 0; i < a.length / 2; i++){ // percorre apenas a primeira metade do vetor
            // troca os valores das posições i e length - 1 -i
            aux = a[i];
            a[i] = a[a.length - 1 -i];
            a[a.length -1 -i] = aux;
        }
    }
    public void invertaVetor(ArrayList a){
        double aux;
        for (int i = 0; i < a.size() / 2; i++){
            aux = (double)a.get(i);
            a.set(i, a.get(a.size() - 1 - i));
            a.set(a.size() - 1 - i, aux);
        }
    }
    public void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println();
    }
    public void visualizar(ArrayList vetor){
        for (int i = 0; i < vetor.size(); i++){
            System.out.print(vetor.get(i) + "   ");
        }
        System.out.println();
    }
}