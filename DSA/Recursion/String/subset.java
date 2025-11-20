//  generate the subsets of string "abc"
import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        generateSubsets("", "abc");
        System.out.println(subsets("", "abc"));
    }    

    // 
    static void generateSubsets(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return; 
        }

        char ch = up.charAt(0);

        generateSubsets(p, up.substring(1));
        generateSubsets(p+ch, up.substring(1));

    }

    // return the list as answer 
    static ArrayList<String> subsets(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsets(p + ch, up.substring(1));
        ArrayList<String> right =  subsets(p, up.substring(1));

        left.addAll(right);
        return left;

    }














}
