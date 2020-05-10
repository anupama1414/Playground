#include <stdio.h>
int main() 
{
	//Type your code
  int i,n,onum,lastDigit,sum=0;
  long fact;
  scanf("%d",&n);
  onum=n;
  while(n>0)
  {lastDigit=n%10;
   fact=1;
   for(i=1;i<=lastDigit;i++)
   {
      fact=fact*i;
   }
   sum=sum+fact;
   n=n/10;
  }
  if(sum==onum)
   printf("Yes");
   else 
     printf("No");
     
	return 0;
}