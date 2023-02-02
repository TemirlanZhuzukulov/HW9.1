import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        min(20,30,40,50,60,70,80);

    } public  static  void min(int...arrray){
        Arrays.sort(arrray);
        System.out.println("min:"+arrray[0]);
        System.out.println("Arrays:"+Arrays.toString(arrray));
    }
}