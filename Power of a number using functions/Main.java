#include<stdio.h>
int main(){
    // Type your code here
  int n,m,i,r=1;
  scanf("%d%d",&n,&m);
  for(i=1;i<=m;i++)
  {
    r=r*n;
  }
  printf("%d",r);
  
  	return 0;
}