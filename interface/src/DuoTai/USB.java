package DuoTai;

public interface USB {

    static void start()
    {
        System.out.println("启动了");
    }
    void connect();
    void unConnect();
}
