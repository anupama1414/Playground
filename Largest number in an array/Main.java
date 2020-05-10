#include<stdio.h>
int main()
{
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
  //fill the code
  printf("%d",large);
  return 0;
}