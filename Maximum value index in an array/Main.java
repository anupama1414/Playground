// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
   int array[10],size,i,large;
  scanf("%d",&size);
  for(i=0;i<size;i++)
    scanf("%d",&array[i]);
  large=array[0];
  for(i=1;i<size;i++)
  {
    if(large<array[i])
      large=array[i];
  }
  
  printf("%d",(i-1));
   return 0;
}