package PuzzelJava;

import java.nio.file.Path;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

	public class PuzzleJava {


		// TODO Auto-generated method stub
		/*1.-Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. 
		Imprimir la suma de todos los números en el arreglo. 
		El método también debe retornar un arreglo que incluya solo los números que son mayores a 10,
		debe retornar un arreglo con los valores de 13,25,32).*/
		
		public void mayoresQue10(int [] array) {
			int suma=0;
			ArrayList<Integer> lista= new  ArrayList<Integer>();
			
			for( int i= 0;  i< array.length; i++) {
				suma+=array[i];
				if (array[i]>10) {
					lista.add(array[i]);
					
				}
				
			}
			System.out.println(suma);
			System.out.println(lista);
		}	
		
	/*2.-Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
	 * Mezcle el arreglo e imprima el nombre de cada persona. 
	 * Haga que el método también devuelva un arreglo con los nombres que tienes más de 5 caracteres.
	 */
	  public void nombrePersona(String [] nombres) {
		  ArrayList<String> lista = new ArrayList<String>();
		  for(int i=0; i<nombres.length;i++) {
			  System.out.println(nombres[i]);
			  if(nombres[i].length()>5) {
				  lista.add(nombres[i]);
				  
			  }
		  }
		  System.out.println(lista);
	  }
	  
	  /*3.-Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores).
	   *  Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo.
	   *   También debe imprimir la primera letra del arreglo. 
	   * Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
	   */
	  public void mezclaArreglo(String[] letras) {
		  
		  ArrayList<String> abecedario = new ArrayList<String>();	
			
			
			 for (int i=0; i<letras.length; i++){
				 abecedario.add(letras[i]);
				Collections.shuffle(abecedario);
				
			}
				 System.out.println("El arreglo al mezclarlo es el siguiente:"+ abecedario);
				 System.out.println("La ultima letra del arreglo es: "+abecedario.get(25));
				 System.out.println("La primera letra del arreglo es: "+abecedario.get(0));
				 
				 if(abecedario.get(0)== "a" ||abecedario.get(0)== "e" ||abecedario.get(0)== "i"||abecedario.get(0)== "o"||abecedario.get(0)== "u"){
					 System.out.println("La primera letra es la vocal; "+abecedario.get(0));
				 }
		}
	  /*4.-Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 */
	  public ArrayList<Integer>  numerosAleatorios() {
	        
	        ArrayList<Integer> aleatorios = new ArrayList<Integer>();
	        for(int i = 0; i < 10; i++){
	            int num = ThreadLocalRandom.current().nextInt(55, 100);
	            aleatorios.add(num);
	        }
	        System.out.println(aleatorios);
	        return aleatorios;
	}
	  
	
	  /*Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y 
	   * hacer que estén ordenados (mostrar el número más pequeño en el principio del arreglo).
	   *  Imprimir todos los números del arreglo. Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.*/
	
	public void imprimirArreglo( int min, int max){
        ArrayList<Integer> aleatorios= new ArrayList<Integer>();
   
        for(int i = 0; i < 10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55, 100);
            aleatorios.add(num2);
            if(num2 < min){
                min = num2;
            }
            if(num2 > max){
                max= num2;
            }
        }
        Collections.sort(aleatorios);
        System.out.println(aleatorios);
        System.out.println("El valor mínimo del arreglo es: " + min);
        System.out.println("El valor máximo del arreglo es: " + max);
        
	}
	/*Crear una cadena aleatoria con 5 caracteres de longitud.*/
	
	 public void cadenaAleatoria(String alfaNumerico){
	        Random rand = new Random();
	        StringBuilder otroString = new StringBuilder();
	        for(int i = 0; i < 5; i++){
	        	otroString.append(alfaNumerico.charAt(rand.nextInt(alfaNumerico.length())));
	        }
	        String cadenaFinal = otroString.toString();
	        System.out.println("Esta es una cadena aleatoria de 5 caracteres: "+ cadenaFinal);
	    }
	 /*Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud*/
	 
	/* public void arregloAleatorioLongitud(String alfaNumeric){
		  
		    Random rand = new Random();
	        StringBuilder cadena = new StringBuilder();
	        ArrayList<String> cadenaAleatoria = new ArrayList<String>();
	       
	        for(int i = 0; i < alfaNumeric.length(); i++){
	        	for(int j = 0; j < 5; i++){
	        		cadena.append(alfaNumeric.charAt(rand.nextInt(alfaNumeric.length())));
	        	}
	        	String cadenaFinal = cadena.toString();
	  	        System.out.println("La cadena aleatoria es: "+ cadenaFinal);
	  	        cadena.setLength(0);
	        }
	        System.out.println(cadenaAleatoria);
	      
	   }*/
	 
	 
	 
	 }
	
	
	
	
        
	
