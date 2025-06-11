public abstract class Veiculo {
    String placa;
    String marca;
    String modelo;

    void  exibirDados(){

    }

    void cadastro(){
        System.out.println("Veículo cadastrado com sucesso");
    }

     abstract void realizarManutencao();
}
