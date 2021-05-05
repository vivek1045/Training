import java.util.*;

class temple{
    public static void main(String [] args){
        int num_tem,donation;
        Scanner in= new Scanner(System.in);
        num_tem=in.nextInt();
        donation=in.nextInt();
        float x=1,y=0;
        for(int i=0;i<num_tem;i++){
           x=x*2;
           y=x*donation;
           y-=donation;
        }
        System.out.println(x);
        System.out.println(y);
        

    float ans=y/x;
        System.out.println("initial money:"+ans);
    }
}