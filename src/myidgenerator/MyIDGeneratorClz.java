/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myidgenerator;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Sandaka Geethaj
 */
public class MyIDGeneratorClz {
    
    public void generateID() throws IOException{
        File file = new File("./IDGenerator.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        
    }
}
