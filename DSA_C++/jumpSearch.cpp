/*
The complexity of Jump Search Technique
Time Complexity: O(√n)
Space Complexity: O(1)
*/
#include <bits/stdc++.h>
using namespace std;

int jmpSearch(int arr[],int n,int x){
    
    int start=0,end=sqrt(n);
    
    
    while(arr[end]<=x){
        if(end>n)
         break;
    
    start=end;
    end+=sqrt(n);
    
    if(end>n-1){
      return -1;
    }
}

for(int i=start;i<end;i++){
    if(arr[i]==x){
        return i;
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
   int temp=jmpSearch(a,n,x);
   if(temp==-1){
        cout<<"Element not found :(";
   }
   else{
       
   cout<<"Element found at position "<<temp+1<<endl;
   }
   
    return 0;
}
