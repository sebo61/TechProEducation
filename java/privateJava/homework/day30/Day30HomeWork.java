package homework.day30;

import java.util.Arrays;
import java.util.HashMap;

public class Day30HomeWork {
    public static void main(String[] args) {
        String sentence="Hello Henry!";
       sentence =sentence.replaceAll("[^a-zA-Z]","");
        System.out.println(sentence);
        String words[]=sentence.split("");
        System.out.println(Arrays.toString(words));
        HashMap<String ,Integer> letterList=new HashMap<>();

        for (String w:words) {
            Integer  keyValueCount= letterList.get(w);

            if(keyValueCount==null){
                letterList.put(w,1);
            }else{
                letterList.replace(w,keyValueCount+1);
            }

        }
        System.out.println(letterList); //{r=1, e=2, H=2, y=1, l=2, n=1, o=1}


    }
}
