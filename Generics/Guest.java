class Guest
{
    public static void main(String[] args) {
        Glass g = new Glass();
        Juice j = new Juice();
        g.liquid = j;


        //retrive

        Juice juice = g.liquid; 

    }
}