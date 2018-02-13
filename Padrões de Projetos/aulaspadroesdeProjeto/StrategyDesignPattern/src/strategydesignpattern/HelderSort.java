/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategydesignpattern;

public class HelderSort implements OrdenarInterface {

public void ordena(double[] list) {
 double temp;
 for(int i = 0; i < list.length; i++) {
   for(int j = 0; j < list.length - i; j++) {
     if(list[i] < list[j]) {
       temp = list[i];
       list[i] = list[j];
       list[j] = temp;
     }
   }
 }
}
}