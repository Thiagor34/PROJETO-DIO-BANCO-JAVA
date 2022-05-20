package dio.gft.bootcamp;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta Corrente ===");
        super.imprimirDadosComuns();
    }

}
