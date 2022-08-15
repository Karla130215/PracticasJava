package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SystemView;

public class SettingsControler implements MouseListener {

    
    //instanciar la Vista
    SystemView views;
    //Realizar el controlador de ley son publicos
    public SettingsControler( SystemView views){
    this.views=views;
    //con esto los ponemos dn escucha
    this.views.jLabel3Products.addMouseListener(this);
    this.views.jLabelCategories.addMouseListener(this);
    this.views.jLabelCustomers.addMouseListener(this);
    this.views.jLabelEmployes.addMouseListener(this);
    this.views.jLabelPurchanses.addMouseListener(this);
    this.views.jLabelReports.addMouseListener(this);
    this.views.jLabelSuppiers.addMouseListener(this);   
    this.views.jPanelSettings.addMouseListener(this);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //patra que cambi de color a verde
        if (e.getSource()==views.jLabel3Products) {
            views.jPanelProducts.setBackground(new Color(152,202,63));
        }else if (e.getSource()==views.jLabelPurchanses) {
            views.jPanelPurchases.setBackground(new Color(152,202,63));
            
        }else if (e.getSource()==views.jLabelCategories) {
            views.jPanelCategories.setBackground(new Color(152,202,63));
        }
        else if (e.getSource()==views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(152,202,63));
        }
        else if (e.getSource()==views.jLabelEmployes) {
            views.jPanelEmployes.setBackground(new Color(152,202,63));
        }
        else if (e.getSource()==views.jLabelReports) {
            views.jPanelReports.setBackground(new Color(152,202,63));
        }
         else if (e.getSource()==views.jLabelSuppiers) {
            views.jPanelSuppliers.setBackground(new Color(152,202,63));
        }
         else if (e.getSource()==views.jPanelSettings){
             views.jPanelSettings.setBackground(new Color(152,202,63));
            
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //para que regrese al colo inicial
  if (e.getSource()==views.jLabel3Products) {
            views.jPanelProducts.setBackground(new Color(18,45,61));
        }else if (e.getSource()==views.jLabelPurchanses) {
            views.jPanelPurchases.setBackground(new Color(18,45,61));
            
        }else if (e.getSource()==views.jLabelCategories) {
            views.jPanelCategories.setBackground(new Color(18,45,61));
        }
        else if (e.getSource()==views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(18,45,61));
        }
        else if (e.getSource()==views.jLabelEmployes) {
            views.jPanelEmployes.setBackground(new Color(18,45,61));
        }
        else if (e.getSource()==views.jLabelReports) {
            views.jPanelReports.setBackground(new Color(18,45,61));
        }
         else if (e.getSource()==views.jLabelSuppiers) {
            views.jPanelSuppliers.setBackground(new Color(18,45,61));
        }
         else if (e.getSource()==views.jPanelSettings){
             views.jPanelSettings.setBackground(new Color(18,45,61));
            
        }

    }

}
