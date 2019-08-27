#include <stdio.h>

int main()
{
int array[100], ele, c, n;
scanf("%d", &n);
for (c = 0; c < n; c++)
scanf("%d", &array[c]);

scanf("%d", &ele);
for(c = 0; c < n ; c++)
{
if(array[c] == ele)
{
printf("%d is present in the array",ele,c+1);
break;
}
}
if (c == n)
    printf("%d is not present in the array\n", ele);

return 0;
}