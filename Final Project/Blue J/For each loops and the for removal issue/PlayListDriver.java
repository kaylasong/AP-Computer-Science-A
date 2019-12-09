public class PlayListDriver
{
    public static void main()
    {
        PlayList mysongs=new PlayList();
        mysongs.add(new Song("Metallica","Master of Puppets",8.23));
        mysongs.add(new Song("Pantera","Floods",5.0));
        mysongs.add(new Song("Eminem","Almost Famous",4.5));
        System.out.println(mysongs);
        mysongs.shuffle();
        System.out.println(mysongs);
        System.out.println(mysongs.numberOfSongs());
        System.out.println(mysongs.totalLength());
        System.out.println(mysongs.playSong());
        System.out.println(mysongs);
        mysongs.removeLength(4.99999);
        System.out.println(mysongs);
    }
}