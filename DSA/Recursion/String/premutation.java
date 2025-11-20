// 
import java.util.ArrayList;


public class premutation {
    public static void main(String [] args){
        generatePermutation("", "abc");
        ArrayList<String> ans = permutation("", "abc");
        System.out.println(ans);
    }
    

    static void generatePermutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // for placing the char in different places
        for(int i = 0; i<= p.length(); i++){
            String left = p.substring(0,i);
            String right = p.substring(i,p.length());
            generatePermutation(left+ch+right, up.substring(1));
        }

    }

    
    // RETURN as Arraylist
    static ArrayList<String> permutation(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // local to function call
        ArrayList<String> ans = new ArrayList<>();

        int n = p.length();
        for(int i = 0; i <= n; i++){
            String ls = p.substring(0,i);
            String rs = p.substring(i,n);
            ans.addAll(permutation(ls+ch+rs, up.substring(1)));
        }

        return ans;

    } 









}