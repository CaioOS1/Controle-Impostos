package Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Pojos.Fisico;
import Pojos.Juridico;
import Pojos.Taxas;

	public class Program {

		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			Taxas tx = new Fisico();
			
			List<Taxas> list = new ArrayList<Taxas>();
			
			System.out.println("Digite quantos dados serão:");
			int N = s.nextInt();
			
			for(int i = 1; i <= N; i++) {
				System.out.println("Digite as informações do "+ i + "º individuo:");
				System.out.println("Fisico ou Juridico: (F/J)");
				char tipo = s.next().charAt(0);
				s.nextLine();				
				System.out.println("Digite o nome do "+ i +"º individuo:");
				String nome = s.nextLine();	
				System.out.println("Digite a renda anual do individuo: ");
				double rendaAnual = s.nextDouble();
				if (tipo == 'F') {
					System.out.println("Gastos anuais com saúde: ");
					double rendaSaude = s.nextDouble();
					list.add(new Fisico(nome, rendaAnual, rendaSaude));
				}else {
					System.out.println("Quantos funcionários a empresa possui: ");
					int funcionarios = s.nextInt();
					list.add(new Juridico(nome, rendaAnual, funcionarios));
				}
				
				System.out.println();
				System.out.println("---------------------------------");
				System.out.println("Resumo de impostos: ");
				System.out.println("---------------------------------");
				for(Taxas t : list) {
					System.out.println("Nome: " + t.getNome() + ", Valor a pagar : $"+ String.format("%.2f", t.taxa()));
				}		
				double soma = 0.0;
				for (Taxas t : list) {
				soma += t.taxa();
				}
				System.out.println("Soma total: "+ String.format("%.2f", soma));
			}
		s.close();
	}
}

		





