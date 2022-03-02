package banco.src;

public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Cliente cleiton = new Cliente();
        cleiton.setNome("Cleiton");

        Conta cc = new ContaCorrente(lucas);
        Conta poupanca = new ContaPoupanca(lucas);

        Conta ccCleiton = new ContaCorrente(cleiton);
        Conta poupancaCleiton = new ContaPoupanca(cleiton);

        cc.depositar(100);
        cc.sacar(50);

        cc.imprimirExtrato();

        poupanca.depositar(150);
        poupanca.imprimirExtrato();

        poupancaCleiton.imprimirExtrato();
        poupanca.transferir(70, poupancaCleiton);
        poupancaCleiton.imprimirExtrato();


    }
}
