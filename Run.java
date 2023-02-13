import java.util.*;


public class Run {
    public static void main(String[] args) {
        ReadFile r=new ReadFile("metro.csv");
        ArrayList<String[]> data = r.getData();
        MetroGraph m = new MetroGraph(data);
        ArrayList<String[]> path= m.bfsShortestPath("New-Town", "Titagarh");

        System.out.println("Total number of stations: "+path.size());

        System.out.println("Ticket price: "+( (int)(path.size()/5)+1)*5);


        for(String[] p:path){
            if(p[1].equals("Y")) 
                System.out.println(String.format("%20s",p[0])+" : Terminal Station");
            else
                System.out.println(String.format("%20s",p[0]));    
        }

    }
}
