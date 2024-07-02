package SubSistema2;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
        super();
    }
    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Barueri";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
