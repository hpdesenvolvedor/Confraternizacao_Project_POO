package Confraternizacao.test;


import Confraternizacao.dominio.Confraternizacao;
import Confraternizacao.dominio.Funcionarios;
import Confraternizacao.dominio.Local;

public class ConfraternizacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Allianz Park");
        
        Funcionarios funcionarios = new Funcionarios("Yuri", 32, 'M');

        Funcionarios[] funcionariosArray = {funcionarios};

        Confraternizacao confraternizacao = new Confraternizacao("Confra 2025", funcionariosArray, local);

        confraternizacao.imprime();


    }
}
