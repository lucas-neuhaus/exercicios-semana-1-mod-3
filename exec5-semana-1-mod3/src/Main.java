
    public class Main {
        public static void main(String[] args) {
            Cliente cliente = new Cliente("João", 25, "joao@example.com", "Rua A", "123456789", "12345678901",
                    "Engenheiro", "Solteiro", "Brasileiro", "Av. B");
            boolean clienteValido = cliente.validarCliente();

            if (clienteValido) {
                System.out.println("Cliente válido.");
            } else {
                System.out.println("Cliente inválido.");
            }
        }
    }