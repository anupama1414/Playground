/*#include<iostream>
#include<string.h>

using namespace std; 
int main()
{
	
	char str[30], temp;
	int i=0, j;
	std::cin.getline(str,30);
	j=strlen(str)-1;
	while(i<j)
	{
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		i++;
		j--;
	}
	cout<<str;
	return 0;
}*/
#include<iostream>
//#include<stdio.h>
#include<string.h>
 
int main()
{
	char a[50],temp;
	int i,j,len;
	
	std::cin.getline(a,50);
	len=strlen(a);
 
	for(i=0,j=len-1;i<len/2;++i,--j)
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
 
	std::cout<<a;
	return 0;
}
