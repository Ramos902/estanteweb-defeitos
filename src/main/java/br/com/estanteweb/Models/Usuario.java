package br.com.estanteweb.Models;

import java.util.Map;

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String senha;

    public Usuario() {
    }

    public static Usuario deMap(Map<String, Object> linha) {
        Usuario usuario = new Usuario();
        usuario.setId(((Number) linha.get("id")).longValue());
        usuario.setNome((String) linha.get("nome"));
        usuario.setEmail((String) linha.get("email"));
        usuario.setSenha((String) linha.get("senha"));
        return usuario;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
