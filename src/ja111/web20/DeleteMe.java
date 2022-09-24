package ja111.web20;

public class DeleteMe {
    public static void main(String[] args) {
        fun();
    }
   static void fun(){
       try
       {
           int[] array= new int[10];
           array[11]=100;
           Object object =null;
           object.toString();
       }
       catch (ArrayIndexOutOfBoundsException aiobe){
           System.out.println("aiobe");
       }
       catch (NullPointerException npe){
           System.out.println("npe");
       }
       finally{
           System.out.println("the end");
       }



    }
}
