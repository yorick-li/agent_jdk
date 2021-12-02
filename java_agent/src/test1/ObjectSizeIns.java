package test1;

import java.lang.instrument.Instrumentation;

/**
 * 方式一：通过命令行参数 -javaagent: agent.jar的path
 *
 */
public class ObjectSizeIns {

    private static Instrumentation instrumentation;

    /**
     * 供jvm调用，vm参数形式的调用
     * @param agentArgs
     * @param inst
     */
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("agentArgs===>" + agentArgs);
        System.out.println("agentArgs===>" + inst);
        instrumentation = inst;
    }

    /**
     * 供jvm调用, 程序运行后在调用
     * @param agentArgs
     * @param inst
     */
    /*public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("agentArgs===>" + agentArgs);
        System.out.println("agentArgs===>" + inst);
        instrumentation = inst;
    }*/

    /**
     * 获取对象的大小
     * @param obj
     * @return
     */
    public static long sizeOf(Object obj) {
        return instrumentation.getObjectSize(obj);
    }

}
