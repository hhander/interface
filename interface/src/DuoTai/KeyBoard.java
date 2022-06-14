package DuoTai;

public class KeyBoard implements USB {

    private String name;

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(this.name + "键盘连接了电脑");
    }

    @Override
    public void unConnect() {
        System.out.println(this.name + "拔出了键盘");
    }

    public void keyDown()
    {
        System.out.println(this.name + "键盘开始敲击了");
    }
}
