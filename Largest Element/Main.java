#include<stdio.h>
#define MAX 100

int getMaxElement(int []);
int size;

int main(){

    int arr[MAX],max,i;
    scanf("%d",&size);
    for(i=0;i<size;i++)
      scanf("%d",&arr[i]);
    max=getMaxElement(arr);
    printf("%d",max);
    return 0;
}

int getMaxElement(int arr[]){

    static int i=0,max =-9999;

    if(i < size){
         if(max<arr[i])
           max=arr[i];
      i++;
      getMaxElement(arr);
    }

    return max;
}