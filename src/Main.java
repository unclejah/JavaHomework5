public class Main {
    public static void main(String[] args) {
    //Exercise 1
    int[] number = {1,2,3};
    float[] longNumber = {1.57f, 7.654f, 9.986f};
    String[] stMass = {"one","two","three"};

    //Exercise 2
     for(int i =0; i<number.length;i++){
         if(i+1 == number.length){
             System.out.println(number[i]);
         }else{
             System.out.print(number[i]+", ");
         }
     }
        for(int i =0; i<longNumber.length;i++){
            if(i+1 == longNumber.length){
                System.out.println(longNumber[i]);
            }else{
                System.out.print(longNumber[i]+", ");
            }
        }
        for(int i =0; i<stMass.length;i++){
            if(i+1 == stMass.length){
                System.out.println(stMass[i]);
            }else{
                System.out.print(stMass[i]+", ");
            }
        }

        //Exercise 3
        for(int i =number.length-1; i>=0;i--){
            if(i == 0){
                System.out.println(number[i]);
            }else{
                System.out.print(number[i]+", ");
            }
        }
        for(int i = longNumber.length-1; i>=0; i--){
            if(i == 0){
                System.out.println(longNumber[i]);
            }else{
                System.out.print(longNumber[i]+", ");
            }
        }
        for(int i = stMass.length-1; i>=0; i--){
            if(i == 0){
                System.out.println(stMass[i]);
            }else{
                System.out.print(stMass[i]+", ");
            }
        }

        //Exercise 4
        for(int i =0; i<number.length;i++){
            if(number[i] % 2 !=0){
                number[i] = number[i]+1;
                System.out.print(number[i]+", ");
            }else{
                System.out.print(number[i]+" ");
            }
        }

    }
}