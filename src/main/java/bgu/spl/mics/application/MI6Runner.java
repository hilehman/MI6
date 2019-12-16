package bgu.spl.mics.application;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import bgu.spl.mics.application.passiveObjects.*;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

/** This is the Main class of the application. You should parse the input file,
 * create the different instances of the objects, and run the system.
 * In the end, you should output serialized objects.
 */
public class MI6Runner {
    public static void main(String[] args) {
        String jsonInput = args[0];
        String inventoryOutput = args[1];
        String diaryOutput = args[2];

        String input = null;
        try{
            input = new Scanner(new File(jsonInput)).useDelimiter("\\Z").next();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
       Gson gson = new Gson();

        //TODO: jsonData jsonData = gson.fromJson(content, bgu.spl.mics.application.passiveObjects.jsonData.class);
       /* JsonObject jsonobject = gson.fromJson(input,bgu.spl.mics.application.passiveObjects.);*/

    }

}
