import java.util.Arrays;
import java.util.stream.Stream;

public class Cadastro
{
    Funcionario[] bd = {new Funcionario("Maria", "100.111.111-99", 20, 40, false), new Funcionario("João", "200.111.111-99", 10, 40, false), new Funcionario("Pedro", "300.111.111-99", 15, 40, false), new Funcionario("Bruno", "400.111.111-99", 30, 44, true), new Funcionario("Michael", "500.111.111-99", 10, 40, false)};
         
     /*
 Imprimir percentual de funcionário que possuem filhos;   
    */
     public static int findIndex(Funcionario[] arr, String cpfProcurado)
    {
       int len = arr.length;
        int i = 0;
 
        while (i < len) {
            if (arr[i].cpf == cpfProcurado) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
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
            System.out.print("Usuário "+ bd[index].nome +" removido");
            for (int i = index; i < bd.length - 1; i++) {
                bd[i] = bd[i + 1];
            }
            bd = Arrays.copyOf(bd, bd.length - 1);
        }else{
            System.out.print("Nenhum funcionário encontrado com este cpf.");
        }
        
    }
    
   public void EditarSalario (String cpfProcurado, double novoSalario) {
        int index = findIndex(bd, cpfProcurado);
        bd[index].setSalario(novoSalario);
        System.out.print(bd[index]);
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
