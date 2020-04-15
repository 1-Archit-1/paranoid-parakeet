class Binary_add
{
void main(boolean x[], boolean y[]){
int l = x.length;
boolean carry = false;
boolean sum[] = new boolean[l];
for(int i = l-1;i>=0;i--){
sum[i] = (x[i]^y[i])^carry;
carry = (x[i]&y[i])|(carry&x[i])|(carry&y[i]);
}
if(carry)
System.out.print("1");
for(int i=0;i<l;i++)
{
if(sum[i])
System.out.print("1");
else
System.out.print("0");
}
}
}