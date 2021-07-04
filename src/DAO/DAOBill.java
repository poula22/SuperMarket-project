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
public interface DAOBill {
    public void add(DefaultTableModel model);
     public  DefaultTableModel show(int i);
     public ArrayList<DefaultTableModel > listAll();
}
