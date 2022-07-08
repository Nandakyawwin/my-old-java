public class TreeStar {
        public static void main(String[] args) {
            int height = 5;
            for(int i=1;i<=height;i++){
                for(int space=i;space<=height-1;space++){
                    System.out.print("  ");
                }
                for(int star=1; star<=i; star++){
                    System.out.print(" *  ");
                }
                System.out.println();
            }
        }
}
