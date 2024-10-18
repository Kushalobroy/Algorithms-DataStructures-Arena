import java.util.*;
public class InsertACharacter {
    public static String addCharacters(String s, int locations[]){
        String ans = "";
        int j=0;
        for(int i=0;i<s.length();i++){
            if(locations[j]==i && j<locations.length){
                ans+='*';
                j++;
            }
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abcde";
        int locations[] ={1,3,5};
        String ans = addCharacters(s, locations);

        System.out.println(ans);
    }
}

