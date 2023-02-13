import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.*; 


public class ReadFile {
  private ArrayList<String> li = new ArrayList<String>();  
  ReadFile(String filename) {
    try {
        

        File myObj = new File(filename);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            li.add(data);
            //System.out.println(data);
        }
        myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  ArrayList<String[]> getData() {
    ArrayList<String[]> data = new ArrayList<String[]>();
    //System.out.println(li);
    for(String line : li) {
        data.add(line.split(","));
    }   
    return data;    
  }

}