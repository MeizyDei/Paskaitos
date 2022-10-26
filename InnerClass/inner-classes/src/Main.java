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
}