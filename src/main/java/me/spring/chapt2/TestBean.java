package me.spring.chapt2;

/**
 * Hello world!
 *
 */
public class TestBean
{


    private TestBean testBean;
    public void hello()
    {
        System.out.println( "Hello World!" );
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }

    public TestBean getTestBean() {
        return testBean;
    }
}
