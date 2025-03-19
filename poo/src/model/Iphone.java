package model;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    String color;
    String imei;
    String model;

    public Iphone(String color, String imei, String model) {
        this.color = color;
        this.imei = imei;
        this.model = model;
    }

    // implements ReprodutorMusical

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA by iPhone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("SELECIONANDO MUSICA %s by iPhone\n", musica);
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA by iPhone");
    }

    // implements AparelhoTelefonico

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA by iPhone"); 
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ by iPhone");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("LIGANDO PARA %s by iPhone\n", numero);
    }

    // implements NavegadorInternet

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA by iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA by iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("EXIBINDO PAGINA %s by iPhone\n", url);
    }
    

    @Override
    public String toString() {
        return String.format("iPhone %s de cor %s e IMEI %s", model, color, imei);
    }
}
