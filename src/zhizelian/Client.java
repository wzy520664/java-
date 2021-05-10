package zhizelian;

public class Client {
    public static void main(String args[])
    {
        Leader objDirector,objManager,objGeneralManager;
        objDirector=new Director("王明");
        objGeneralManager=new GeneralManager("里斯");
        objManager=new Manager("王五");
        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);

        LeaveRequest l1=new LeaveRequest("蜀",5);
        objDirector.handleRequest(l1);
        LeaveRequest l2=new LeaveRequest("梦",7);
        objDirector.handleRequest(l2);
        LeaveRequest l3=new LeaveRequest("张",15);
        objDirector.handleRequest(l3);
        LeaveRequest l4=new LeaveRequest("李",45);
        objDirector.handleRequest(l4);
    }
}

