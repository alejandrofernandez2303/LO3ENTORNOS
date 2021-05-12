/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectof;

/**
 * Comentarios JavaDoc M4
 * @author D.Alex
 * @since 10/05/2021
 * @version 8.2
 */
public class Operaciones {
    /**
     * @since 10/05/2021
     * modified in 11/05/2021 to *X*
     * Method 1: sumarPar´s function takes two params to do amount operations taking a + b
     * this function returns an integer but depends off the type of integer 
     * it returns integer + 1 or only integer.
     * @param a
     *          Integer.
     * @param b
     *          Integer.
     * @return 
     *          In case of the integer being a odd integer, returns integer + 1.
     *          In opposite case it returns only integer. 
     */
    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if(resultado%2==0){
            return resultado+1;
        }else{
            return resultado;
        }
    }
    /**
     * Metohd 2: Two params that returns an integer, in case of a bigger than b, it returns a, else returns a too.
     * @param a
     *        Integer.  
     * @param b
     *        Integer.  
     * @return 
     *        In return´s function we obtain an integer based on: in case of a are bigger than b, returns a
     *                                                            in case of b bigger than a, based on code we obtain b so we´ll change that
     *                                               in case of a and b are similar we obtain a, its indifferent because are the same.
     */
    public int mayor(int a, int b) {
        if(a>b){
            return a;
        }else{
            return a;
        }
    }

    /**
     * Method 3: sumarVector. We have an array of undefined range 
     * and the function go down the array taking all of index and amounts all of them
     * @param numeros 
     *          Integer.
     * @return 
     *          Based on code we´ll obtain an amount of the first index 
     *          to himself too times than indexes are.
     */
    public int sumarVector(int [] numeros) {
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[0];
        }
        return sum;
    }
    
}
