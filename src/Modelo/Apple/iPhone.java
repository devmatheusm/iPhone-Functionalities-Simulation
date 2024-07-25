package Modelo.Apple;

import Modelo.Apple.Aplicativo.AparelhoTelefonico;
import Modelo.Apple.Aplicativo.NavegadorInternet;
import Modelo.Apple.Aplicativo.ReprodutorMusical;

/**
 * A classe iPhone implementa as interfaces AparelhoTelefonico, NavegadorInternet e ReprodutorMusical,
 * fornecendo funcionalidades para um dispositivo iPhone.
 */
public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    /**
     * Realiza uma ligação para o número fornecido.
     *
     * @param numero O número de telefone para o qual ligar.
     */
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }

    /**
     * Atende uma chamada telefônica.
     */
    @Override
    public void atender(){
        System.out.println("Atendendo Ligação");
    }

    /**
     * Inicia o correio de voz.
     */
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de Voz");
    }

    /**
     * Exibe uma página da web no navegador.
     *
     * @param url O URL da página da web a ser exibida.
     */
    @Override
    public void exibirPagina(String url) {
        System.out.println("Entrando na pagina: " + url);
    }

    /**
     * Adiciona uma nova aba no navegador.
     */
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }

    /**
     * Atualiza a página atual no navegador.
     */
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    /**
     * Toca uma música.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando a Musica");
    }

    /**
     * Pausa a música atual.
     */
    @Override
    public void pausar() {
        System.out.println("Pausando a Musica");
    }

    /**
     * Seleciona uma música para tocar.
     *
     * @param musica O nome da música a ser tocada.
     */
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a musica " + musica);
    }
}
