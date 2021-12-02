package test2;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

/**
 * 方式二：jvm启动后，使用 agent.jar
 *
 *  需要借助 Attach Tools API
 *  使用 com.sun.tools.attach 包下的 VirtualMachine 类
 *
 *  启动 agent.jar 程序
 *
 */
public class AgentStartupApplication {

    public static void main(String[] args) throws IOException, AttachNotSupportedException, AgentLoadException, AgentInitializationException {

        VirtualMachine vm = VirtualMachine.attach("11712");
        // 加载 agent.jar
        vm.loadAgent("D:\\IT_Project\\learn\\java_agent\\java_agent.jar");
//        System.out.println(ObjectSizeIns2.sizeOf(new Object()));
        System.out.println(vm.getAgentProperties());
        System.in.read();
        vm.detach();

    }

}
