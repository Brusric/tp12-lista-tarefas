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
                    /* funcionalidade do Desenvolvedor A */
                    break;
                case 3:
                    /* funcionalidade do Desenvolvedor A */
                    break;
                case 4:
                    filtrarPorPrioridade();
                    break;
                case 5:
                filtrarPorSituacao();
                break;
                case 6:
                exibirEstatisticas();
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
        System.out.println("4 - Filtrar por Prioridade");
        System.out.println("5 - Filtrar por Situação");
        System.out.println("6 - Exibir Estatísticas");

        System.out.println("Escolha: ");
    }

    public static void cadastrarTarefa() {
        System.out.println("Teste Cadastro");
    }

    public static void filtrarPorPrioridade() {
        System.out.println("Teste Prioridade");
    }

    public static void filtrarPorSituacao() {
        System.out.println("Teste Situação");
    }

    public static void exibirEstatisticas() {
        System.out.println("Teste Estatísticas");
    }
}