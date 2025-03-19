import model.Iphone;

public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone("Preto", "10029", "16 PRO MAX");

        System.out.println("Utilizando iPhone");
        System.out.println(iphone.toString());

        System.out.println("----------------------");

        iphone.selecionarMusica("NEXT TO ME");
        iphone.tocar();
        iphone.pausar();

        System.out.println("----------------------");

        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://google.com");
        iphone.atualizarPagina();

        System.out.println("----------------------");

        iphone.ligar("1198188");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
