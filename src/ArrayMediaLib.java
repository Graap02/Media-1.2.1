import java.lang.reflect.Array;

public class ArrayMediaLib {

    public static void main(String args[]) {

        String[] sharingFriends =
                {"Donald",
                        "Thaddeus",
                        "Skyler",
                        "Hunter",
                        "Nicolas"
                };
        for (int i = 0; i < sharingFriends.length; i++) {
            System.out.println(sharingFriends[i]);
        }
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        for (int val: daysBtwnPurchase)
        {
            total = total + val;
        }
        Song[] topTenSongs = {
                new Song("The Twist"),
                new Song("Smooth"),
                new Song("Mack the Knife"),
                new Song("How Do I Live"),
                new Song("Party Rock Anthem"),
                new Song("I gotta feeling"),
                new Song("Macarena"),
                new Song("Physical"),
                new Song("You Light Up My Life"),
                new Song("Hey Jude")
        };

        System.out.println("---------------");
            int count = 1;
            for (Song s: topTenSongs)
            {
                if (count % 3 == 0)
                { s.setPrice(.99);
                  System.out.println(s.getTitle() + " - Price: " + s.getPrice());
                }
                else {s.setPrice(1.29);
                System.out.println(s.getTitle() + " - Price: " + s.getPrice());

                }

            ++count;

            }


    }
}