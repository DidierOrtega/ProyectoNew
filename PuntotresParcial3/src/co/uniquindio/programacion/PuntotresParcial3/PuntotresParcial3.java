package co.uniquindio.programacion.PuntotresParcial3;

public class PuntotresParcial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *  Este main esta creado para la validacion y funcioanmiento de los metodos, el codigo no es estatico.
		 */
		String [][] matriz = {{"cama","leche","azul"},{"perro","roso","acma"},{"casa","pelo","acsa"},{"tela","late","lpeo"}};
		matriz=devolverSimilaresSinRepeticion(matriz);
	}

/** esta funcion me permite saber las veces que esta repetido un caracter 
 * en una palabra
 * 
 * @param palabra1
 * @param caracter
 * @return contador; me indica la veces que caracter se repite en Palabra1
 */
public static int contarOcurrencias (String palabra1, char caracter)
{ //La construcción de esta función  es opcional
	int contador=0;
	char carac=caracter;
	 char [] one=palabra1.toCharArray();
	for(int i =0;i<one.length;i++)
	{
		char dato=one[i];
		if(dato==carac)
		{
			contador++;
		}
	}
	return contador;
}
/**Esta funcion me indica si  palabra1 es/no similar a palabra2, aqui invocamos 
 * a contarOcurrencias para ver las veces los caracteres de palabra1 se repiten 
 * en palabra 2 y viceversa, esto solo se hace unicamente si la longitud de 
 * ambas palabras sean iguales
 * * @param palabra1
 * @param palabra2
 * @return similar;me retorna false o true independiente de si cumple o no 
 * las condiciones 
 * 
 * RECORDAR QUE:Dos palabras son similares si tienen la misma longitud y  los 
 * mismos caracteres  en cualquier orden
 */
public static boolean isSimilar(String palabra1, String palabra2)	
{ //se sugiere la invocación del método contarOcurrencias
  boolean similar=false;
  int confirmar=0;
   char [] one=palabra1.toCharArray();
   char [] two=palabra2.toCharArray();
 if(palabra1.length()==palabra2.length())
   {for(int i=0;i<one.length;i++)
   {  
	   int contar=contarOcurrencias(palabra2,one[i]);
	   int contar1=contarOcurrencias(palabra1,one[i]);
	   if(contar==contar1)
	   {
		   confirmar++;
	   }		   
	   if(confirmar==one.length)
	   {
		   similar=true;
	   }
	   }
   }
   return similar;
   }
/**
 * esta funcion me verifica si una palabra esta repitada en una matriz(matrizResultante)
 * @param palabra
 * @param matrizResultante
 * @return un boolean que me dice si esta o no repetida palabra en matrizResultante.  */
public static boolean verificarRepetida (String palabra, String [][] matrizResultante)
{  	int z=0;
	boolean verificador=false;
	for(int i=0;i<matrizResultante.length;i++)
	{	for(int j=0;j<matrizResultante[i].length;j++)
	{
	   		if (palabra==(matrizResultante[i][j]))
	   		{  
	   			z++;
	   		}if(z>1)
	   		{
	   			verificador=true;
	   		}	
	   		}
	}
	return verificador;
	}
	
/**Esta funcion  nos devuele una lista de las palabras que tiene su palabra similar en matrizA, pero no debe estar repetida.
 * para esto recorremos matrizA, establecemos si cada palabra tiene su repetida en dicha matriz y si no se repite procedemos
 * evaluar si dicha palabra tiene alguna palabra similar, y asi sucesivamente con las otras.
 * @param matrizA
 * @return una matriz con la condicion 2*p, y con las palabras similar, que no presentan repeticion
 */
public static String[][] devolverSimilaresSinRepeticion(String matrizA[][])
{	
	String matrizB [][]=new String [matrizA.length][matrizA[0].length];
	for(int i=0;i<matrizA.length;i++)
	{	for(int j=0;j<matrizA[i].length;j++) {
		 
		String palabra=matrizA[i][j];
		 
		  boolean rept=verificarRepetida(palabra,matrizA);
		  if(rept==false)
		  {   
			  for(int m=0;m<matrizA.length;m++)
				{	for(int n=j+1;n<matrizA[m].length;n++) {
				  
			  {	    
					  boolean sim=isSimilar(palabra,matrizA[m][n]);
				  if(sim)
				  { 
					  System.out.println(palabra+ "  "+matrizA[m][n]);
					  //matrizB[i][j]=matrizB[i][j];
				  } 
			  }
				}
				}
		  }
	}}
	return matrizB;
}

}
	