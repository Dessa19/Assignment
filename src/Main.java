public class Main {
    public static void main(String[] args) {
printTheNum(10);
        System.out.println("\n");
printTheNum2(10);
        System.out.println("\n");
printTheNum3(10);
    }
    // This is for loop.
    public static int printTheNum(int x){
        for(int i = 0;i < 10;i++){

            System.out.print(i + ",");
        }
        return x;
    }
    //This is while loop.
    public static int printTheNum2(int y){
        int i = 0;
        while (i < 10){
            System.out.print(i + ",");
            i++;
        }
      return y;
    }
    // This is do while loops.
    public static int printTheNum3(int z){
  int i = 0;
  do{
      System.out.print(i + ",");
      i++;
  }
   while (i <10);
   return z;
    }
}