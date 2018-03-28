package junit.test;

import org.junit.Test;

public class JunitTest {

    // parent-project中dependencyManagement下的依赖不会被直接引用过来
    // 除非在自己项目的依赖中追加了其中指定的groupId以及artifactId
    @Test
    void junitTest() {
        System.out.println("I am ok~");
    }
}
