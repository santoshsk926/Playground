#include<stdio.h>
#define N 3

int check_lower_triangular_matrix(int mat[N][N])
{
int i, j;
for (i = 0; i < N; i++)
for (j = i + 1; j < N; j++)
if (mat[i][j] != 0)
return 0;
return 1;
}

int main()
{
int mat[N][N];
int i, j;
for(i = 0; i < N; i++)
{
for(j = 0; j < N; j++)
{
scanf("%d",&mat[i][j]);
}
}

if (check_lower_triangular_matrix(mat))
printf("Lower triangular matrix");
else
printf("Not a Lower Triangular Matrix");
return 0;
}