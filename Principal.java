import java.util.Scanner;

public class Principal{
    static Scanner doido = new Scanner(System.in);
    static int opcao;
    static String[][] tarefas = new String[3][4];
    public static void main(String[] args){

        for(int i = 0; i < tarefas.length; i++){
            for(int j = 0; j < tarefas[i].length; j++){
                tarefas[i][j] = "DISPONÍVEL";
            } 
        }

        do{
            exibirCabecalho(); // <== METODO COMPARTILHADO (ponto de conflito)
            exibirMenu();
            opcao = doido.nextInt();

            switch (opcao){
                case 1:
                    cadastrarTarefa();
                    break;
                case 2:
                    listarTarefas();
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
        System.out.println("2 - Listar Tarefas");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");
    }

    public static void cadastrarTarefa() {
        System.out.println("==CADASTRAR TAREFA==");
        System.out.print("Digite uma coluna de 1 a 5: ");
        int coluna = doido.nextInt();
        doido.nextLine();

        if (coluna >= 1 && coluna <= tarefas.length){
            coluna--;
            if (tarefas[coluna][0].equals("DISPONÍVEL")){
                System.out.print("Digite sua tarefa: ");
                tarefas[coluna][0] = doido.nextLine();
                System.out.println("Tarefa adicionada!");
            }
            else{
                System.out.println("Posição ocupada!");
            }
        }
        else{
            System.out.println("Coluna inválida!");
        }
    }

    public static void listarTarefas(){
        System.out.println("==LISTA DE TAREFAS==");
        for (int i = 0; i < tarefas.length; i++) {
            System.out.print((i+1) + " - ");
            for (int j = 0; j < tarefas[i].length; j++) {
                System.out.print(tarefas[i][j] + " ");
            }
            System.out.println();
        }
    }
}