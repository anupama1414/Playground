#include <stdio.h>
int main() 
{
	//Type your code
  int n,second=0,secondD;
  scanf("%d",&n);
  while(n>=100)
  {
    n=n/10;
  }
  second=n;
  secondD=n%10;
  
    printf("%d",secondD);
	return 0;
}