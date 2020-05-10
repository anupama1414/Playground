#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {  scanf("%d",&a[i]);  }
  int current;
  for(int j=0;j<(n-1);j++)
  {
    if(a[j]==0)
    {
      current=j;
      break;
    }
  }
  int pos=current;
  while(current<n)
  {
    if(a[current]!=0&&current!=pos)
    {
      a[pos]=a[current];
      ++pos;
    }
    ++current;
  }
  while(pos<n)
  {
    a[pos]=0;
    ++pos;
  }
  for(i=0;i<n;i++)
    printf("%d ",a[i]);
  
  //Type your code here
  return 0;
}