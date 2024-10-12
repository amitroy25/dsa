package dsa.Bitmanuplation.convertbinarytodecimal;

public class ConvertBinaryToDecimal {

    public  static void main(String[] args){
          int num=0;
          int cnt=0;
        String str="1000";
        for(int i=str.length()-1;i>=0;i--){
               if(str.charAt(i)=='1'){
                           num=(int)(num+Math.pow(2, cnt));
               }
               cnt++;
                    
        }
        System.out.println(num);
    }
    
}
