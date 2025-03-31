package facadeImpl;

public class CrmService {
    
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        System.out.println("Clinte salvo no sistema de CRM...");
        
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}
