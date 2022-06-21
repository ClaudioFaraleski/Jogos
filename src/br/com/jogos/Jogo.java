package br.com.jogos;

public class Jogo {

    Integer pontuacao;
    String jogador;
    @Override
    public String toString() {
        return "Jogo{" +
                "pontuacao=" + pontuacao +
                ", jogador='" + jogador + '\'' +
                '}';
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public Jogo(Integer pontuacao, String jogador) {
        this.pontuacao = pontuacao;
        this.jogador = jogador;
    }

    public void  Imprimir(){

        System.out.printf("Jogador Atual \n:"+getJogador());
        System.out.printf("Pontuacao atual \n:"+getPontuacao().toString());


    }


    public void jogando(){

        System.out.printf("esta Jogando \n:"+getJogador());
    }




}