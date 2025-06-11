public abstract class Carro extends Veiculo implements OperacoesVeiculo{

    @Override
    void exibirDados() {

        this.marca = "FERRARI";
        this.modelo = "820T";
        this.placa = "32444-33";
        super.exibirDados();
        cadastro();

    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção em dia");
    }
}
