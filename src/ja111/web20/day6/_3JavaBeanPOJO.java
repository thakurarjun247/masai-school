package ja111.web20.day6;

 class _3JavaBeanPOJO {

    /*
    * ### Java Bean class  POJO (plain old java object):

It is a reusable, purely encapsulated java class which should have following properties:

1. The class must be public
2. All the fields should be private
3. For each field there should be corresponding public getter and setter method.
4. It should have zero argument constructor.
5. I[t] may have parameterized constructor (it is not the minimum requirement)
    * */
   public static void main(String[] args) {
      JavaBean  javaBean= new JavaBean();
      //this won't work
     // System.out.println(javaBean.x);
      System.out.println(javaBean.whatever());
     // javaBean.x=100;
   }
}



