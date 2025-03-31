package facade;

import facadeImpl.CepApi;
import facadeImpl.CrmService;

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
        CepApi api = CepApi.getInstance();
        String cidade = api.getCity(cep);
        String estado = api.getState(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
