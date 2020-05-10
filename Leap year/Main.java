#include<stdio.h>
int main()
{
  //Type your code here
  int y;
  scanf("%d",&y);
   if(y%4==0)
   {
     if(y%100==0)
     {
       if(y%400==0)
       printf("Leap year\n");
       else
         printf("Not Leap year\n");
     }
     else
       printf("Leap year\n");
   }
  else
    printf("Not Leap year\n");
  return 0;
}