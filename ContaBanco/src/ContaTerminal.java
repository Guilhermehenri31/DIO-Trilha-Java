import java.util.Scanner;

public class ContaTerminal {
    static Scanner novo = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

    System.out.println("Por favor, Digite o número da conta!");
       int conta = novo.nextInt();
    System.out.println("Digite o número da Agência: ");
       int Agencia = novo.nextInt();
    System.out.println("Digite nome do cliente: ");
        String Nome_Cliente = novo.next();
    System.out.println("Digite o saldo: ");
        Float Saldo = novo.nextFloat(); 

    System.out.println("Olá " + Nome_Cliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", Conta " + conta + "e seu saldo de " + Saldo + "Reais já está disponível em sua conta. Obrigado por fazer parte do nosso banco!");

       

    
    }
}