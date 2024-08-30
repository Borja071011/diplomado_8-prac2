/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Admin
 * 
 * la clase mostrara en el servidor como se incializa el strust el cual dara como mensaje en consola hola desde struts
 */
public class SaludarAction {
    Logger log = LogManager.getLogger(SaludarAction.class); 
    private String saludosAtr; 
    public String execute(){ 
        log.info("ejecutando metodo execute desde struts 2");
        this.saludosAtr = "Hola desde Struts2";
        return "exito"; 
    }
 
    public String getSaludosAtr() {
        return saludosAtr;
    }
 
    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
}
