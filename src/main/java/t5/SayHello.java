package t5; /**
 * Created by apple on 17/4/20.
 */

public enum SayHello {


    ENGLISH("Hello", 1),
    JAPANESE("こんにちは。", 2),
    KOREAN("안녕하세요", 3),
    CHINESE("你好", 4);


    // 成员变量
    private String name;
    private int index;

    // 构造方法，注意：构造方法不能为public，因为enum并不可以被实例化
    SayHello(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (SayHello c : SayHello.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public void sayBye(String hello) {
        switch (hello) {
            case "ENGLISH":
                System.out.println(SayHello.ENGLISH+" -> bye");
                break;
            case "CHINESE":
                System.out.println(SayHello.CHINESE+" -> 再见");
                break;
            case "JAPANESE":
                System.out.println(SayHello.JAPANESE+" -> さようなら。");
                break;
            default:
                System.out.println(SayHello.KOREAN+" -> 안녕히 가세요.");
                break;
        }
    }

}

