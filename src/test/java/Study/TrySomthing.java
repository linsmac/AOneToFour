package Study;

public class TrySomthing {
    public static void main(String[] args) {
        String str = "This is a book. That is a pencil.This is good, and that is bad.";
        String[] strpile = str.split("/W");
        for(int i=0,len=strpile.length;i<len;i++){
            System.out.println(strpile[i].toString());
        }
    }
}
