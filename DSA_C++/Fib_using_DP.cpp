

#include <iostream>

using namespace std;

int main()
{
  int n;
  cin>>n;
  
 int dp[n+2];
    
            dp[0]=0,dp[1]=1;
    
    for(int i=2;i<n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    
    for(int i=0;i<n;i++)
        cout<<dp[i]<<" ";
  
    return 0;
}