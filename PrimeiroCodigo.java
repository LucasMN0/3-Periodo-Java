package testes;
import java.util.Scanner;
public class Testando{ 
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.printf("Por favor, informe a quantidade de alunos: ");
        int tam = sc.nextInt();
        sc.nextLine();
        System.out.printf("Olá, sejam bem vindo de volta as aulas, estavamos ansiosos com a sua volta!!!\n");
        String peste[] = new String[tam];
        for(int i=0;i<tam;++i){
            System.out.print("Por favor, me informe o seu nome: ");
            peste[i] = sc.nextLine();
            int matricula = i*2 + i*i;
            System.out.printf("Bem-vindo à escola! Você está matriculado, sua matricula é: "+ matricula + "!\n");
        }
        float media[] = new float[tam];
        float mediaGeral = 0;
        for(int i=0;i<tam;++i){
            media[i] = CalcularNota(sc,peste[i]);
        }
        for (int i=0;i<tam;++i){
            System.out.printf("\nA média de %s é: %.2f\n\n",peste[i],media[i]);
        int Classificação = status(media[i]);
        if(Classificação == 1){
            System.out.printf("O aluno foi Aprovado!\n");
        } else if(Classificação == 2){
            System.out.printf("O aluno está na Final!\n");
        } else{
            System.out.printf("O aluno foi Reprovado!\n");
        }
        mediaGeral = mediaGeral + media[i];
        }
        mediaGeral = mediaGeral/tam;
            System.out.printf("A média geral dos alunos foi de %f\n",mediaGeral);
    
    
        sc.close();
    }
    public static float CalcularNota(Scanner sc, String peste){
        float soma=0;
        int Resposta = 1;
        int i=1;
        while(Resposta == 1){
            System.out.printf("\nPor favor, insira a %dº nota de %s: ",i,peste);
            float nota =sc.nextInt();
            soma = soma + nota;
            System.out.printf("Deseja continuar ? (Responda com 1 para prosseguir): ");
            Resposta = sc.nextInt();
            ++i;
        }
        i = i-1;
        float media = soma/i;
        return media;
    }
    public static int status(float media){
        if(media>=7){
            return 1; 
        } else if(media>5){
            return 2;
        } else{
            return 3;
        }
    }
}
