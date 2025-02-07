public class Permutation {
    public static void findPermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            count++;
            return;
        }
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            findPermutations(newStr,ans+current);
        }
    }
    static int count=0;
    public static void main(String[] args) {
        String str="23456789";
        findPermutations(str,"");
        System.out.println(count);
    }
}
