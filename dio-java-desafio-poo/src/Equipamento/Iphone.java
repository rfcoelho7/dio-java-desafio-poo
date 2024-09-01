package Equipamento;
import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutosMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutosMusical{
    public void tocar() {
        System.out.println("Tocando música");
    }
    public void pausar() {
        System.out.println("Pausando música");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " foi selecionada para ser tocada");
    }
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    public void atender() {
        System.out.println("Atendendo telefone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void exibirPagina(String url) {
        System.out.println("Carregando página " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
