package br.com.estanteweb.Models;

import java.util.Map;

public class Sugestao {

    private Long id;
    private String nomeCliente;
    private String livroSugerido;

    public Sugestao() {
    }

    public static Sugestao deMap(Map<String, Object> linha) {
        Sugestao sugestao = new Sugestao();
        sugestao.setId(((Number) linha.get("id")).longValue());
        sugestao.setNomeCliente((String) linha.get("nome_cliente"));
        sugestao.setLivroSugerido((String) linha.get("livro_sugerido"));
        return sugestao;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public String getLivroSugerido() { return livroSugerido; }
    public void setLivroSugerido(String livroSugerido) { this.livroSugerido = livroSugerido; }
}
