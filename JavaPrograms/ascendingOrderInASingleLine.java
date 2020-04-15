class ascendingOrderInASingleLine
{
void main(int a,int b,int c)
{
System.out.println(((a<b)?((a<c)?a:c):((b<c)?b:c))+" "+((a!=((a<b)?((a<c)?a:c):((b<c)?b:c))&&a!=((a>b)?((a>c)?a:c):((b>c)?b:c)))?a:((b!=((a<b)?((a<c)?a:c):((b<c)?b:c))&&b!=((a>b)?((a>c)?a:c):((b>c)?b:c)))?b:c))+" "+((a>b)?((a>c)?a:c):((b>c)?b:c)));
}
}
