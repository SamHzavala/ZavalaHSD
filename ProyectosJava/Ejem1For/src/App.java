public class App {
    public static void main(String[] args) throws Exception 
    {
       int Num1=1;
       int Num2=2;
       int Ite=10;
       int Suma=0;
       int Cont=0;

       System.out.println(Num1);
       System.out.println(Num2);

       while(Cont<Ite)
       {
        Suma=Num1+Num2;
        System.out.println(Suma);

        Num1=Num2;
        Num2=Suma;

        Cont++;
       }
    



    }
}
