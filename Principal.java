import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner doido = new Scanner(System.in);
        int opcao;

        do{
            exibirCabecalho(); // <== METODO COMPARTILHADO (ponto de conflito)
            exibirMenu();
            opcao = doido.nextInt();

            switch (opcao){
                case 1:
                    cadastrarTarefa();
                    break;
                case 2:
                    /* funcionalidade do Desenvolvedor B */
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        doido.close();
    }

    public static void exibirCabecalho() {
        System.out.println("============================");
        System.out.println("      LISTA DE TAREFAS      ");
        System.out.println("============================");
    }

    public static void exibirMenu() {
        System.out.println("1 - Cadastrar Tarefa");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");
    }

    public static void cadastrarTarefa() {
        System.out.println("Teste Cadastro");
    }
}