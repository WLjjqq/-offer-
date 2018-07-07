import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-7-5
 * BigDecimal 的加减乘除
 * add()   subtract()  multiply()  divide()
 */
public class Arith {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(20);
        BigDecimal b2 = new BigDecimal(10);
        BigDecimal add = b1.add(b2);
        System.out.println(add+"加法");
        BigDecimal subtract = b1.subtract(b2);
        System.out.println(subtract+"减少");
        BigDecimal multiply = b1.multiply(b2);
        System.out.println(multiply+"乘");
        BigDecimal divide = b1.divide(b2);
        System.out.println(divide+"除法");
    }
}
