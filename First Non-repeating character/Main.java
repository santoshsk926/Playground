#include<stdio.h>
int main()
{
    char s[40],t;
    int i,j,c[40],l=0;
    scanf("%s",s);
    while(s[l]!='\0')
    {
        c[l]=1;
        l=l+1;
    }
    for(i=0;i<(l-1);i++)
    {
        if(c[i]==0)
        {
            continue;
        }
        for(j=(i+1);j<(l);j++)
        {
            if(s[i]==s[j])
            {
                c[i]=c[i]+1;
                c[j]=0;
            }
        }
    }
    i=0;
    while(s[i]!='\0')
    {
        if(c[i]==1)
        {
            printf("%c \n",s[i]);
            return 0;
        }
        i++;
    }
    printf("All the characters are repetitive");
    return 0;
}