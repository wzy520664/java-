package dp.memento;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Client {
    public static <AbstractCommand> void main(String a[])
    {
        UserInfoDTO user=new UserInfoDTO();
        Caretaker c=new Caretaker();      //创建负责人
        Command restoreCommand; // 创建撤销命令
        restoreCommand = new Command(user);
        Controller control = new Controller(restoreCommand); // 创建控制器

        user.setAccount("zhang");
        user.setPassword("123");
        user.setTelNo("13000000");
        System.out.println("状态1");
        user.show();
        c.setMemento(user.saveMemento());   // 保存备忘录
        System.out.println("---------");

        user.setPassword("111111");
        user.setTelNo("13100001111");
        System.out.println("状态二:");
        user.show();
        System.out.println("--------------------------");

        user.restoreMemento(c.getMemento());     // 从备忘录中恢复
        System.out.println("回到状态1");
        user.show();
        System.out.println("---------");
    }
}