import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("Quantos funcionários deseja cadastrar? ");
        int n=sc.nextInt();

    Funcionario[] lista = new Funcionario[n]; //vetor
        double soma=0;

        for (int i=0; i<n; i++){
            System.out.print("\033[H\033[2J");
System.out.flush();
        Funcionario func=new Funcionario();

        System.out.println("Digite a matrícula do funcionário: ");
        func.setMatricula(sc.next());

        System.out.println("Digite o nome do funcionário: ");
        func.setNome(sc.next());

        System.out.println("Digite o salário do funcionário: ");
        func.setSalario(sc.nextDouble());
        soma += func.getSalario();
        lista[i]=func;
        }
         System.out.print("\033[H\033[2J");
System.out.flush();
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.getNome());
            
        }
        System.out.println("A média salarial dos funcionários é: " + soma/n);
        
    }
    

}
