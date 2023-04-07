public class Livro {
    String titulo;
    String autor;
    String editora;
    int paginas;

    String exibirDetalhes(){
        return "INFORMAÇÕES DO LIVRO" + System.lineSeparator() + "Título: " + titulo + System.lineSeparator() + "Nome do autor: " + autor + System.lineSeparator() + "Nome da editora: " + editora + System.lineSeparator() + "Número de páginas: " + paginas;
    }
}