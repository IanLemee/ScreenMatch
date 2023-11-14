import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Psycho");
        meuFilme.setAnoDeLancamento(1960);
        meuFilme.setDuracaoEmMinutos(109);
        System.out.println("Duracao do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(9);
        System.out.println("Total de avaliacoes " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(12);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar: " + lost.getNome() + " " + lost.getDuracaoEmMinutos());

        Filme meuSegundoFilme = new Filme();
        meuSegundoFilme.setNome("Whiplash");
        meuSegundoFilme.setAnoDeLancamento(2014);
        meuSegundoFilme.setDuracaoEmMinutos(106);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(meuSegundoFilme);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);
    }
}
