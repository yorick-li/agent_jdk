import test1.ObjectSizeIns;

/**
 * 方式一：通过vm参数：-javaagent:agent.jar的path
 */
public class TestObjectSize {

    public static void main(String[] args) {
        System.out.println(ObjectSizeIns.sizeOf(new Object()));
        System.out.println(ObjectSizeIns.sizeOf(new int[]{}));
    }

}
