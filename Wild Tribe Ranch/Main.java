#include <iostream>
int main()
{
  int FWeight, MaxWeight;
  std::cin>>MaxWeight>>FWeight;
  if(MaxWeight>FWeight)
    std::cout<<"Yes, you can enter.";
  else if(MaxWeight==FWeight)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}