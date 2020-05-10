#include <stdio.h>
int main()
{
	// Type your code here
  int n,num=0,i,j;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      num=num+1;
      if(num%2==0)
        printf("#");
      else 
        printf("*");
    }
    printf("\n");
  }
  	return 0;
}