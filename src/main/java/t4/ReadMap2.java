package t4;

/**
 * Created by apple on 17/4/20.
 * <p>
 * 参数:a_b_c_d_e_f_g
 * 返回:a b c d e f g
 * 读取Map
 */
public class ReadMap2 {

    public static void main(String[] args) {
        for (String arg : args) {
            String[] splits = arg.split("_");
            for (String split : splits) {
                System.out.print(split + split.length() + "");
                System.out.print(" ");
            }

        }

    }
}
