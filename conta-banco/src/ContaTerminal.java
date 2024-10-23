import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Váriaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Conhecer e importar a classe Scanner
        Scanner scn = new Scanner(System.in);
        
        //Exibir as mensagens para o nosso usuário

        //Obter pela classe scanner os  valores digitados no terminal
        System.out.print("Por favor, digite o número da conta: ");
        numero = scn.nextInt();

        scn.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scn.nextLine();

        System.out.print("Por favor, digite o nome do Titular: ");
        nomeCliente = scn.nextLine();

        
        System.out.print("Por favor, digite o valor do Saldo: ");
        saldo = scn.nextDouble();
        

        System.out.println("\n");
        //Exibir a mensagem conta criada
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
            nomeCliente,agencia, numero, saldo));


        scn.close();
    }
}
