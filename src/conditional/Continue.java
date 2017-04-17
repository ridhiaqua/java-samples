/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

/**
 *
 * @author ridhi
 */
public class Continue {
    public static void main(String[] args){
        int[] num={1,2,3,5,6};
        for(int x:num){
            if(x==3){
                continue;}
            System.out.println(x);
        }
}
}
