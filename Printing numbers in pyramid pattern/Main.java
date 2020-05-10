#include <stdio.h>
int main()
{
	// Type your code here
   int n,i,j,s,num=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(s=1;s<=(n-i);s++)
    {  printf(" ");  }
    for(j=1;j<=i;j++)
    { 
      
      { 
        num=num+1;
        printf("%d ",num);
      }
    }
    printf("\n");
  }
      
       
	return 0;
}