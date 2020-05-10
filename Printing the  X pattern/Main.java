#include <stdio.h>
int main()
{
	// Type your code here
  int n,i,j,count;
  scanf("%d",&n);
  count=n;
  
  for(i=1;i<=count;i++)
  {
    for(j=1;j<=count;j++)
    {
      if(j==i||(j==count-i+1))
      {
        printf("*");
      }
      else
      {
        printf(" ");
      }
    }
    printf("\n");
  }
      
	return 0;
}