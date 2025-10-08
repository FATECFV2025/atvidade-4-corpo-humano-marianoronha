package main.java;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner inicio = new Scanner(System.in);
 
        System.out.println("CRIAÇÃO DO OBJETO CORPO HUMANO:");
        System.out.print("Digite massa inicial (kg): ");
        Double massa = inicio.nextDouble();
 
        System.out.print("Digite o volume inicial (m³): ");
        Double volume = inicio.nextDouble();
 
        System.out.print("Digite a densidade inicial (kg/m³): ");
        Double densidade = inicio.nextDouble();
 
        System.out.print("Digite a altura inicial (m): ");
        Double altura = inicio.nextDouble();
 
        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);
 
        System.out.println("VALORES INICIAIS: ");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("IMC: " + c1.calcularIMC());
 
        System.out.print("Digite uma nova massa (kg): ");
        c1.setMassa(inicio.nextDouble());
 
        System.out.print("Digite uma nova altura (m): ");
        c1.setAltura(inicio.nextDouble());
 
        System.out.println("NOVOS VALORES");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.calcularIMC());
 
 
//Respostas das perguntas:

// 1- Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1.
//Qual foi a ocorrência?
//Qual a conclusão sobre o que aconteceu?
//RESPOSTA: Quando tentei fazer c1.massa = "2"; ocorreu erro de compilação: "massa has private access in CorpoHumano". 
//CONCLUSÃO: porque o atributo 'massa' é privado e não pode ser acessado diretamente.
 
//2- Na classe Corpo_Humano altere a linha private float Massa para public float Massa;
//Qual foi a ocorrência?
//Qual a conclusão sobre o que aconteceu?
//RESPOSTA: o erro desapareceu, pois código compila e permite alterar o valor diretamente.
//CONCLUSÃO: atributos públicos podem ser acessados fora da classe, mas isso quebra o encapsulamento, então torna o código menos seguro.
 
//3- Na classe Corpo_Humano altere a linha public setVolume(float volume) para private setVolume(float volume)
//Qual foi a ocorrência?
//Qual a conclusão sobre o que aconteceu?
//RESPOSTAS: o método setVolume() deixou de ser acessível pela classe Main, o que gerou um erro de acesso, pois o método é privado.
//CONCLUSÃO: métodos privados só podem ser utilizados dentro da própria classe, impedindo sua chamada de forma externa e reforçando o encapsulamento.
    }
}