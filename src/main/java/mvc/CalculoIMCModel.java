package mvc;

import static java.lang.System.out;

public class CalculoIMCModel {

   
	
	private float altura;
        private float peso;
        private float imc;

	public CalculoIMCModel() {
		
	}
     
    public float getAltura() {
        return altura;
    }

    
    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    public float getPeso() {
        return peso;
    }

    
    public void setPeso(float peso) {
        this.peso = peso;
    }

    
    public float getImc() {
        return imc;
    }

    
    public void setImc(float imc) {
        this.imc = imc;
    }

  
    public boolean inicioAltura() {      
        return altura ==0;
       }
     public boolean inicioPeso() {      
        return peso ==0;
       }
    
    
        

	public Float calcularimc(float peso, float altura) {
             
            Float resultado = peso/ (altura*altura);
          
               return resultado;  
        }
        public String condicaoIMC (float imc){ 

        	String condicao = "";
        	
            if(imc < 18.5)  { 
                 condicao = "Abaixo do peso"; 
            
               
            }
            else  if(imc >= 18.5 && imc < 25) {  
                 condicao = "Peso normal"; 
                
            }  
            else  if(imc >= 25 && imc < 30)  {  
                 condicao = "Acima do peso";  
                   
            }  
            else  if(imc >= 30)  {  
                 condicao = "Obesidade";  
                        
            }
               return condicao;    
        }
           
       
}