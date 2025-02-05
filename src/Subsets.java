public class Subsets {public static void findSubsets(String str,String ans,int indi){
    if(indi==str.length()){
        if(ans.length()==0){
            System.out.println("null");
        }
        else{
            System.out.println(ans);
        }
        return;
    }
    findSubsets(str,ans,indi+1);
    findSubsets(str,ans+str.charAt(indi),indi+1);
}
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str,"",0);
    }
}
