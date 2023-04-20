

#include <iostream>

using namespace std;

int main()
{
  int n;
  cin>>n;
  
  int dp[n+1];
  dp[0]=1;
  
  for(int i=1;i<n;i++){
      dp[i]=dp[i-1]+(i+1);
      
  }

for(int i=0;i<n;i++){
    cout<<dp[i]<<" ";
}

    return 0;
}
