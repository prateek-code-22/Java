public class string {
    public static void main(String[] args){

        //String Concat
        String first_name = "Prateek";
        String last_name = "Singh";
        String full_name = first_name + " " + last_name;
        System.out.println(full_name);


        //charAt -  return character at index
        String name = "prateek";
        System.out.println(name.charAt(0));


        //length of String
        System.out.println(name.length());

        // String is immutable
        //replace -> character is replaced in string 
        // orginal string is not changed , copy is changed
        String name2 = name.replace('p', 'P');
        System.out.println(name2);

         
        //substring first index is included and last not
        //substring is not cut from original string but copy of character from orginal is added to new string and then returned
        //because string are immutable
        System.out.println(name2.substring(1,6));
         
        
    }
    
}
