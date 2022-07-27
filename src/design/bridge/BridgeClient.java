package design.bridge;

/**
 * @Author: wzq
 * @Date: 2022/7/26
 * @Desc: 桥接模式客户端
 **/
public class BridgeClient {

    public static void main(String[] args) {
        //折叠的huawei手机
        AbstractPhone phone = new FoldedPhone(new Huawei());
        phone.open();
        phone.call();
        phone.close();

        //折叠的Oppo手机
        phone = new FoldedPhone(new Oppo());
        phone.open();
        phone.call();
        phone.close();

        //翻盖的huawei手机
        phone = new UpRightPhone(new Huawei());
        phone.open();
        phone.call();
        phone.close();

        //翻盖的oppo手机
        phone = new UpRightPhone(new Oppo());
        phone.open();
        phone.call();
        phone.close();
    }
}
