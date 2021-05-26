/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myidgenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import static myidgenerator.Source.SEPERATOR;

/**
 *
 * @author Sandaka Geethaj
 */
public class MyIDGenerator {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public int generateID() throws IOException {
        File file = new File("./NoText.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("ok");
        String[] array = null;
        int max = 30000;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(line, SEPERATOR);
            array = new String[stringTokenizer.countTokens()];
            for (int i = 0; i < array.length; i++) {
                if (stringTokenizer.hasMoreTokens()) {
                    array[i] = stringTokenizer.nextToken();
                }
            }

            //Integer.parseInt(array[0]);
            for (int i = 0; i < array.length; i += 6) {
                System.out.println("Print Array :" + array[i]);
                if (max < Integer.parseInt(array[i])) {
                    max = Integer.parseInt(array[i]);
                }
            }
        } catch (NullPointerException ex) {}

        System.out.println("Max ID :" + max);
        max++;
        System.out.println("Next ID :" + max);
        return max;
    }

    public static void main(String[] args) throws IOException {
        MyIDGenerator myIDGenerator = new MyIDGenerator();
        myIDGenerator.generateID();
    }

}
