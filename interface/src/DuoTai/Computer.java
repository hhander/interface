package DuoTai;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void installUsb(USB u)
    {
        u.connect();

        if(u instanceof KeyBoard)
        {
            KeyBoard k = (KeyBoard) u;
            k.keyDown();
        }
        else if(u instanceof Mouse)
        {
            Mouse m = (Mouse) u;
            m.click();
        }

        u.unConnect();
    }
}
