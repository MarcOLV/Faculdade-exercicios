public class MergePaises {

    public static void main(String args[]) {
        new MergePaises();
    }

    public MergePaises() {
        String veta[] = {"Angola", "Bolívia", "Chile", "Cuba", "Grécia", "Itália", "Moçambique", "Portugal",
            "Rússia", "Suécia"};
        String vetb[] = {"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França",
            "Inglaterra", "Paraguai", "Turquia", "Uruguai", "Venezuela", "Zimbawe"};

        String vetFusionado[] = new String[veta.length + vetb.length];
        mergePaises(veta, vetb, vetFusionado);

        System.out.println("Vetor fusionado:");
        for (int i = 0; i < vetFusionado.length; i++) {
            System.out.println(vetFusionado[i] + "  ");
        }

        System.out.println("\n\n");
    }

    public void mergePaises(String a[], String b[], String res[]) {
        int i = 0, j = 0, k = 0; //obs: k é o índice para colocar valores no vetor resultante res[]

        //mistura (merge) inicial 
        while (i < a.length && j < b.length) {  //repetir até acabar de analisar um vetor
            if (a[i].compareToIgnoreCase(b[j]) <= 0) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        // copiamos os possíveis itens que ficaram em a[]:
        while (i < a.length) {
            res[k++] = a[i++];
        }

        // copiamos os possíveis itens que ficaram em b[]:
        while (j < b.length) {
            res[k++] = b[j++];
        }
    }

}
