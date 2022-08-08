import java.util.Arrays;

public class array {

    public static void main(String [] args){

        //data type []list name = new dt[size]
        int [] marks = new int[3];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 95;

        System.out.println(marks); // return the classname + hash
        System.out.println(marks[0]);


        // In java the array is initalized with zero if we dont provide data


        //length
        System.out.println(marks.length);

        //Array class has sort func
        Arrays.sort(marks);
        for(int i=0; i <marks.length; i++){      
        System.out.println(marks[i]);
    }

    
    //initalize 1 d array
    int[] total = {98,1244,124};
    System.out.println(total[0]);


    //initalize 2d array
    int[][] finalmarks = {{12,29,3,9},{82,89,329,65}};
    System.out.println(finalmarks[0][1]);
    /*
       0  1  2 3
    0  [[12,29,3,9],
    1 [82,89,329,65]]
     
    */



}
    
}
