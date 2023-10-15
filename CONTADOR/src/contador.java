import java.util.Scanner;

public class contador {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int n1 = ler.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int n2 = ler.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(n1, n2);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int n1, int n2) throws ParametrosInvalidosException {
		if(n2<=n1){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		int contagem = n2 - n1;
            for(int i = 0;i<contagem;i++){
                n1++;
                System.out.println(n1);
            }
	}

}
