public class pattern {
    static void square(int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void righttri(int n){
        for (int i = n-1; i >=1; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pyr(int n){
        for (int i = n; i >=0; i--) {
            for (int j = i; j <n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void numbertru(int n){
        for (int i = n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void flyod(int n){
        int num=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
    static void pascal(int n) {
        for (int line = 0; line < n; line++) {
            for (int space = 0; space < n - line; space++) System.out.print(" ");
            int num = 1;
            for (int i = 0; i <= line; i++) {
                System.out.print(num + " ");
                num = num * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pascal(5);
    }
}
