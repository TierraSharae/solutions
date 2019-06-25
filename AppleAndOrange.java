    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount = 0 ;
        int orangeCount = 0 ;

        for ( int apple : apples ) {
            if ((a + apple) >= s && (a + apple) <= t){
                appleCount++;
            }
        }
        for ( int orange : oranges ) {
            if ((b + orange) >= s && (b + orange) <= t){
                orangeCount++;
            }
        }

        System.out.println(appleCount + "\n" + orangeCount);
    }
