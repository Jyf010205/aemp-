package command;

public class Client {
    public static void main(String[] args) {
        //需要一个遥控器
        RemoteController controller = new RemoteController();
        //创建电灯的对象(接受者)
        LightReceiver light = new LightReceiver();
        TVReceiver tv = new TVReceiver();

        //构建按钮
        controller.setCommands(0,new LightOnCommand(light),new LightOffCommand(light));
        controller.setCommands(1,new TVOnCommand(tv),new TVOffCommand(tv));


        controller.onButtonWasPushed(0);
        controller.offButtonWasPushed(1);
        controller.onUndoButton();
    }
}
