package DuoTai;

public class test {
    public static void main(String[] args) {
        Computer c = new Computer("华为");
        KeyBoard k = new KeyBoard("华为");
        Mouse m = new Mouse("罗技");
        c.installUsb(m);
    }



}


