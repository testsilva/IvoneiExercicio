import java.util.*;

public class VetorABC {
	static int opcao = 4;
	static Scanner in = new Scanner(System.in);
	static int tamvetores=8;
	static int VetorA[] = new int[tamvetores];
	static int VetorB[] = new int[tamvetores];
	static int VetorC[] = new int[tamvetores];

	public static void main(String[] args) {
		boolean PassouPorAqui = false;
		while (opcao != 0) {
			Menu();
			switch (opcao) {
			case 0:
				break;
			case 1:
				PrencherVetorA(VetorA);
				PassouPorAqui = true;
				break;
			case 2:
				if (PassouPorAqui == true) {
					MostrarVetorB(VetorA);
				} else {
					System.out.println("");
					System.out.println("Você Necessita Preencher O Vetor A Primeiro!!!");
				}
				break;
			case 3:
				if (PassouPorAqui == true) {
					MostrarVetorC(VetorA);
				} else {
					System.out.println("");
					System.out.println("Você Necessita Preencher O Vetor A Primeiro!!!");
				}
				break;
			}
		}

	}

	public static void Menu() {
		System.out.println("");
		System.out.println("===== MENU =====");
		System.out.println("0 - Finaliza Aplicação");
		System.out.println("1 - Inserir Dados Vetor A");
		System.out.println("2 - Ordem crescente no Vetor B");
		System.out.println("3 - Pares no Inicio, Impares no Fim Vetor C");
		System.out.print("Informe a opção: ");
		opcao = in.nextInt();
	}

	public static int[] PrencherVetorA(int VetorA[]) {
		int valor,posicao=0,tam=tamvetores;
		int vetorAux[]=new int[99999];
		boolean encontrouigual = false;
		for(int i=0; i<tam;i++){
			encontrouigual=false; // boolean encontrouigual = false;
			System.out.println("Informe o valor para a posição " + i
					+ " do vetor A:");
			valor = in.nextInt();
			posicao=posicao+1;
			for (int j =0;j<posicao;j++) {
				if(valor==vetorAux[j]){
	                encontrouigual=true;
	            }
			
	        }
	         if(encontrouigual==true && i!=0){
	             System.out.println("Os Valores do Vetor A não Podem ser iguais!!!");
	             System.out.println("");
	             i--; // i=i-1;
	             
	             
	         } else{
	             vetorAux[i]=valor;
	             	            
	         } 
	         
	        }
		for(int i=0;i<tam;i++){
			VetorA[i]=vetorAux[i];
		}
		return VetorA;
	}

	public static void MostrarVetorB(int VetorA[]) {
		int aux;
		for (int i = 0; i < VetorA.length; i++) {
			for (int j = 0; j < VetorA.length; j++) {

				if (VetorA[i] < VetorA[j]) {

					aux = VetorA[i];
					VetorA[i] = VetorA[j];
					VetorA[j] = aux;

				}
				VetorB[j] = VetorA[j];
			}
		}
		System.out.println("");
		for (int i = 0; i < VetorA.length; i++) {
			System.out.println(" Vetor B, Posição: " + i
					+ " Valor Na Posição: " + VetorB[i]);// VetorB[0], VetorB[1]
		}
	}

public static void MostrarVetorC(int VetorA[]) {
		int k=0  ;
		int tamanhopar=0;
		for (int i = 0; i < VetorA.length; i++) {
			if (VetorA[i] % 2 == 0) {
				VetorC[k] = VetorA[i];
				k++;
				tamanhopar=tamanhopar+1;
			} 
		}
		int tamanhoimpar=k,j=tamanhoimpar;
		for (int i = 0; i < VetorA.length; i++) {
			if(VetorA[i]%2==0){
			}else{
				VetorC[j] = VetorA[i];
				j++;
			}
		}
		System.out.println("");
		System.out.println("Valores Pares: ");
		for (k = 0; k < tamanhopar; k++) {
			System.out.println(" Vetor C, Posição: " + k + " Valor Par: "
					+ VetorC[k]);
		}
		System.out.println("");
		System.out.println("Valores Impares: ");
		for (j = tamanhoimpar; j < VetorA.length; j++) {
			System.out.println(" Vetor C, Posição: " + j + " Valor Impar: "
					+ VetorC[j]);
		}

	}
}
