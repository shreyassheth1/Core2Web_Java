#include <stdio.h>
int main(int argc, char const *argv[])
{
	int x =10;
	printf(" %d\n",x<<4);
	int a = 53,b = 19;
	printf(" %d\n",a&b);
	a =23,b=77;
	printf(" %d\n",a|b);
	x =58;
	printf(" %d\n",x<<3);
	a=25;b=33;
	printf(" %d\n",a|b);
	x =95;
	printf(" %d\n",x<<2);
	x =18;
	printf(" %d\n",x<<5);
	return 0;
}