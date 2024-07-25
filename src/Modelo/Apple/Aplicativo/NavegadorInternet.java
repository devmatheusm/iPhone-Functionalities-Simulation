package Modelo.Apple.Aplicativo;

/**
 * A interface NavegadorInternet define os métodos para controlar um navegador de internet.
 */
public interface NavegadorInternet {

    /**
     * Exibe uma página da web no navegador.
     *
     * @param url O URL da página da web a ser exibida.
     */
    public void exibirPagina(String url);

    /**
     * Adiciona uma nova aba no navegador.
     */
    public void adicionarNovaAba();

    /**
     * Atualiza a página atual no navegador.
     */
    public void atualizarPagina();
}
