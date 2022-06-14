package DuoTai;

public class Mouse implements USB{
    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(this.name + "鼠标连接了电脑");
    }

    @Override
    public void unConnect() {
        System.out.println(this.name + "鼠标连接了电脑");
    }

    public void click()
    {
        System.out.println(name + "鼠标开始点击了");
    }


}
