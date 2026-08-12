public class Aluno {
    public static double somanotas = 0;
    public static int quantidadeAlunos = 0;
    String nome;
    double nota;



    public Aluno(String nome,double nota){
        String Nome = nome;
        double Nota = nota;

        quantidadeAlunos++;
        somanotas = somanotas + nota;

    }
    public static double mediaDaTurma(){
     return somanotas/quantidadeAlunos;
    }
}
