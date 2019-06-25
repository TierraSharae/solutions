/*
The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n.
*/

    static void staircase(int n) {

        int spaces = n-1;
        int hashes = 1;

    while (spaces >= 0){
        for (int i = spaces ; i > 0 ; i--){
            System.out.print(" ");
        }
        for (int j = 0 ; j < hashes ; j++){
                System.out.print("#");
        }

    System.out.println("");
    spaces--;
    hashes++;
      }
    }
