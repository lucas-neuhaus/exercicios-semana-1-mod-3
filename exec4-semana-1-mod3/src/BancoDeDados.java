public class BancoDeDados {
    public void salvarNoBanco(Cliente cliente) {
        System.out.println("Salvando cliente no banco de dados:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Cliente salvo no banco de dados!");
    }
}
