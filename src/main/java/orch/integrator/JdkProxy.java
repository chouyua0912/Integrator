package orch.integrator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {

    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxied..");
        Object obj = null;
        try {
            method.invoke(target, args);
        } catch (Exception ex) {

        }
        return obj;
    }
}
