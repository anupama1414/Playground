#include<iostream>
int main()
{
    int r, c, i,j;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {  std::cin>>a[i][j];  }       
   
  }
 // int temp = r, r=c, c=temp;
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {  std::cout<<a[j][i]<<" ";  }       
   std::cout<<"\n";
  }
  return 0;
}