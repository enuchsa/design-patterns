package subsistema.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCLiente(String nome, String cep, String estado, String cidade) {
        System.out.println("cliente salvo no sistema de CRM.");
    }
}
