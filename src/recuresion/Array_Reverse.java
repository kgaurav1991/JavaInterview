package recuresion;

class Reverse{
    public void reverse(int ar[],int index){
        if(index< 0){
            return;
        }
        System.out.print(ar[index]+" ");
        reverse(ar,index-1);
    }
}
public class Array_Reverse {
    public static void main(String args[]){
      int ar[] = {1,2,3,4};

      Reverse r =  new Reverse();
      r.reverse(ar,ar.length-1);
    }
}
