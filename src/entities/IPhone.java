package entities;

public class IPhone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação...");
    }

    @Override
    public void iniciarCorreioDeVoz(String numero) {
        System.out.println("iniciando correio de voz para: " + numero + "...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("exibindo pagina: " + url + "...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrindo nova aba...");
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("atualizando pagina: " + url + "...");
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("pausando musica...");
    }

    @Override
    public void selecionarMusica(String nomeDaMusica) {
        System.out.println("selecionando musica...");
    }
}
