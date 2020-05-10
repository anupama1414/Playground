#include <stdio.h>
int main()
{
    // Type your code here
  int n,i,j,num;
  scanf("%d",&n);
  
   for(i=1;i<=n;i++)
   {
     for(j=1;j<=(i-(i-1));j++)
     {
       
       for(num=n-(i-1);num>0;num--)
       printf("%d",num);
       
     }
     printf("\n");
   }
	return 0;
}