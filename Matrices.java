package ejercicios_matrices;

public class Matrices {
		public void multi () {
		

		        int[][] matriz1 = {
		                {4, 6, 2},
		                {9, 8, 6},
		                {7, 3, 1},
		        };
		        int[][] matriz2 = {
		                {4, 6},
		                {9, 8},
		                {1, 2},
		        };

		        int[][] producto = new int[matriz2.length][matriz2[0].length];

		        
		        for (int a = 0; a < matriz2[0].length; a++) {  
		            for (int i = 0; i < matriz1.length; i++) {
		                int suma = 0;
		                for (int j = 0; j < matriz1[0].length; j++) {  
		                    suma += matriz1[i][j] * matriz2[j][a];
		                }
		              
		                producto[i][a] = suma;
		            }
		        }
		        
		        for (int i = 0; i < matriz2.length; i++) {
		            for (int j = 0; j < matriz2[0].length; j++) {
		                System.out.printf("%d ", producto[i][j]);
		            }
		            System.out.print("\n");
		        }
		    }
		
		public void suma() {

			int[][] matrizoriginal = {
					{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}};
			
			int[][] matrizT = new int[matrizoriginal[0].length][matrizoriginal.length];
			
			for (int i=0; i < matrizoriginal.length; i++) {
				  for (int a=0; a < matrizoriginal[i].length; a++) {
				    matrizT[a][i] = matrizoriginal[i][a];
				  }
				}
			for (int i = 0; i < matrizT.length; i++) {
	            for (int j = 0; j < matrizT[0].length; j++) {
	                System.out.printf("%d ", matrizT[i][j]);
	            }
	            System.out.print("\n");
	        }
			
		}
		
		public void suma_diagonal() {
			int[][] matriz = {
					{1,2,3},
					{4,5,6},
					{7,8,9}};
			int sumap= 0;
			
			for(int i=0; i<matriz.length;i++) {
				sumap=sumap+matriz[i][i];
			}
			System.out.println("La suma de la diagonal principal es: "+sumap);	
		}
		
		public void mayor() {
			int[][] matriz = {
					{1,2,3},
					{4,54,6},
					{7,8,0}};
			int numeroMayor = matriz[0][0];
			for (int x=0;x<matriz.length;x++) {
				  for (int y=0;y<matriz[x].length;y++) {
				    if (matriz[x][y] > numeroMayor) {
				      numeroMayor = matriz[x][y];
				    }
				  }
			}
			
			System.out.println("El numero mayor es este: "+numeroMayor);
		}
		public void suma2matrices() {
			int[][] matriz = {
					{1,2,3},
					{4,54,6},
					{7,8,0}};
			int[][] matriz_2 = {
					{1,4,3},
					{4,54,6},
					{6,8,1}};
			
			int [][]matrizr= new int[matriz.length][matriz[0].length];
					
			
			for(int i=0; i<matriz.length;i++) {
				for(int a=0; a<matriz_2.length;a++) {
					matrizr[i][a]=matriz[i][a]+matriz_2[i][a];
				}
			}
			for (int i = 0; i < matrizr.length; i++) {
	            for (int j = 0; j < matrizr[0].length; j++) {
	                System.out.printf("%d ", matrizr[i][j]);
	            }
	            System.out.print("\n");
	        }
		}
		public int [][] multi_scalar() {
			int scalar = 3;
			int[][] matriz = {
					{1,2,3},
					{4,54,6},
					{7,8,0}};
			for (int i=0; i < matriz.length; i++)
		    {
		    for (int j =0; j<matriz[i].length; j++)
		        matriz[i][j] = (int)(matriz[i][j]*scalar);   
			
		}
			return matriz;
		}
		public int [][] matriz_traspuesta(){
			int[][] matriz = {
					{1,2,3},
					{4,54,6},
					{7,8,0}};
			int[][] nueva=new int[matriz[0].length][matriz.length];

				for (int i = 0; i < matriz.length; i++) {
				    for (int j = 0; j < matriz[0].length; j++) {
				        nueva[i][j]=matriz[j][i];
				    }
				    
				}
				return nueva;
		}
		
}