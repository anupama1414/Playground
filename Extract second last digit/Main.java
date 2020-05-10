#include<stdio.h>
int main()
{
  //Type your code here
  int ip,a,b,c,d;
  scanf("%d",&ip);
  a=ip%10000;
  b=a%1000;
  c=b%100;
  d=c/10;
  printf("%d\n",d);
  return 0;
}