/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import java.io.File;

/**
 *
 * @author juank
 */
public class EPS {
    
    private static final String FILE_PATH = "registros_citas.xlsx";

    public static void main(String[] args) {
        
        File f = new File(FILE_PATH);
        if (f.exists()) f.delete();
        
        new GUI().setVisible(true);
        
    }
}
