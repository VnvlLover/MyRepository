package examples2.InnerClassChallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlaylistService {
    public static void printMenu() {
        System.out.println("Choose options:" + "\n" +
                "\t" + "1. Print menu." + "\n" +
                "\t" + "2. Next song." + "\n" +
                "\t" + "3. Previous song." + "\n" +
                "\t" + "4. Replay song." + "\n" +
                "\t" + "5. Print song list." + "\n" +
                "\t" + "6. Remove song." + "\n" +
                "\t" + "7. Quit." + "\n");
    }

    public static void navigatePlaylist(LinkedList<Song> playlist) {
        ListIterator<Song> playlistIterator = playlist.listIterator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        printMenu();
        boolean flag = true;
        boolean goingForward = true;
        while (flag) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    if (!goingForward) {
                        if (playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        goingForward = true;
                    }
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty. Please add song to playlist.");
                        break;
                    }
                    if (playlistIterator.hasNext()) {
                        System.out.println(playlistIterator.next().toString());
                    } else {
                        System.out.println("You have reached to end of playlist.");
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty. Please add song to playlist.");
                        break;
                    }
                    if (playlistIterator.hasPrevious()) {
                        System.out.println(playlistIterator.previous().toString());

                    } else {
                        System.out.println("You have reached to beginning of playlist.");
                    }
                    break;

                case 4:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty. Please add song to playlist.");
                        break;
                    }
                    if (playlistIterator.hasPrevious()) {
                        playlistIterator.previous();
                        System.out.println(playlistIterator.next().toString());

                    } else if (playlistIterator.hasNext()) {
                        playlistIterator.next();
                        System.out.println(playlistIterator.previous().toString());
                    }
                    break;
                case 5:
                    int counter = 0;
                    while (playlist.size() > counter) {
                        System.out.println((counter + 1) + ". " + playlist.get(counter).toString());
                        counter++;
                    }
                    break;
                case 6:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty. Please add song to playlist.");
                        break;
                    }
                    int position = 0;
                    if (playlistIterator.hasPrevious()) {
                        if (playlistIterator.hasNext()) {
                            position = playlistIterator.nextIndex();
                        } else {
                            position = playlistIterator.previousIndex();
                        }
                    } else {
                        if (playlistIterator.hasNext()) {
                            position = playlistIterator.nextIndex();
                        }
                    }


                    System.out.println("Are you sure to remove song " + "\"" + playlist.get(position).getTitle() + "\"" + "\n" +
                            "Yes/No");
                    String decision = scanner.nextLine();
                    if (decision.toUpperCase().equals("YES")) {
                        playlistIterator.remove();
                        System.out.println("Removed");
                    } else if (decision.toUpperCase().equals("NO")) {
                        System.out.println("Not removing");
                    }
                    break;
                case 7:
                    System.out.println("Quiting");
                    flag = false;
                    break;
            }
        }
    }
}
