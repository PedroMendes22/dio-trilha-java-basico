package ColecoesSingularesSET;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t---");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia",60));
            add(new Serie("tom", "comedia",50));
            add(new Serie("hello", "investigacao",40));
        }};
        for(Serie serie: minhasSeries) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Insercao\t---");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("au", "fantasia",60));
            add(new Serie("friends", "comedia",50));
            add(new Serie("national", "investigacao",40));
        }};
        for(Serie serie: minhasSeries2) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Natural(tempo episodio)\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
        for(Serie serie: minhasSeries3) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
   
        System.out.println("--\tOrdem nome/cor/idade\t---");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie: minhasSeries3) System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
   
    }
}




class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome,genero,tempoEpisodio);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }


    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio!=0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }

}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie, Serie serie2) {
        int nome = serie.getNome().compareTo(serie2.getNome());
        if(nome!=0) return nome;

        int genero = serie.getGenero().compareTo(serie2.getGenero());
        if(genero!=0) return genero;

        return Integer.compare(serie.getTempoEpisodio(), serie2.getTempoEpisodio());
    }

}