package solutis.elasticcode;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor =
                new Fornecedor(
                        "111.111.111.11",
                        "Carlos Alberto",
                        "Paulista",
                        "+55 11 9 2222-2222",
                        LocalDate.of(2002, 02, 02),
                        3500.00,
                        1675.00);

        System.out.println(fornecedor.obterSaldo());

        Empregado empregado = new Empregado(
                "1213123122",
                "raul",
                "barueras",
                "12332123",
                LocalDate.now(),
                5,
                10000.00,
                5.0
        );

        System.out.println(empregado.calcularSalario());

        Administrador administrador = new Administrador(
                "1213123122",
                "raul",
                "barueras",
                "12332123",
                LocalDate.now(),
                5,
                10000.00,
                5.0,
                1300.00
        );

        System.out.println(administrador.calcularSalario());

        Operario operario = new Operario(
                "1213123122",
                "raul",
                "barueras",
                "12332123",
                LocalDate.now(),
                5,
                10000.00,
                5.0,
                1300.00,
                8.0
        );

        System.out.println(operario.calcularSalario());

        Vendedor vendedor = new Vendedor(
                "1213123122",
                "raul",
                "barueras",
                "12332123",
                LocalDate.now(),
                5,
                10000.00,
                5.0,
                2000.00,
                50.0
        );

        System.out.println(vendedor.calcularSalario());
    }
}