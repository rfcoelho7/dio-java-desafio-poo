import Equipamento.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        // Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Black Sabbath > 13 > End of Beginning");
        // Aparelho Telefonico
        iphone.ligar("+55 (19) 99999-4444");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        // Navegador Internet
        iphone.exibirPagina("https://google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
