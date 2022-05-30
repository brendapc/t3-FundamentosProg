import java.util.Scanner;

/**
 * Escreva uma descrição da classe Menu aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Menu
{
    
    public static void main(String args[]){
        Boolean programaRodando = true;
        Cadastro cadastro = new Cadastro();
        
        while(programaRodando){        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção. \n 1.Cadastrar novo funcionário \n 2.Listar todos os funcionários \n 3. Remover um funcionário pelo CPF \n 4.Editar o salário de um funcionário pelo CPF \n 5.Imprimir funcionário com maior salário \n 6. Imprimir percentual de funcionários que tem filhos \n 7. Sair do programa");
        int opcao = sc.nextInt();
        if(opcao == 1){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o CPF do funcionário: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite o valor/hora do funcionário: ");
            int valorHora = scanner.nextInt();
            System.out.println("Digite a carga horária do funcionário: ");
            int cargaHoraria = scanner.nextInt(); 
            System.out.println("Digite true se o funcionário tem filhos e false se não: ");
            Boolean filhos = scanner.nextBoolean();
            Funcionario[] result = cadastro.InserirUsuario(nome, cpf, valorHora, cargaHoraria, filhos);
             for (int i = 0; i < result.length; i++) {
                Funcionario current = result[i];
                System.out.println("- Nome: " + current.nome + ", cpf: " + current.cpf + ", valor hora: " + current.valorHora + ", carga horária: " + current.cargaHoraria + ", tem filhos: " + current.filhos);
            }
        }
        
        if(opcao == 2){
            cadastro.ListarUsuarios();
        }
        
        if(opcao == 3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o cpf do funcionário: ");
            String cpf = scanner.nextLine();
            System.out.print(cpf);
            System.out.print(cpf.toString());
            cadastro.removerUsuario(cpf);
        }
        
        if(opcao == 4){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o cpf do funcionário: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite o novo salário funcionário: ");
            double novoSalario = scanner.nextDouble();
            cadastro.EditarSalario(cpf, novoSalario);
        }
        
        if(opcao == 5){
            cadastro.getMaiorSalario();
        }
        
        if(opcao == 6){
            cadastro.percentualComFilhos();
        }
        
        if(opcao == 7){
            programaRodando = false;
        }
    }
    }
}
