package os101.web16.designpatterns;

public class SingletonPattern {
    public static void main(String[] args) {
        //Without singleton
       // OnlyOneObject o1= new OnlyOneObject();
       // OnlyOneObject o2= new OnlyOneObject();
      //  System.out.println(o1==o2);

        //with singleton
        EagerlyLoadedUniqueObject o1= EagerlyLoadedUniqueObject.getInstance();
        EagerlyLoadedUniqueObject o2= EagerlyLoadedUniqueObject.getInstance();
        System.out.println(o1==o2);
        System.out.println(EagerlyLoadedUniqueObject.getInstance());
        System.out.println(EagerlyLoadedUniqueObject.getInstance());


        System.out.println(LazyLoadingUniqueObject.getInstance());
        System.out.println(LazyLoadingUniqueObject.getInstance());
    }
}
//too many objects
//no obj


class EagerlyLoadedUniqueObject {
        private EagerlyLoadedUniqueObject(){}
    //unique
    //eager loading
    private static EagerlyLoadedUniqueObject o =new EagerlyLoadedUniqueObject();
        public static EagerlyLoadedUniqueObject getInstance(){
            return o;
        }
}

class LazyLoadingUniqueObject{
    private LazyLoadingUniqueObject(){}
    private static volatile LazyLoadingUniqueObject lazyLoadingUniqueObject=null;
    //one way to block the entire code - less efficient - entire highway is blocked
    public static synchronized LazyLoadingUniqueObject getInstance(){
      //another way to block only specific lines - more efficient. - only bridge is blocked
        synchronized (LazyLoadingUniqueObject.class)
        {
            if(lazyLoadingUniqueObject==null) {
                lazyLoadingUniqueObject = new LazyLoadingUniqueObject();
            }
        }
        return lazyLoadingUniqueObject;
    }
}

//third way of implementing singleton pattern
enum UniqueObjectUsingEnum{
    UNIQUE_OBJECT_USING_ENUM;
}

