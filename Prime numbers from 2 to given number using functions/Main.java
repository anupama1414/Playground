#include<stdio.h>
void main(){
    // Type your code here
  int n,i,j,fact;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    fact=0;
     for(j=1;j<=n;j++)
     {
       if(i%j==0)
         fact++;
     }
    if(fact==2)
      printf("%d\n",i);
  }

    
}