public class baitap {

    public static void main(String[] args) {

        // Test printSpaces
        printSpaces(4);
        System.out.println("");

        // Test right-leaning triangle
        printTriangle(4);

        // Test Christmas tree
        christmasTree(10);
    }

    // Phần 1: In ra số khoảng trắng
    public static void printSpaces(int number) {
        int i = 0;

        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    // Phần 2: Tam giác lệch phải
    public static void printTriangle(int size) {
        int i = 1;

        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    // Phần hỗ trợ: In số dấu *
    public static void printStars(int number) {
        int i = 0;

        while (i < number) {
            System.out.print("*");
            i++;
        }

        System.out.println("");
    }

    // Phần 3: Cây thông Noel
    public static void christmasTree(int height) {

        // Phần tam giác
        int i = 1;

        while (i <= height) {
            printSpaces(height - i);
            printStars(i + i - 1);
            i++;
        }

        // Phần thân cây
        i = 0;

        while (i < 2) {
            printSpaces(height - 1);
            printStars(3);
            i++;
        }
    }
}