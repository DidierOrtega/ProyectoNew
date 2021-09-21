package co.iniquindio.programacion.Puntodosparcial3;

public class PuntodosParcial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [][] matriz = new char [40][20];
		int filaF=3;
		int filaI=18;
		int cF=2;
		int cI=18;
		char m[][]=llenarArea(matriz,filaI,cI,filaF,cF);
		imprimirMatriz(m);
		
	}
	public static char[][] llenarArea (char matriz[][], int filaI, int columnaInicial, int filaFinal, int columnaFinal)
	{
		int mayusculasT=79;
		int numeros=48;
		int mayusculaD=80;
		int mayusculas = 65;
		int minusculas=97;
		int minusculasD=111;
		char n='Ñ';
		char nm='ñ';
		char nu= 57;
		
		
		for (int i=filaI; i<=filaFinal; i++)
		{
			for (int j=columnaInicial; j<= columnaFinal; j++)
			{  
            
				
				matriz[i][j]= (char)mayusculas;
				mayusculas++;
				if(mayusculas>=mayusculaD)
				{
					matriz[i][j]=n;
					;
					if(mayusculas>=81)
					{	matriz[i][j]= (char)mayusculasT;
					mayusculasT++;
					}
					if(mayusculasT>91)
					{
						matriz[i][j]=(char)(minusculas);
						minusculas++;
					}if(minusculas>=112)
					{
						matriz[i][j]=nm;
					}
					if (minusculas>=113)
					{	matriz[i][j]= (char)minusculasD;
					minusculasD++;
					}
					if (minusculasD>123)
					{	matriz[i][j]= (char)numeros;
					numeros++;
					}
					if (numeros>=58)
					{	matriz[i][j]= nu;
					   mayusculas=65;
					   mayusculasT=79;
					   minusculas=97;
					   minusculasD=111;
					   mayusculaD=80;
					   numeros=48;
					}
			}
		}
		}
	
		return matriz;
	}
	
	public static void imprimirMatriz(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println();
		}
	}
	}