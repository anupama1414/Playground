#include <stdio.h>
int main() 
{
	//Type your code
  int n,onum,rem,s,r;
  scanf("%d",&n);
  onum=n;
  while(onum!=0)
  {rem=onum%10;
   s=rem*rem*rem;
   onum/=10;
   r=r+s;
  }
   if(r==n)
     printf("Armstrong Number");
  else 
    printf("Not an Armstrong Number");
	return 0;
}