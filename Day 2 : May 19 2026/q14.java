// Q.14Calculate commission based on sales amount:
// Input: Sales amount
// Logic:
// Sales < 5000 → 2% commission
// Sales 5000–10000 → 5% commission
// Sales > 10000 → 10% commission
// Output: Display commission amount.
class q14{
    public static void main(String args[]){
        int sales=12000;
        if(sales<5000){
            int commission=sales*2/100;
            System.out.println("Commission: "+commission);
        }else if(sales>=5000 && sales<=10000){
            int commission=sales*5/100;
            System.out.println("Commission: "+commission);
        }else{
            int commission=sales*10/100;
            System.out.println("Commission: "+commission);
        }
    }
}