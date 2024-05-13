import java.io.FileWriter; 
import java.io.IOException;
public class Step8_point{
    public static void main(String[] args) {
      double t=0.00;
      double R=8.0/8000;
      double r=1.0/8000;
      double a=4.0/8000;
      
      try {
        FileWriter myWriter = new FileWriter("filename.txt");
        while(t< 16*Math.PI)
        {
            double x=(R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t)-118.289342;
            double y=(R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t)+34.021252;
            String res="";
            res+=Double.toString(x)+','+Double.toString(y)+ " \n";
            myWriter.write(res);
            t=t+0.01;
        }
        
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

    }
  }
  