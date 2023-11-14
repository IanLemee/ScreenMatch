package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificacao classificacao) {
        if (classificacao.getClassificacao() >= 9) {
            System.out.println("Esta entre os preferidos do momentos");
        } else if (classificacao.getClassificacao() >= 7.5) {
            System.out.println("Esta sendo muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
