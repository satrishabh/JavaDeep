package basi.pattern;
// patterns https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

class Pattern{
    public static void main(String[] args) {
        Pattern pattern=new Pattern();
        pattern.pattern1(5);
        pattern.pattern2(5);
        pattern.pattern3(5);
        pattern.pattern4(5);
        pattern.pattern5(5);
        pattern.pattern6(5);
        pattern.pattern7(5);
        pattern.pattern8(5);
        pattern.pattern9(5);
        pattern.pattern10(5);
        pattern.pattern11(5);
        pattern.pattern12(5);
        pattern.pattern13(5);
        pattern.pattern14(5);
        pattern.pattern15(5);
        pattern.pattern16(5);
        pattern.pattern17(5);
        pattern.pattern18(5);
        pattern.pattern19(5);
        pattern.pattern20(5);
        pattern.pattern21(5);
        pattern.pattern22(4);

    }
    private void pattern1(int n){
        System.out.println("---------Pattern 1---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private void pattern2(int n){
        System.out.println("---------Pattern 2---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void pattern3(int n){
        System.out.println("---------Pattern 3---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private void pattern4(int n){
        System.out.println("---------Pattern 4---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    private void pattern5(int n){
        System.out.println("---------Pattern 5---------");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void pattern6(int n){
        System.out.println("---------Pattern 6---------");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private void pattern7(int n){
        System.out.println("---------Pattern 7---------");
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            k+=2;
            System.out.println();
        }
    }
    private void pattern8(int n){
        System.out.println("---------Pattern 8---------");
        int k=n*2-1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            k-=2;
            System.out.println();
        }
    }
    private void pattern9(int n){
        System.out.println("---------Pattern 9---------");
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            k+=2;
            System.out.println();
        }
        k-=4;
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            k-=2;
            System.out.println();
        }
    }
    private void pattern10(int n){
        System.out.println("---------Pattern 10---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void pattern11(int n){
        System.out.println("---------Pattern 11---------");

        for(int i=1;i<=n;i++){
            int l=i;
            for(int j=1;j<=i;j++){
                if(l%2==0){
                    System.out.print("0");
                }else{  
                    System.out.print("1");
                }
                l++;
            }
            System.out.println();
        }
    }
    private void pattern12(int n){
        System.out.println("---------Pattern 12---------");
        int j;
        for(int i=4;i>=0;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i*2;k++){
                System.out.print(" ");
            }
            for(int l=j-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    private void pattern13(int n){
        System.out.println("---------Pattern 13---------");
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    private void pattern14(int n){
        System.out.println("---------Pattern 14---------");
        for(int i=65;i<=64+n;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)j);
            }
            
            System.out.println();
        }
    }
    private void pattern15(int n){
        System.out.println("---------Pattern 15---------");
        for(int i=64+n;i>=65;i--){
            for(int j=65;j<=i;j++){
                System.out.print((char)(j));
            }
            System.out.println();
        }
    }
    private void pattern16(int n){
        System.out.println("---------Pattern 16---------");
        for(int i=65;i<65+n;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
    private void pattern17(int n){
        System.out.println("---------Pattern 17---------");
        for(int i=65;i<65+n;i++){
            for(int j=65+n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=65;k<=i;k++){
                System.out.print((char)k);
            }
            for(int l=65;l<i;l++){
                System.out.print((char)l);
            }
            System.out.println();
        }
    }
    private void pattern18(int n){
        System.out.println("---------Pattern 18---------");
        int k=n;
        for(int i=65+n-1;i>=65;i--){
            for(int j=i;j<=65+k-1;j++){
                System.out.print((char)j);
            }
            System.out.println();
        
        }
    }
    private void pattern19(int n){
        System.out.println("---------Pattern 19---------");

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(5-i)-1;k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                if(l==n){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(5-i)-1;k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                if(l==n){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void pattern20(int n){
        System.out.println("---------Pattern 20---------");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(5-i)-1;k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                if(l==n){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(5-i)-1;k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void pattern21(int n){
        System.out.println("---------Pattern 21---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private void pattern22(int n){
        System.out.println("---------Pattern 22---------");

        // Outer loop for no. of rows
        for(int i=0;i<2*n-1;i++){
                
            // inner loop for no. of columns.
            for(int j=0;j<2*n-1;j++){
                
                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;
                
                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            
            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }
}