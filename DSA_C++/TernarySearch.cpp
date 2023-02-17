#include <iostream>
using namespace std;

int terSearch(int arr[], int l,int h,int x){
    
    int mid1=l+(h-l)/3;
    int mid2=h-(h-l)/3;
    
    while(l<h){
        if(arr[mid1]==x){
            return mid1;
        }
        if(arr[mid2]==x){
            return mid2;
        }
        if(x<arr[mid1]){
            return terSearch(arr,l,mid1-1,x);
        }
        else if(x>arr[mid2]){
            return terSearch(arr,mid2+1,h,x);
        }
        else{
            return terSearch(arr,mid1+1,mid2-1,x);
        }
        
    }
      
    
    return -1;
}



int main()
{
   int n;
   cin>>n;
   int a[n];
   for(int i=0;i<n;i++){
       cin>>a[i];
   }
   
   cout<<"Enter element want to search"<<endl;
   int x;
   cin>>x;
   int temp=terSearch(a,0,n-1,x);
   cout<<temp<<endl;
   
    return 0;
}
