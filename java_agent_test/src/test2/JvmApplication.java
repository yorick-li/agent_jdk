package test2;

import java.io.IOException;

public class JvmApplication {

    public static void main(String[] args) throws IOException {
        System.in.read();
        System.out.println(ObjectSizeIns2.sizeOf(new Object()));
    }

}
