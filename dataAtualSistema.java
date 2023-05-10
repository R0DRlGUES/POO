package com.mycompany.funcionario;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dataAtualSistema {

    public Date dataNascimento;
    public int idade;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("data");
        String inputData = scanner.nextLine();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate data = LocalDate.parse(inputData, formatoData);
            System.out.println("Data digita" + data);
        } catch (Exception e) {
            System.out.println("Formato de data");

        }
        scanner.close();

    }

}
