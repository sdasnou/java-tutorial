
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ){
        //BufferedReader
        try { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfinput = br.readLine();                
            for(int i = 0 ; i <noOfinput;i++){
                int intput1 =  br.readLine();
                ArrayList<Integer> data = new ArrayList<>();  
                for (int j = 0 ; j<intput1; j++){
                    data.add(br.readLine());
                } 
                Collections.sort(data);
                int sum = 0;
                boolean returnValue = false;
                for (int k=0; k < data.size(); k++){
                    sum = data.get(k)  * data.indexOf(data.get(k));
                    if (data.get(data.size()-1) - data.get(k) < sum){
                        returnValue = true; 
                    }
                    k = data.lastIndexOf(data.get(k));

                }

            }
        } catch(Exception e) {
          e.printStackTrace();
        }
    }
}

