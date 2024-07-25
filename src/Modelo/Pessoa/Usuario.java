package Modelo.Pessoa;

import Modelo.Apple.iPhone;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        iPhone iphone = new iPhone();

        int opc;

        do{

            System.out.println("---TELEFONE---\n1-Ligar\n2-Atender\n3-Correio de Voz" +
                    "\n---NAVEGADOR---\n4-Exibir Pagina Web\n5-Adicionar Nova Aba\n6-Atualizar Pagina" +
                    "\n---MUSICA---\n7-Play\n8-Pausar\n9-Selecionar Musica");
            opc = teclado.nextInt();
            teclado.next();

            switch (opc){
                case 1:
                    System.out.println("Digite um numero de telefone");
                    iphone.ligar(teclado.nextLine());
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    System.out.println("Digite um url de um website");
                    iphone.exibirPagina(teclado.nextLine());
                    break;
                case 5:
                    iphone.adicionarNovaAba();
                    break;
                case 6:
                    iphone.atualizarPagina();
                    break;
                case 7:
                    iphone.tocar();
                    break;
                case 8:
                    iphone.pausar();
                    break;
                case 9:
                    System.out.println("Digite uma musica");
                    iphone.selecionarMusica(teclado.nextLine());
                    break;
                default:
                    System.out.println("desligando telefone...");
                    break;
            }

            if (opc < 1 || opc > 9) {
                break;
            }
        }while(true);
    }
}
