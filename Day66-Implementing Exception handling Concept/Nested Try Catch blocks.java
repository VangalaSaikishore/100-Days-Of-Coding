class MainExample
{
   public static void main(String args[])
   {
     //Main try block
     try
     {
        //try block1
         try{
            System.out.println("<<<===Try Block1===>>>");
            int num =15/0;
            System.out.println(num);
         }
         catch(ArithmeticException e1)
         {
            System.out.println("<<<===Block1 Exception: e1===>>>");
         }
         //try block2
         try
         {
            System.out.println("****Try Block2****");
            int num =100/0;
            System.out.println(num);
         }
         catch(ArrayIndexOutOfBoundsException e2)
         {
            System.out.println("****Block2 Exception: e2****");
         }
        System.out.println("<<<<====General statement after Block1 and Block2====>>>>");
    }
    catch(ArithmeticException e3){
         System.out.println("<<<<====Main Block Arithmetic Exception====>>>>");
    }
    catch(ArrayIndexOutOfBoundsException e4){
        System.out.println("****Main Block ArrayIndexOutOfBoundsException****");
    }
    catch(Exception e5){
        System.out.println("<<<<====Main Block General Exception====>>>>");
    }
    System.out.println("<<<<====Code after Nested Try Block====>>>>");
  }
}

