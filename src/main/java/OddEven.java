public class OddEven {

    /* 1. В классе OddEven создать алгоритм oddEven(), который принимает на вход
     * целое число, возвращает “Odd”,  если число нечетное, и “Even”, если число
     * четное.
     */
    public String oddEven(int a) {
        if(a % 2 == 0) {
            return "Even";

        } else {
            return "Odd";

        }
    }
}
