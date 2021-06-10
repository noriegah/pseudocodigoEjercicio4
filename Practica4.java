import java.util.*;

public class Practica4 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int i=1;
    int may=0;
    int men=0;
    int t;
    while (i<=20){
        System.out.println("Ingrese edad "+i);
        t=scanner.nextInt();
        if (i==1){
            may=t;
            men=t;
        }else{ 
            if(t>may){
            may=t;
            }
            if(5<men){
                men=t;
            }
    }
        i++;
    }
    System.out.println("La edad mayor es "+may);
    System.out.println("La edad menor es "+men);
}
}