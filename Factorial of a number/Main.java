#include <stdio.h>
int main() 
{
	//Type your code
  int n,i,r=1;
  scanf("%d",&n);
  for(i=1;i<=n;++i)
  {
    r=r*i;
  }
  printf("%d",r);
	return 0;
}