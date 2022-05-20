package dio.gft.bootcamp;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Thiago");

        InterfaceConta cc = new ContaCorrente(cliente1);
        InterfaceConta cp = new ContaPoupanca(cliente1);

        cc.depositar(100);
        cc.transferir(80, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
