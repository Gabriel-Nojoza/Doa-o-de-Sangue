package TRABALHO;

import java.util.*;

public class aps {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade, local, dia, hora;
        String nome;
        double peso;

        // solicitar informações do paciente

        System.out.println("Bem-Vindo ao programa de doação de sangue");
        System.out.println("Muito importante a doação de sangue para ajudar outras vidas");
        System.out.println("Informe seu nome?");
        nome = leia.nextLine();
        System.out.println("Informe sua idade?");
        idade = leia.nextInt();
        System.out.println("Informe seu peso?");
        peso = leia.nextDouble();
        System.out.println(
                "Informe o local de doação que você deseja ir (1 - Hemoce, 2 - Posto de coleta Dr.José Frota)");
        local = leia.nextInt();

        // Verificar se é elegivel para doar sangue

        boolean elegivel = false;
        if (idade >= 16 && idade <= 60 && peso >= 50 && peso <= 80) {
            elegivel = true;
        } else {
            System.out.println("Você não pode doar sangue");
        }
        // Infomar sobre a elegibilidade e o local de doação

        if (elegivel) {
            System.out.println("Você é elegivel para doar sangue");
            System.out.println("Escolha seu local de doação");

            switch (local) {
                case 1:
                    System.out.println("Hemoce");
                    break;
                case 2:
                    System.out.println("Dr.José Frota");
                    break;

                default:
                    System.out.println("Esse é seu local de doação");
                    break;
            }
        }
        // Informe os dias da semana disponiveis para doar sangue

        System.out.println("Informe os dias disponiveis?");
        System.out.println("1 - Segunda-feira");
        System.out.println("2 - Quarta-feira");
        System.out.println("3 - Sexta-feira");
        dia = leia.nextInt();

        switch (local) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Quarta-feira");
                break;
            case 3:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Não tem disponivel esse dia");
                break;

        }

        // informe os horarios disponiveis para doar sangue

        System.out.println("Informe os horarios disponiveis");
        System.out.println("1 - 8h");
        System.out.println("2 - 10h");
        System.out.println("3 - 12h");
        System.out.println("4 - 14h");
        System.out.println("5 - 16h");
        hora = leia.nextInt();

        switch (hora) {
            case 1:
                System.out.println("1 - 8h");
                break;
            case 2:
                System.out.println("2 - 10h");
                break;
            case 3:
                System.out.println("3 - 12h");
                break;
            case 4:
                System.out.println("4 - 14h");
                break;
            case 5:
                System.out.println("5 - 16h");
                break;

            default:
                System.out.println("Horario indisponivel");
                break;
        }

        // Como funciona o passo a passo da doação de sangue

        System.out.println(
                "1 - Encontre um local de doação: Pesquise os locais de doação de sangue na sua área, como bancos de sangue, hospitais ou centros de doação móvel.");
        System.out.println(
                "2 - Pré-Triagem: Nesta etapa, são checados sinais vitais, como pressão arterial, pulso, temperatura corporal e medidos o peso e a altura do candidato à doação. É realizado também um teste para verificar se a pessoa tem anemia.");
        System.out.println(
                "3 - Coleta de sangue: Esta etapa da doação leva, em média, 15 minutos. O volume de sangue retirado depende de cálculo baseado no peso e altura corporal e não faz falta ao organismo. Todo o material utilizado é individual e descartado após o uso.");
        System.out.println("4 - Lanche: Após a doação, o doador recebe um lanche e fica um tempo no hemocentro.");

        System.out.println("Obrigado, pela atenção!");

    }

}
