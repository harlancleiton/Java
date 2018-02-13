/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategydesignpattern;


public class OrdenacaoContext {
    private OrdenarInterface sorter = null;

    public void sortDouble(double[] list) {
     sorter.ordena(list);
    }

    public OrdenarInterface getSorter() {
     return sorter;
    }

    public void setSorter(OrdenarInterface sorter) {
     this.sorter = sorter;
    }
}