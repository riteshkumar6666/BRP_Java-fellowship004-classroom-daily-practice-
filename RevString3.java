public class RevString3 {
    public static void main(String[] args) {
        String str="ritesh";
        String rev="";

        char a[]=str.toCharArray();
        int leng=a.length; //6
        for (int i= str.length()-1;i>=0;i--) //5 4 3 2 1 0 -1(condition false and exist from loop)
        {
            rev=rev+a[i]; //hsetir
        }
        System.out.println("Reverse string is : "+rev);
    }
}
