import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.printf("-----CRUD-----\n");
        System.out.println("1-Cadastrar veículo");
        System.out.println("2-Listar todos os veículos");
        System.out.println("3-Editar Veiculos");
        System.out.println("4-Remover Veiculos");
        System.out.println("5-Realizar Manutenção");
        System.out.println("6-Sair");
        System.out.printf("--------------------");
        System.out.printf("\nDigite alguma opção: ");
        int op = scanner.nextInt();
        switch (op){
            case 1 ->{
                try (FileWriter arquivo = new FileWriter("CRUD.txt",true)){

                    System.out.println("1-Carro");
                    System.out.println("2-Moto");
                    int opC = scanner.nextInt();
                    String temp =" ";


                    if (opC == 1){
                        Veiculo carro = new Carro() {
                        }
                        System.out.println("Informe a marca: ");

                    }else
                    String temp =" ";




                }catch (IOException erro){
                    System.out.println("Erro" + erro.getMessage());
                }

            }
            case 2->{

            }
            case 3->{

            }
            case 4->{

            }
            case 5->{

            }
            case 6 -> {
                break;
            }
            default -> System.out.printf("Numero digitado Invalido");

        }

    }
}