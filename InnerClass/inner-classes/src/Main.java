public class Main {
    public static void main(String[] args) {
        InnerClassExample instance = new InnerClassExample(1);
    }
    static class InnerClassExample{
        int variable;

        public InnerClassExample(int variable) {
            this.variable = variable;
        }
    }

    public void testInnerClassInMethod(){}
     class MyClassInMethod {
        int value;
        String name;

        public MyClassInMethod(int value) {
            this.value = value;
        }
    }
    MyClassInMethod example = new MyClassInMethod(1);
}