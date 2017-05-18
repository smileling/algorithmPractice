package Test;

interface Ia {
   void Say();
}

class Aone implements Ia {

    @Override
    public void Say() {
        System.out.println("this is " +this.getClass());
        
    }

}

public class Atwo implements Ia {

    @Override
    public void Say() {
        System.out.println("this is" + this.getClass());
    }
    public static void main(String[] args){
        Class<? extends Ia> aAClass=Aone.class;//此处如果换做其他非Ia类就会报错的
        try {
            Ia aA=aAClass.newInstance();
            aA.Say();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}