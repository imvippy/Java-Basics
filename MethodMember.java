
class MethodMember
{
    public static void main(String[] args) {        
        AddingMethod.add(5, 5);
    }
}

class AddingMethod
{
    static void add(int i, int j)
    {
        System.out.println("Addition of two Numbers");
        int sum = i + j;
        System.out.println("Sum of i "+i+" and j "+j+" = "+sum);
    }
}