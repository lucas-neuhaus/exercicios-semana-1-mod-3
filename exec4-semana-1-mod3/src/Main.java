
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 25, "joao@example.com");

        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
        enviadorDeEmail.enviarEmail(cliente.getEmail(), "Olá, tudo bem?");

        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.salvarNoBanco(cliente);

        VerificadorDeIdade verificadorDeIdade = new VerificadorDeIdade();
        if (verificadorDeIdade.isMaiorDeIdade(cliente.getIdade())) {
            System.out.println("O cliente é maior de idade.");
        } else {
            System.out.println("O cliente é menor de idade.");
        }
    }
}