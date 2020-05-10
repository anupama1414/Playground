#include<stdio.h>
int square(int n);

int main() 
{
   // Type your code here
  int n,ans;
  scanf("%d",&n);
  ans = square(n);
  printf("%d",ans);
   return 0;
}
int square(int n)
{
  return(n*n);
}