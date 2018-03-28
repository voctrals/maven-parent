package test;

public class JunitTest {

    // parent-project中dependencyManagement下的依赖不会被直接引用过来
    // @Test
    void junitTest() {
        System.out.println("I am not ok~");
    }
}
