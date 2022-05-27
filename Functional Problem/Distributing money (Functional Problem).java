public static int distributingMoney(long x, long y, long z, long K){
   //Enter your code here
   long a=(x>y)?(x>z?x:z):(y>z?y:z);
   K=K-(a-x)-(a-y)-(a-z);
   if(K>=0){
      if(K%3==0)return 1;
      else return 0;
      }
   else{
      return 0;
      }
}