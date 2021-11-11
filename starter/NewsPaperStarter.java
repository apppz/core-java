package xworkz.com.methodoverriding.starter;

import xworkz.com.methodoverriding.NewsPaper;

public class NewsPaperStarter {

	public static void main(String[] args) {
		
		NewsPaper news=new NewsPaper();
		System.out.println(news);
		System.out.println(news.hashCode());
		System.out.println(System.identityHashCode(news));
		
		NewsPaper news2=new NewsPaper();
		System.out.println(news2);
		System.out.println(news2.hashCode());
		System.out.println(System.identityHashCode(news2));
		
		news.setName("bangude");
		news.setName("boothai");
		boolean equal=news.equals(news);
		System.out.println(equal);
		
		
		

	}

}
