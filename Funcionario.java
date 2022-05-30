
/**
 * Defina uma classe Funcionario, sabendo que todo funcionário possui nome,
CPF, valor da hora trabalhada, e carga horária semanal (que não pode
ultrapassar 44 horas semanais, se ultrapassar o valor deve ser fixado em 44
horas) e com um campo booleano onde true significa que tem filhos e false que
não possui filhos. Defina os atributos da sua classe e os métodos básicos
(construtor parametrizado, getters, setters e toString). 
Além disso, escreva um método que calcule e retorne o valor do salário do funcionário.

Implemente uma classe Cadastro que contém um método main, onde você irá
criar um vetor para armazenar objetos do tipo Funcionario. 
Inicialize o vetor com 5 objetos Funcionario instanciados de forma direta, passando os valores para o
construtor.
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

