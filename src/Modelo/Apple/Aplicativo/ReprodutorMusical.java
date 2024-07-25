package Modelo.Apple.Aplicativo;

/**
 * A interface ReprodutorMusical define os métodos para controlar um reprodutor de música.
 */
public interface ReprodutorMusical {

    /**
     * Toca uma música.
     */
    public void tocar();

    /**
     * Pausa a música atual.
     */
    public void pausar();

    /**
     * Seleciona uma música para tocar.
     *
     * @param musica O nome da música a ser tocada.
     */
    public void selecionarMusica(String musica);
}
