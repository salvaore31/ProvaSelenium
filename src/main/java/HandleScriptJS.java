import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandleScriptJS {

    public static String fromScriptToString(File script){
        String data="";
        try {
            Scanner myReader = new Scanner(script);
            while (myReader.hasNextLine()) {
                data = data +"\n" +myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

}
