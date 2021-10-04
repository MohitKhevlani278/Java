public class NestedTryBlock{
    public static void main(String[] args)
    {
        a();
    }
    static void a()
    {
        try {
            try {
                //First run this block
                System.out.println("Before division by zero");
                int i = 1;
                int j = 0;

                System.out.println(i/j);
                System.out.println("After division by zero");
            }
            catch (Exception e)
            {
                System.out.println("Inner catch block : " + e);
                throw e;
            }
            finally {
                System.out.println("Inner finally block");
            }
        }
        catch(Exception e)
        {
            System.out.println("Outer catch block");
        }
        finally
        {
            System.out.println("Outer finally block");
        }
    }
}