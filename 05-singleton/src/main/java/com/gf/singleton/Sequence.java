package com.gf.singleton;

public class Sequence {

    private String name;

    private Sequence() {

    }

    private static volatile Sequence instance;

    /**
     * 双重检查锁定（DCL，Double-Checked Locking）
     * Java 对象实例化过程并不是原子操作，大致分三步：
     * 1.分配内存空间
     * 2.初始化对象
     * 3.将对象引用赋值给变量
     * 如果没有 volatile，可能发生指令重排，线程 A 执行到步骤 3 还没执行完步骤 2，线程 B 就能看到 instance != null，但访问到的是未初始化的对象，造成隐患。
     */
    public static Sequence getInstance() {
        if (instance == null) {
            synchronized (Sequence.class) {
                if (instance == null) {
                    instance = new Sequence();
                }
            }
        }
        return instance;
    }


    /**
     * 静态内部类实现 推荐
     */
    public static class SingletonHolder {
        private static final Sequence INSTANCE = new Sequence();
    }

    public static Sequence getInstance2() {
        return SingletonHolder.INSTANCE;
    }

}
