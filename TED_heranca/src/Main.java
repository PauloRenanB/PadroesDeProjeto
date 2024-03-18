import contas.ContaEspecial;
import contas.ContaInvestimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaEspecial contaEspecial = new ContaEspecial();
        ContaInvestimento contaInvestimento = new ContaInvestimento();

        System.out.println("Para conta especial digite 1. Para conta investimento digite 2.");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Digite o número da conta: ");
                contaEspecial.setNumero(sc.nextInt());

                System.out.println("Digite seu saldo: ");
                contaEspecial.setSaldo(sc.nextDouble());

                System.out.println("Digite 1 para depositar e 2 para sacar: ");
                int y = sc.nextInt();
                if (y == 1){
                    System.out.println("Digite o valor a depositar: ");
                    contaEspecial.depositar(sc.nextDouble());
                } else if (y == 2) {
                    System.out.println("Digite o valor a sacar: ");
                    contaEspecial.sacar(sc.nextDouble());
                }
                System.out.printf("Saldo: %d", contaEspecial.getSaldo());
                break;

            case 2:
                System.out.println("Digite o número da conta: ");
                contaInvestimento.setNumero(sc.nextInt());

                System.out.println("Digite seu saldo: ");
                contaInvestimento.setSaldo(sc.nextDouble());

                System.out.println("Digite 1 para depositar e 2 para sacar: ");
                int yy = sc.nextInt();
                if (yy == 1){
                    System.out.println("Digite o valor a depositar: ");
                    contaInvestimento.depositar(sc.nextDouble());
                } else if (yy == 2) {
                    System.out.println("Digite o valor a sacar: ");
                    contaInvestimento.sacar(sc.nextDouble());
                }
                System.out.println("Deseja aplicar rendimento? Digite 1 para sim: ");
                int rd = sc.nextInt();
                if (rd == 1){
                    System.out.println("Digite a quantidade de dias que deseja deixar seu dinheiro rendendo: ");
                    contaInvestimento.setPrazo(sc.nextInt());
                    contaInvestimento.aplicarRendimento();
                }

                System.out.printf("Saldo: %f%n", contaInvestimento.getSaldo());
                break;
        }
    }
}