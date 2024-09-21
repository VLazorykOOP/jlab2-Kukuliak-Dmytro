// Створити клас Math, у якому реалізувати пошук найбільшого спільного
// дільника та найменшого кратного двох натуральних чисел. На вхід програма
// отримує 2 цілих числа у командному рядку
public class Maths {
    private int a,b;
    public Maths(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int greatestCommonDivisor(){
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public int leastCommonMultiple(){
        return a * b / greatestCommonDivisor();
    }
}
