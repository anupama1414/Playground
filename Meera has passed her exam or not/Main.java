#include<iostream>
int main()
{
  // Type your code here
  int n, i, id, flag=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>id;
  for(i=0;i<n;i++)
  {
    if(a[i]==id)
     flag=1;
  }
  if(flag==1)
      std::cout<<"She passed her exam";
   else 
       std::cout<<"She failed";
  return 0;
}