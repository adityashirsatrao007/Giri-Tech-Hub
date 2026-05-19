// Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.
class q7{
    public static void main(String args[]){
        int costPrice=100;
        int sellingPrice=200;
        if(sellingPrice>costPrice){
            System.out.println("Profit");
        }
        else{
            System.out.println("Loss");
        }
    }
}