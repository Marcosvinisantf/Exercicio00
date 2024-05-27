import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Exercicio 01 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, esse programa ira ler os valores A, B, e C e em seguida imprimir na tela a soma entre A e B e mostrar se a soma é menor ou maior do que C.\nPrimeiro digite o valor que representara o número A: ");
        int a = sc.nextInt();
        System.out.println("Muito bem, agora digite o valor que vai representar o número B: ");
        int b = sc.nextInt();
        System.out.println("Agora preciso que digie o valor que vai representar o número C: ");
        int c = sc.nextInt();
        int operacao = a + b;
        if (operacao < c) {
            System.out.println("A soma de A + B é MENOR do que o valor C");
        } else if (operacao == c) {
            System.out.println("A soma de A + B é IGUAL ao valor C");
        } else
            System.out.println("A soma de A + B é MAIOR do que o valor C");
        sc.close();
    }
}
