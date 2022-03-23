package br.eti.freitas;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor Montetário");
        System.out.print("Informe o valor da doação: ");
        float valorDoacao = sc.nextFloat();

        System.out.print("Informe o valor da cotação: ");
        float valorCotacao = sc.nextFloat();

        float valorReais = valorDoacao * valorCotacao;

        System.out.println("Valor da cotação em R$ é de: " + valorReais );

        sc.close();

    }
}
