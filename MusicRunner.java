class MusicRunner
{
public static void main(String[] args)
{
	String name="yehh jawani hai dewaani";
	String app="wink";
Music music=new Music(name,app);
music.type=MusicType.MOVIE;
music.language=MusicLanguage.KANNADA;
System.out.println(music.name);
System.out.println(music.app);
System.out.println(music.type);
System.out.println(music.language);
System.out.println(music.duration);


}
}