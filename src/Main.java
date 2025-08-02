import entities.IPhone;

public class Main {

    public static void main(String[] args) {

        // Making use of our iPhone entity
        IPhone phone = new IPhone();

        // AparelhoTelefonico Interface
        phone.ligar("558199999999");
        phone.atender();
        phone.iniciarCorreioDeVoz("558199999999");

        // NavegadorDeInternet Interface
        phone.exibirPagina("gilbertosilva.dev.br");
        phone.adicionarNovaAba();
        phone.atualizarPagina("gilbertosilva.dev.br");

        //ReprodutorMusical Interface
        phone.selecionarMusica("Beat It - Michael Jackson");
        phone.pausar();
        phone.tocar();

    }

}
