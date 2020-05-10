#include <iostream>
int main()
{
  int stones;
  std::cin>>stones;
  if(stones%2==0)
    std::cout<<"Possible";
  else
    std::cout<<"Not possible";
}