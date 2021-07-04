/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAO;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author george
 */
public interface BAOBill {
     public boolean add(DefaultTableModel model);
     public  DefaultTableModel show(int i);
}
