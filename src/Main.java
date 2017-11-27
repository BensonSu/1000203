import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n,max=Float.MIN_VALUE,min=Float.MAX_VALUE;
        for(int i=1;i<=10;i++)
        {
            n=in.nextFloat();
            if(n>max)
                max=n;
            if(n<min)
                min=n;
        }
        System.out.printf("max=%.2f\n",max);
        System.out.printf("min=%.2f\n",min);
    }
}

