
/**
 * Brenda Pereira Camara - Matrícula: 22106117-9
 * Maria Eduarda Wendel Maia - Matrícula: 22105084-2
 */
public class Funcionario {
    public String nome;
    public String cpf;
    public double valorHora;
    public Boolean filhos;
    public double cargaHoraria;
    public double salario;
    
    public Funcionario(String nome, String cpf, double valorHora, double cargaHoraria, Boolean filhos){
        this.nome = nome;
        this.cpf = cpf;
        this.valorHora =  valorHora;
        this.salario = valorHora * (cargaHoraria * 4);
        
        if(cargaHoraria > 44){
            this.cargaHoraria = 44;
        }else{
            this.cargaHoraria = cargaHoraria;   
        }
        this.filhos = filhos;
    }
    
    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public Boolean getTemFilhos(){
        return filhos;
    }
    
    public String getCPF(){
        return cpf;
    }
   
    @Override
    public String toString() {
        return  " Funcionario: nome: " + nome+ ", cpf: " + cpf + ", salario: " + salario;
    }     
    
   
}

