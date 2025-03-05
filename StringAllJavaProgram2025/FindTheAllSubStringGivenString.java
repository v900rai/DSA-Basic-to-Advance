package StringAllJavaProgram2025;

import java.util.ArrayList;
import java.util.List;

public class FindTheAllSubStringGivenString {
    public static List<String> findSubString(String n){
        List<String> res=new ArrayList<>();
        for(int i=0; i<n.length(); i++) {
            for(int j=i; j<n.length(); j++){
                res.add(n.substring(i,j+1));
            }
        }
        return res;
    }
    public static void main(String args[]){
        String s="abc";
        List<String> res=findSubString(s);
        for(String i : res){
            System.out.println("All the SubString "+i);
        }
    }
}