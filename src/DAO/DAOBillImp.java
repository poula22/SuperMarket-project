/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author george
 */
public class DAOBillImp implements DAOBill{
   private static ArrayList<DefaultTableModel> bills= new ArrayList<>();


    @Override
    public DefaultTableModel show(int i) {
        return bills.get(i);
    }

    @Override
    public void add(DefaultTableModel model) {
        bills.add(model);
    }

    @Override
    public ArrayList<DefaultTableModel> listAll() {
        return bills;
    }
    
    
}
