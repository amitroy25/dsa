package dsa.string.shortestpath;

public class ShortestPath {
    
     public static double shortestPath(String str){
             

        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
           char path=str.charAt(i);

           if(path=='W')
                x--;
                else if(path=='E')
                x++;
                else if(path=='N')
                y++;
                else 
                 y--;

        }
            int x2=x*x;
            int y2=y*y;
            return Math.sqrt(x2+y2);
     }
    public static void main(String[] args){

     String str= "WNEENESENNN";

    System.out.println(shortestPath(str));




    }
}
