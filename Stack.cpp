#include<bits/stdc++.h>
using namespace std;

void solve(){
      int n;
      cout<<"number of elements of stack:";
      cin>>n;

      int Stack[n],top=-1;
      cout<<"pusing elements into stack: \n";

      for(int i=0;i<n;i++){
           int value;
           cout<<"Enter value "<<i+1 <<":";
           cin>>value;
           top++;
           Stack[top]=value;
      }

      cout<<"stack elements are: ";
      for(int i=top;i>=0;i--){
          cout<<Stack[i]<<" ";
      }
      cout<<endl;


      int m;
      cin>>m;
      cout<<"num of elements pop from satck\n";
      for(int i=0;i<m;i++){
           top--;
      }

      cout<<"after poping then satck :";
      for(int i=top;i>=0;i--){
             cout<<Stack[i]<<" ";
      }
      cout<<endl;

}


int main(){
    solve();
}

