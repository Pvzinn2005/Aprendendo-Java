package exercicio2;

public class Main {
    public static void main(String[] args) {
        // Cria um novo objeto Login
        Login login = new Login("usuario", "senha");

        // Tenta fazer login com as credenciais corretas
        boolean sucesso = login.fazerLogin("usuario", "senha");
        System.out.println("Login bem-sucedido: " + sucesso);

        // Tenta fazer login com credenciais incorretas
        sucesso = login.fazerLogin("usuario_errado", "senha_errada");
        System.out.println("Login bem-sucedido: " + sucesso);
    }
}
