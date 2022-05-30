import java.util.Arrays;
import java.util.stream.Stream;

public class Cadastro
{
    Funcionario[] bd = {new Funcionario("Maria", "100.111.111-99", 20, 40, false), new Funcionario("João", "200.111.111-99", 10, 40, false), new Funcionario("Pedro", "300.111.111-99", 15, 40, false), new Funcionario("Bruno", "400.111.111-99", 30, 44, true), new Funcionario("Michael", "500.111.111-99", 10, 40, false)};

     public static int findIndex(Funcionario[] arr, String cpfProcurado)
    {
       int len = arr.length;
        int i = 0;
 
        while (i < len) {
            if (arr[i].cpf.equals(cpfProcurado)) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }        

    public Funcionario[] InserirUsuario(String nome, String cpf, double valorHora, double cargaHoraria, Boolean filhos){
        Funcionario newFuncionario = new Funcionario(nome, cpf, valorHora, cargaHoraria, filhos);
        
        Funcionario[] array = Arrays.copyOf(bd, bd.length + 1);
        array[array.length - 1] = newFuncionario;
        bd = array;
        System.out.println("Funcionário " + nome + " adicionado. ");
        return bd;
    }
    
    public void ListarUsuarios(){
        for (int i = 0; i < bd.length; i++) {
            Funcionario current = bd[i];
            System.out.println("- Nome: " + current.nome + ", cpf: " + current.cpf + ", valor hora: " + current.valorHora + ", carga horária: " + current.cargaHoraria + ", tem filhos: " + current.filhos);
        }
    }
    
    public void removerUsuario(String cpfProcurado){
        int index = findIndex(bd, cpfProcurado);
        if(index >= 0){
            System.out.print("Usuário "+ bd[index].nome +" removido \n");
            for (int i = index; i < bd.length - 1; i++) {
                bd[i] = bd[i + 1];
            }
            bd = Arrays.copyOf(bd, bd.length - 1);
        }else{
            System.out.print("Nenhum funcionário encontrado com este cpf.\n");
        }
        
    }
    
   public void EditarSalario (String cpfProcurado, double novoSalario) {
        int index = findIndex(bd, cpfProcurado);
        if(index > 0){
            bd[index].setSalario(novoSalario);
            System.out.print("Salário de: " + bd[index].nome + " alterado. \n");
        }
    }
   
    public static int findIndexOfMaiorSalario(Funcionario[] arr)
    {
        int len = arr.length;
        int i = 0;
        int BiggestSalario = 0;
 
        while (i < len) {
            if (arr[i].salario > arr[BiggestSalario].salario) {
                BiggestSalario = i;
            }
            else {
                i = i + 1;
            }
        }
        return BiggestSalario;
    }  
    
    public void getMaiorSalario(){
        int indexOfmaiorSalario = findIndexOfMaiorSalario(bd);
        System.out.print("Maior salário: " + bd[indexOfmaiorSalario].nome);
    }
    
    public void percentualComFilhos (){
        Funcionario[] arr = bd;
        int len = arr.length;
        int i = 0;
        int temFilho = 0;
 
        while (i < len) {
            
            if (arr[i].filhos) {
                temFilho = temFilho + 1;
            }
            i = i + 1;
        }
        double porcentagem = ((double)temFilho/len)*100;
        System.out.print("Porcentagem com filho(s): " + porcentagem + "%");
    }
    
   @Override
    public String toString() {
        return "salve!";
    }
}
