package multithreadingTest.multithreading2;

public class User extends Thread {
    private Account account;

    //有参构造器
    public User(Account account, String user1) {
        this.account = account;
    }

    //重写run方法


            @Override
    public void run() {
        while(true) {
            //定义一个随机的钱的数量
                int money = 5000;

            try {
                //调用取钱的方法进行随机取钱
                account.wit2(money);
                //取完钱后睡眠会，让其他线程运行
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
    }

}
