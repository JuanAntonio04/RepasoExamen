package Test;
/**
 * @author Juan Antonio Bozada Nieto
 *
 * @version 1.0
 *
 * @since 17/03/2023
 */
public class Deposito {    
	
	/**
	 * Atributo diametro del deposito
	 */
    private float diametro;
    
    /**
	 * Atributo altura del deposito
	 */
    private float altura;
    
    /**
	 * Atributo idDeposito del deposito
	 */
    private String idDeposito;
    
   /**
    * Constructor sin parametros.
    * */
    public Deposito () { 
        this(0,0,"");          
    } 
    
    /**
     * Constructor de la clase que pide los parámetros necesarios
     * */
    public Deposito (float valor_diametro, float valor_altura, String valor_idDeposito) {
        if (valor_diametro > 0 && valor_altura > 0) {            
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
        } else {
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println ("Creado depósito con valores por defecto diametro 10 metros altura 5 metros id 000" );
        }   }

    /*
     * @param valor_idDeposito : Un String del valor de la ID del deposito.
     * @param valor_diametro : Un float del valor de la altura deposito.
     * @param valor_altura : Un float del valor de la altura del deposito.
     * 
     * */
    public void setValoresDeposito (String valor_idDeposito, float valor_diametro, float valor_altura) {
        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
        if (idDeposito !="" && valor_diametro > 0 && valor_altura > 0) {
        } else {
            System.out.println ("Valores no admisibles. No se han establecido valores para el depósito");
            idDeposito = "";
            diametro = 0;
            altura = 0;
        }     }

    /**
     * 
     * @return Diametro
     */
    public float getDiametro () { return diametro; } 
    
    /**
     * 
     * @return Altura
     */
    public float getAltura () { return altura; } 
    
    /**
     * 
     * @return IdDeposito
     */
    public String getIdDeposito () { return idDeposito; } 
    
    /**
     * 
     * @return Capacidad
     */
    public float valorCapacidad () { 
        float capacidad;
        float pi = 3.1416f; 
        capacidad = pi * (diametro/2) * (diametro/2) * altura;
        return capacidad;
    }    

} 