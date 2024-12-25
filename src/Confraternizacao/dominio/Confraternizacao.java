package Confraternizacao.dominio;

public class Confraternizacao {
    private String nome;
    private Funcionarios[] funcionarios;
    private Local local;

    public Confraternizacao(String nome, Funcionarios[] funcionarios, Local local) {
        this.nome = nome;
        this.funcionarios = funcionarios;
        this.local = local;
    }

    public void imprime(){
        System.out.println("Nome da Confraternização: " + this.nome);

        if(funcionarios == null)return;
        System.out.println("### Funcionarios ###");
        for(Funcionarios funcionario : funcionarios){
            System.out.println("Aluno: " + funcionario.getNome() +  " Idade: " + funcionario.getIdade() + " Sexo: " + funcionario.getSexo());
            System.out.println("Local do Evento: " + local.getEndereco());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}