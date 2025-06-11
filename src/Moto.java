public abstract class Moto extends Veiculo implements OperacoesVeiculo {

    @Override
    void exibirDados() {

        this.marca = "YAMAHA";
        this.modelo = "FACTON";
        this.placa = "2333-22";
        super.exibirDados();
        cadastro();
    }
    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção pedente");
    }

}
