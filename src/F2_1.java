public class F2_1 {
    public F2_1(){ //コンストラクタ

    }

    public static void main(String[] args) {
        method1();
        F2_1 f = new F2_1();
        f.method2();
    }

    public static void method1(){
        System.out.println("クラスメソッドが呼び出されました。");
    }

    public static void method2(){
        System.out.println("クラスメソッドが呼ばれました。");
    }
}
