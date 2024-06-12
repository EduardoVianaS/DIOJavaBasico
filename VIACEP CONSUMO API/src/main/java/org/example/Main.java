package org.example;
import java.util.Scanner;
import org.example.servico.ServiceAPI;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServiceAPI serviceAPI = new ServiceAPI();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu cep: ");
        String cep = scanner.nextLine();
        try{
            System.out.println(serviceAPI.getEndereco(cep));
        }catch(IOException e){
            throw new RuntimeException(e);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}