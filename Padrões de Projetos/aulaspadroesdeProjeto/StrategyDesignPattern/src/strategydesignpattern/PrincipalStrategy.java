/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategydesignpattern;

public class PrincipalStrategy {

 public static void main(String[] args) {


     double[] list = {1,2.4,7.9,3.2,1.2,0.2,10.2,22.5,19.6,14,12,16,17};


    /*aqui usando strategy*/
    OrdenacaoContext context = new OrdenacaoContext();
    context.setSorter(new HelderSort());


    context.sortDouble(list);




    for(int i =0; i< list.length; i++) {
        System.out.println(list[i]);
  }


}
}