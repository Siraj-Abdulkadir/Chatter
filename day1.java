public class day1 {

     public static void main (String[] args){
        int c=0;
        for(int x=0;x<10 ;x++){
            c =c+x;
        }
        System.out.println(c);

      String[] siraj={"s","i","r","A","J"};

//printing elements of an array
      for(
        int j=0;
        j<siraj.length;
        j++){
        System.out.println(siraj[j]);
      }

      
// average of an array
int[] numbersArrays={1,2,3};
int allsum=0;
for(int y=0; y<numbersArrays.length;y++){
    int current= numbersArrays[y];
    allsum = allsum + current;



}

int result=allsum/numbersArrays.length;
System.out.println(result);
  }
     }

