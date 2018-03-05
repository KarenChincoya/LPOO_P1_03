/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

/**
 *
 * @author Karen Velasco
 */
public class Perfect {
    
    public void main(){
        for (int i=1;i<=1000;i++){
            if(i==sumaDivisores(i)){
                System.out.println(i);
            }
        }
    }
    
    public Integer sumaDivisores(Integer n){
        Integer suma =0;
        for(int i=1;i<n;i++){
            if(n%i == 0 )
                suma+=i;
        }
        return suma;
    }
}
