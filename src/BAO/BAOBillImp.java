/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAO;

import DAO.DAOBill;
import DAO.DAOFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author george
 */
public class BAOBillImp implements BAOBill{
    DAOBill obj =DAOFactory.getBillDAO();

    @Override
    public boolean add(DefaultTableModel model) {
       if( model.getValueAt(0, 0) == null){
       return false;
       }
       obj.add(model);
       return true;
    }

    @Override
    public DefaultTableModel show(int i) {
        if(i>=obj.listAll().size()){
        return null;
        }
       return obj.show(i);
     
    }
    
}
