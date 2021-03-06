import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    //create new file if not exists, else nothing.
    public void createFile(String outputfilename) {
        try {
            File myObj = new File(outputfilename + ".csv");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //write to file
    public void writeToFile(ArrayList<ArrayList<String>> parserOutput, String datafilename) {
        try {
            FileWriter myWriter = new FileWriter(datafilename+".csv");
            for(int i = 0; i < parserOutput.size(); i++){
                if(parserOutput.get(i).isEmpty()){
                    //nothing
                } else if(parserOutput.get(i).size() == 2){
                    myWriter.append(parserOutput.get(i).get(0) + "," + parserOutput.get(i).get(1) + "\n");                   
                } else {
                    myWriter.append(parserOutput.get(i).get(0) + "," + parserOutput.get(i).get(1) + "," + parserOutput.get(i).get(2) + "\n");
                }               
            }

            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}