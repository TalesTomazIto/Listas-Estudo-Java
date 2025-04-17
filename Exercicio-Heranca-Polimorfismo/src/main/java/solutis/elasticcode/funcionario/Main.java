package solutis.elasticcode.funcionario;

import solutis.elasticcode.funcionario.comissoes.Comissao;
import solutis.elasticcode.funcionario.comissoes.ComissaoGerente;
import solutis.elasticcode.funcionario.comissoes.ComissaoSupervisor;
import solutis.elasticcode.funcionario.comissoes.ComissaoVendedor;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        ComissaoGerente comissaoGerente = new ComissaoGerente();
        ComissaoSupervisor comissaoSupervisor = new ComissaoSupervisor();
        ComissaoVendedor comissaoVendedor = new ComissaoVendedor();

        FuncionarioEnsinoMedio func1 = new FuncionarioEnsinoMedio(comissaoGerente);
        FuncionarioGraduado func2 = new FuncionarioGraduado(comissaoSupervisor);
        FuncionarioEnsinoBasico func3 = new FuncionarioEnsinoBasico(comissaoSupervisor);
        FuncionarioEnsinoMedio func4 = new FuncionarioEnsinoMedio(comissaoVendedor);
        FuncionarioEnsinoBasico func5 = new FuncionarioEnsinoBasico(comissaoVendedor);
        FuncionarioEnsinoBasico func6 = new FuncionarioEnsinoBasico(comissaoVendedor);
        FuncionarioEnsinoMedio func7 = new FuncionarioEnsinoMedio(comissaoVendedor);
        FuncionarioEnsinoBasico func8 = new FuncionarioEnsinoBasico(comissaoVendedor);
        FuncionarioEnsinoMedio func9 = new FuncionarioEnsinoMedio(comissaoVendedor);
        FuncionarioGraduado func10 = new FuncionarioGraduado(comissaoVendedor);

        funcionarios[0] = func1;
        funcionarios[1] = func2;
        funcionarios[2] = func3;
        funcionarios[3] = func4;
        funcionarios[4] = func5;
        funcionarios[5] = func6;
        funcionarios[6] = func7;
        funcionarios[7] = func8;
        funcionarios[8] = func9;
        funcionarios[9] = func10;

        Double total1 = 0.0;
        Double total2 = 0.0;
        Double total3 = 0.0;

        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] instanceof FuncionarioGraduado) {
                total1 += funcionarios[i].getRenda();
            } else if (funcionarios[i] instanceof  FuncionarioEnsinoMedio) {
                total2 += funcionarios[i].getRenda();
            } else if (funcionarios[i] instanceof FuncionarioEnsinoBasico) {
                total3 += funcionarios[i].getRenda();
            }
        }

        System.out.println("Os gastos com funcionarios com até ensino basico é: ");
        System.out.println(total1);
        System.out.println("Os gastos com funcionarios com até ensino médio é: ");
        System.out.println(total2);
        System.out.println("Os gastos com funcionarios com até ensino superior é: ");
        System.out.println(total3);
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].toString());
        }

    }
}
