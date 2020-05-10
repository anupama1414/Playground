#include <stdio.h>
int main() 
{
	//Type your code
  int n,sum=0,firstD,lastD;
  scanf("%d",&n);
  lastD=n%10;
  firstD=n;
  while(n>=10)
  {
    n=n/10;
  }
  firstD=n;
  sum=firstD+lastD;
  printf("%d",sum);
	return 0;
}