package facadeImpl;

public class CepApi {
    
    private static CepApi instanceApi = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instanceApi;
    }

    public String getCity(String cep) {
        return "Recife";
    }

    public String getState(String cep) {
        return "Pernambuco-PE";
    }
}
