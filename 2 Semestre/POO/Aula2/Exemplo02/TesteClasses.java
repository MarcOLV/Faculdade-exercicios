import java.util.Scanner;

public class TesteClasses {
    public static void main(String[] args) {
        //variáveis auxiliares
        int d, m, a;
        float h, b, area;

        //declaração dos objetos
        Data hoje;
        Triangulo t;

        //declara e instancia o objeto usado na obtenção de informação
        Scanner leia = new Scanner(System.in);

        //leitura de dados
        System.out.println("Digite o dia: ");
        d = leia.nextInt();
        System.out.println("Digite o mes: ");
        m = leia.nextInt();
        System.out.println("Digite o ano: ");
        a = leia.nextInt();

        //dados do Triangulo
        System.out.println("Digite a base");
        b = leia.nextFloat();
        System.out.println("Digite a altura");
        h = leia.nextFloat();

        //instanciar objeto com contrutor com parâmetros, com valores digitados pelo usuário
        hoje = new Data(d, m, a);

        t = new Triangulo(b, h);
        area = t.base*t.altura/2;

        //mostrando dados
        System.out.println(hoje.dia + "/" + hoje.mes + "/" + hoje.ano);
        System.out.println("Base: " + t.base + "\nAltura:" + t.altura + "\nÁrea: " + area);

    }
}
