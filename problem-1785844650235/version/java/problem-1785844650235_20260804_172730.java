// Last updated: 8/4/2026, 5:27:30 PM
1class Solution {
2    public String intToRoman(int num) {
3        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
4        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
5        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
6        String ths[]={"","M","MM","MMM"};
7        return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
8    }
9}