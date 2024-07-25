package Modelo.Apple.Aplicativo;

/**
 * A interface AparelhoTelefonico define os métodos para controlar um aparelho telefônico.
 */
public interface AparelhoTelefonico {

    /**
     * Realiza uma ligação para o número fornecido.
     *
     * @param numero O número de telefone para o qual ligar.
     */
    public void ligar(String numero);

    /**
     * Atende uma chamada telefônica.
     */
    public void atender();

    /**
     * Inicia o correio de voz.
     */
    public void iniciarCorreioVoz();
}
