/*Crie uma classe chamada "Livro" com os seguintes atributos públicos:
título, autor, editora e número de páginas. Crie um método chamado "exibirDetalhes"
que imprima todas as informações do livro.*/
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.paginas = 395;
        livro1.autor = "Machado de Assis";
        livro1.editora = "Companhia das letras";
        livro1.titulo = "Dom Cascmurro";

        String detalhes = livro1.exibirDetalhes();
        System.out.println(detalhes);

    }
}