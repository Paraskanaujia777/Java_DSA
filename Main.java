
import java.util.*;
public class Main {

// FUNCTION TO PRINT SUM OF ALL ELEMENTS OF AN ARRAY

public static int totalsum(int arr[]){
  int count =0;
  int sum =0;
  
  while(count<arr.length){
    sum = sum + arr[count];
    count++;
  }
  return sum;
  
}


public static void naturalsum(int i , int n , int sum){

if(i == n){
 sum += i;
 System.out.println(sum);
 return;
}
  sum+=i;
  naturalsum(i+1, n, sum);
  
}



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter 1 number:");
    // int x = sc.nextInt();
    // System.out.println("Enter 2 number:");
    // int y = sc.nextInt();

    // if(x > y){
    //   System.out.println(x +" is greater than "+y);
    // }
    // else if(x == y){
    //   System.out.println(x+" is equal to "+y);
    // }
    // else{
    //   System.out.println(x+" is smaller than "+y);
    // }
    
    
    

  //   if(x%2 == 0){
  //     System.out.println(x+" is an even number");
  //   }
  //   else{
  //     System.out.println(x+" is an odd number");
  //   }

  // for(int i =0 ; i<=5;i++){
  //   System.out.println("paras kanaujia "+i);
  // }
  // int x = sc.nextInt();
  // int y = sc.nextInt();

// for(int i=1 ; i<=x; i++){
//   for(int j =1 ; j<=x ; j++){
//     if( j < i ){
//       System.out.print(" ");
      
//     }
//     else{
//       System.out.print("*");
//     }
//     // System.out.println("*");
//   }
//   System.out.println();
// }

// int firstNum = sc.nextInt();
// int secondNum = sc.nextInt();

// findFactorial(firstNum);
// }

// public static void findFactorial(int x ){
//   int fact =1;

//   for(int i =x ;i>=1 ; i--){
//     fact = fact*i;
//   }
//   System.out.println(fact);


// System.out.println("enter rows");
// int rows = sc.nextInt();

// System.out.println("enter columns");
// int cols = sc.nextInt();

// int arr2D [][] = new int [rows][cols];

// for(int i = 0 ;i< rows ; i++){
//   for(int j =0 ; j< cols ; j++){
//      arr2D [i][j] = sc.nextInt(); 
//   }
// }

// int find = sc.nextInt();

// for(int i = 0 ;i< rows ; i++){
//   for(int j =0 ; j< cols ; j++){
//     if(arr2D[i][j] == find)
//     System.out.print("found at index "+ i+"," +j);
//   }
//   System.out.println();
// }

// String firstName = sc.nextLine();
// String lastName = sc.nextLine();

// System.out.println(firstName + "@"+ lastName);

// int num = 5;
// int index = 3;
// int bitMask = 1<<index;



// if((bitMask & num ) == 0){
//   System.out.println("bit is zero");
// }else{
//   System.out.println("bit is one");

// int Numbers [] = {99,1,6,76,4,9,7,1000};

// for(int i =0 ;i<Numbers.length-1 ; i++){

//   for(int j = 0 ;j<Numbers.length-1; j++){
//     if(Numbers[j]>Numbers[j+1]){
//       int temp = Numbers[j];
//       Numbers[j]= Numbers[j+1];
//       Numbers[j+1]= temp;
//     }
//   }
// }

// for(int i =0 ; i<Numbers.length ; i++){
//   int largest = i;
//   for(int j =i+1 ;j<Numbers.length ; j++){
//     if(Numbers[j] > Numbers[largest]){
//       largest = j;

//     }
//   }
//   int temp = Numbers[largest];
//   Numbers[largest] = Numbers[i];
//   Numbers[i] = temp; 
// }

// INSERTION SORT 

// for (int i =1 ;i<Numbers.length;i++ ){
//   int current  = Numbers[i];
//   int  j =i-1;

//   while(j>=0 && current < Numbers[j] ){
//     Numbers[j+1]= Numbers[j];
//     j--;
//   }
//   Numbers[j+1]= current;

// }
//   System.out.println(Arrays.toString(Numbers));
int arrr[]={1,2,3,4,5,6,7,8,9};
System.out.println("total sum of array is "+ totalsum(arrr));
naturalsum(1,5,0);
}
}