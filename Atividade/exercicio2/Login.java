package exercicio2;

public class Login {
    private String usuario;
    private String senha;

    public Login(String _usuario, String _senha) {
        this.usuario = _usuario;
        this.senha = _senha;
    }

    public void setSenha(String _senha) {
        this.senha = _senha;
    }

    public boolean fazerLogin(String _usuario, String _senha) {
        try {
            if (!this.usuario.equals(_usuario)) {
                throw new Exception("Usuário incorreto!");
            }
            if (!this.senha.equals(_senha)) {
                throw new Exception("Senha incorreta!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
