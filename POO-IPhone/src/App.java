
public class App {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Reprodutor Musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Aparelho Telefônico
        iphone.ligar("11999998888");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador na Internet
        iphone.exibirPagina("https://apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
