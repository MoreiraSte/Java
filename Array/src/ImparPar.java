
public class ImparPar {

	
		public static void main (String args[])   
		  {   
		  
		     int Array [] =  {11,9,8,56,12,32,13,25};   


		     
		     System.out.print("\nImpares:\n");
		     for (int i =0; i<Array.length; i++) {   
		        if (Array[i]%2!=0) {  
		        	
		           System.out.print(Array[i]+ " | ");   
		        }   
			     

		       
		     }   
     		System.out.print("\nPares:\n");

		     for (int i =0; i<Array.length; i++) {   
			       
		     
			        	if(Array[i]%2==0){
			        		System.out.print(Array[i]+ " | ");
			        	}
			  }
		     }
		    
		   public static boolean Par(int numero) {   
		     return (numero % 2 == 0);   
		  }  

	}


