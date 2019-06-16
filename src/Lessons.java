import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lessons
{
	/*
	public static Lesson getLevelOneLessonOne()
	{
		ArrayList<Word> levelOneLessonOneList = new ArrayList<Word>();
		levelOneLessonOneList.add(new Word("I", "ben"));
		levelOneLessonOneList.add(new Word("you", "sen"));
		levelOneLessonOneList.add(new Word("he", "o"));
		levelOneLessonOneList.add(new Word("us", "biz"));
		levelOneLessonOneList.add(new Word("you", "siz"));
		levelOneLessonOneList.add(new Word("they", "onlar"));
		levelOneLessonOneList.add(new Word("man", "adam"));
		levelOneLessonOneList.add(new Word("man", "erkek"));
		levelOneLessonOneList.add(new Word("woman", "kadın"));
		levelOneLessonOneList.add(new Word("boy", "oğlan"));
		levelOneLessonOneList.add(new Word("girl", "kız"));
		levelOneLessonOneList.add(new Word("yes", "evet")); 
		levelOneLessonOneList.add(new Word("no", "hayır"));
		Lesson levelOneLessonOne = new Lesson(levelOneLessonOneList);
		return levelOneLessonOne;
	}
	
	public static Lesson getLevelOneLessonTwo()
	{
		ArrayList<Word> levelOneLessonTwoList = new ArrayList<Word>();
		levelOneLessonTwoList.add(new Word("hello", "merhaba"));
		levelOneLessonTwoList.add(new Word("good bye", "hoşça kal"));
		levelOneLessonTwoList.add(new Word("see you", "görüşürüz"));
		levelOneLessonTwoList.add(new Word("how are you", "nasılsın"));
		levelOneLessonTwoList.add(new Word("nice to meet you", "memnun oldum"));
		levelOneLessonTwoList.add(new Word("please", "lütfen"));
		levelOneLessonTwoList.add(new Word("thank you", "teşekkür ederim"));
		levelOneLessonTwoList.add(new Word("you're welcome", "rica ederim"));
		levelOneLessonTwoList.add(new Word("thanks", "teşekkürler"));
		levelOneLessonTwoList.add(new Word("excuse me", "affedersin"));
		levelOneLessonTwoList.add(new Word("sorry", "pardon"));
		levelOneLessonTwoList.add(new Word("welcome", "hoş geliniz"));
		levelOneLessonTwoList.add(new Word("reply to welcome", "hoş bulduk"));
		levelOneLessonTwoList.add(new Word("bon appetit", "afiyet olsun"));
		levelOneLessonTwoList.add(new Word("good morning", "günaydın"));
		levelOneLessonTwoList.add(new Word("good evening", "iyi akşamlar"));
		levelOneLessonTwoList.add(new Word("good night", "iyi geceler"));
		levelOneLessonTwoList.add(new Word("good luck", "iyi şanslar"));
		Lesson levelOneLessonTwo = new Lesson(levelOneLessonTwoList);
		return levelOneLessonTwo;
	}
		
	public static Lesson getLevelOneLessonThree()
	{
		ArrayList<Word> levelOneLessonThreeList = new ArrayList<Word>();
		levelOneLessonThreeList.add(new Word("number", "sayı"));
		levelOneLessonThreeList.add(new Word("zero", "sıfır"));
		levelOneLessonThreeList.add(new Word("one", "bir"));
		levelOneLessonThreeList.add(new Word("two", "iki"));
		levelOneLessonThreeList.add(new Word("three", "üç"));
		levelOneLessonThreeList.add(new Word("four", "dört"));
		levelOneLessonThreeList.add(new Word("five", "beş"));
		levelOneLessonThreeList.add(new Word("six", "altı"));
		levelOneLessonThreeList.add(new Word("seven", "yedi"));
		levelOneLessonThreeList.add(new Word("eight", "sekiz"));
		levelOneLessonThreeList.add(new Word("nine", "dokuz"));
		levelOneLessonThreeList.add(new Word("ten", "on"));
		levelOneLessonThreeList.add(new Word("eleven", "on bir"));
		levelOneLessonThreeList.add(new Word("fifty two", "elli iki"));
		levelOneLessonThreeList.add(new Word("twenty three", "yirmi üç"));
		levelOneLessonThreeList.add(new Word("forty four", "kırk üç"));
		levelOneLessonThreeList.add(new Word("seventy five", "yetmiş beş"));
		levelOneLessonThreeList.add(new Word("thirty six", "otuz altı"));
		levelOneLessonThreeList.add(new Word("eighty seven", "seksen yedi"));
		levelOneLessonThreeList.add(new Word("sixty eight", "altmış sekiz"));
		levelOneLessonThreeList.add(new Word("ninety nine", "doksan dokuz"));
		levelOneLessonThreeList.add(new Word("one hundred sixty three", "yüz altmış üç"));
		levelOneLessonThreeList.add(new Word("one thousand", "bin"));
		levelOneLessonThreeList.add(new Word("one million", "milyon"));
		Lesson levelOneLessonThree = new Lesson(levelOneLessonThreeList);
		return levelOneLessonThree;
	}
	
	public static Lesson getLevelOneLessonFour()
	{
		ArrayList<Word> levelOneLessonFourList = new ArrayList<Word>();
		levelOneLessonFourList.add(new Word("colour", "renk"));
		levelOneLessonFourList.add(new Word("red", "kırmızı"));
		levelOneLessonFourList.add(new Word("yellow", "sarı"));
		levelOneLessonFourList.add(new Word("blue", "mavi"));
		levelOneLessonFourList.add(new Word("orange", "turuncu"));
		levelOneLessonFourList.add(new Word("green", "yeşil"));
		levelOneLessonFourList.add(new Word("purple", "mor"));
		levelOneLessonFourList.add(new Word("white", "beyaz"));
		levelOneLessonFourList.add(new Word("black", "siyah"));
		levelOneLessonFourList.add(new Word("grey", "gri"));
		levelOneLessonFourList.add(new Word("navy", "lacivert"));
		levelOneLessonFourList.add(new Word("brown", "kahverengi"));
		levelOneLessonFourList.add(new Word("pink", "pembe"));
		levelOneLessonFourList.add(new Word("rainbow", "gökuşağı"));
		levelOneLessonFourList.add(new Word("colourful", "rengarenk"));
		Lesson levelOneLessonFour = new Lesson(levelOneLessonFourList);
		return levelOneLessonFour;
	}
		
	public static Lesson getLevelOneLessonFive()
	{
		ArrayList<Word> levelOneLessonFiveList = new ArrayList<Word>();
		levelOneLessonFiveList.add(new Word("animal", "hayvan"));
		levelOneLessonFiveList.add(new Word("cat", "kedi"));
		levelOneLessonFiveList.add(new Word("dog", "köpek"));
		levelOneLessonFiveList.add(new Word("bird", "kuş"));
		levelOneLessonFiveList.add(new Word("fish", "balık"));
		levelOneLessonFiveList.add(new Word("duck", "ördek"));
		levelOneLessonFiveList.add(new Word("bear", "ayı"));
		levelOneLessonFiveList.add(new Word("rabbit", "tavşan"));
		levelOneLessonFiveList.add(new Word("lion", "aslan"));
		levelOneLessonFiveList.add(new Word("monkey", "maymun"));
		levelOneLessonFiveList.add(new Word("squirrel", "sincap"));
		levelOneLessonFiveList.add(new Word("snake", "yılan"));
		levelOneLessonFiveList.add(new Word("jellyfish", "denızanası"));
		levelOneLessonFiveList.add(new Word("mouse", "fare"));
		levelOneLessonFiveList.add(new Word("elephant", "fıl"));
		levelOneLessonFiveList.add(new Word("pig", "domuz"));
		levelOneLessonFiveList.add(new Word("sheep", "koyun"));
		levelOneLessonFiveList.add(new Word("chicken", "tavuk"));
		levelOneLessonFiveList.add(new Word("owl", "baykuş"));
		levelOneLessonFiveList.add(new Word("turtle", "kuplumbağa"));
		levelOneLessonFiveList.add(new Word("horse", "at"));
		levelOneLessonFiveList.add(new Word("spider", "örümcek"));
		Lesson levelOneLessonFive = new Lesson(levelOneLessonFiveList);
		return levelOneLessonFive;
	}
		
	public static Lesson getLevelOneLessonSix()	
	{
		ArrayList<Word> levelOneLessonSixList = new ArrayList<Word>();
		levelOneLessonSixList.add(new Word("fruit", "meyve"));
		levelOneLessonSixList.add(new Word("apple", "elma"));
		levelOneLessonSixList.add(new Word("banana", "muz"));
		levelOneLessonSixList.add(new Word("pear", "armut"));
		levelOneLessonSixList.add(new Word("cherry", "kiraz"));
		levelOneLessonSixList.add(new Word("strawberry", "çilek"));
		levelOneLessonSixList.add(new Word("lemon", "limon"));
		levelOneLessonSixList.add(new Word("orange", "portakal"));
		levelOneLessonSixList.add(new Word("grape", "üzüm"));
		levelOneLessonSixList.add(new Word("watermelon", "karpuz"));
		levelOneLessonSixList.add(new Word("fig", "incir"));
		levelOneLessonSixList.add(new Word("vegetable", "sebze"));
		levelOneLessonSixList.add(new Word("spinach", "ispanak"));
		levelOneLessonSixList.add(new Word("eggplant", "patlıcan"));
		levelOneLessonSixList.add(new Word("mushrooms", "mantar"));
		levelOneLessonSixList.add(new Word("garlic", "sarımsak"));
		levelOneLessonSixList.add(new Word("artichoke", "enginar"));
		levelOneLessonSixList.add(new Word("olive", "zeytin"));
		levelOneLessonSixList.add(new Word("tomato", "domates"));
		levelOneLessonSixList.add(new Word("potato", "patates"));
		levelOneLessonSixList.add(new Word("pepper", "biber"));
		levelOneLessonSixList.add(new Word("milk", "süt"));
		levelOneLessonSixList.add(new Word("water", "su"));
		levelOneLessonSixList.add(new Word("bread", "ekmek"));
		levelOneLessonSixList.add(new Word("ice cream", "dondurma"));
		levelOneLessonSixList.add(new Word("meat", "et"));
		levelOneLessonSixList.add(new Word("coffee", "kahve"));
		levelOneLessonSixList.add(new Word("tea", "çay"));
		levelOneLessonSixList.add(new Word("cake", "pasta"));
		levelOneLessonSixList.add(new Word("pasta", "makarna"));
		levelOneLessonSixList.add(new Word("rice", "pilav"));
		Lesson levelOneLessonSix = new Lesson(levelOneLessonSixList);
		return levelOneLessonSix;
	}
	
	public static Lesson getLevelTwoLessonOne()
	{
		ArrayList<Word> levelTwoLessonOneList = new ArrayList<Word>();
		levelTwoLessonOneList.add(new Word("good", "iyi"));
		levelTwoLessonOneList.add(new Word("bad", "kötü"));
		levelTwoLessonOneList.add(new Word("delicious", "lezzetli"));
		levelTwoLessonOneList.add(new Word("hot", "sıcak"));
		levelTwoLessonOneList.add(new Word("cold", "soğuk"));
		levelTwoLessonOneList.add(new Word("smooth", "pürüzsüz"));
		levelTwoLessonOneList.add(new Word("sharp", "keskin"));
		levelTwoLessonOneList.add(new Word("strong", "kuvvetli"));
		levelTwoLessonOneList.add(new Word("weak", "kuvvetsiz"));
		levelTwoLessonOneList.add(new Word("heavy", "ağır"));
		levelTwoLessonOneList.add(new Word("light", "hafif"));
		levelTwoLessonOneList.add(new Word("big", "büyük"));
		levelTwoLessonOneList.add(new Word("small", "küçük"));
		levelTwoLessonOneList.add(new Word("empty", "boş"));
		levelTwoLessonOneList.add(new Word("hungry", "aç"));
		levelTwoLessonOneList.add(new Word("full", "tok"));
		levelTwoLessonOneList.add(new Word("happy", "mutlu"));
		levelTwoLessonOneList.add(new Word("sad", "üzgün"));
		levelTwoLessonOneList.add(new Word("angry", "kızgın"));
		levelTwoLessonOneList.add(new Word("tired", "yorgun"));
		levelTwoLessonOneList.add(new Word("fast", "çabuk"));
		levelTwoLessonOneList.add(new Word("slow", "yavaş"));
		levelTwoLessonOneList.add(new Word("clean", "temiz"));
		levelTwoLessonOneList.add(new Word("dirty", "bulanık"));
		levelTwoLessonOneList.add(new Word("young", "genç"));
		levelTwoLessonOneList.add(new Word("old", "yaşlı"));
		levelTwoLessonOneList.add(new Word("smart", "akıllı"));
		levelTwoLessonOneList.add(new Word("handsome", "yakışıklı"));
		levelTwoLessonOneList.add(new Word("ugly", "çirkin"));
		levelTwoLessonOneList.add(new Word("helpful", "yardımsever"));
		levelTwoLessonOneList.add(new Word("simple", "sade"));
		Lesson levelTwoLessonOne = new Lesson(levelTwoLessonOneList);
		return levelTwoLessonOne;
	}
	
	public static Lesson getLevelTwoLessonTwo()
	{
		ArrayList<Word> levelTwoLessonTwoList = new ArrayList<Word>();
		levelTwoLessonTwoList.add(new Word("you are handsome", "yakışıklısın"));
		levelTwoLessonTwoList.add(new Word("they are angry", "kızgınlar"));
		levelTwoLessonTwoList.add(new Word("we are happy", "mutluyuz"));
		levelTwoLessonTwoList.add(new Word("I am helpful", "yardımseverim"));
		levelTwoLessonTwoList.add(new Word("you are young", "gençsiniz"));
		levelTwoLessonTwoList.add(new Word("he is smart", "akıllı"));
		levelTwoLessonTwoList.add(new Word("we are big", "büyüküz"));
		levelTwoLessonTwoList.add(new Word("it is smooth", "pürüzsüz"));
		levelTwoLessonTwoList.add(new Word("you are weak", "kuvvetsizsin"));
		levelTwoLessonTwoList.add(new Word("I am old", "yaşlıyım"));
		levelTwoLessonTwoList.add(new Word("I am clean", "temizim"));
		levelTwoLessonTwoList.add(new Word("I am good", "iyim"));
		levelTwoLessonTwoList.add(new Word("It is delicious", "lezzetli"));
		levelTwoLessonTwoList.add(new Word("We are hungry", "açız"));
		levelTwoLessonTwoList.add(new Word("you are tired", "yorgunsun"));
		Lesson levelTwoLessonTwo = new Lesson(levelTwoLessonTwoList);
		return levelTwoLessonTwo;
	}
		
	public static Lesson getLevelTwoLessonThree()	
	{
		ArrayList<Word> levelTwoLessonThreeList = new ArrayList<Word>();
		levelTwoLessonThreeList.add(new Word("he is walking", "yürüyor"));
		levelTwoLessonThreeList.add(new Word("we are running", "koşuyoruz"));
		levelTwoLessonThreeList.add(new Word("you are eating", "yiyorsunuz"));
		levelTwoLessonThreeList.add(new Word("I am drinking", "içiyorum"));
		levelTwoLessonThreeList.add(new Word("they are reading", "okuyorlar"));
		levelTwoLessonThreeList.add(new Word("you are writing", "yazıyorsun"));
		levelTwoLessonThreeList.add(new Word("I am seeing", "görüyorum"));
		levelTwoLessonThreeList.add(new Word("I am smelling", "kokluyorum"));
		levelTwoLessonThreeList.add(new Word("he is saying", "diyor"));
		levelTwoLessonThreeList.add(new Word("we are listening", "dinliyoruz"));
		Lesson levelTwoLessonThree = new Lesson(levelTwoLessonThreeList);
		return levelTwoLessonThree;
	}
		
	public static Lesson getLevelTwoLessonFour()	
	{
		ArrayList<Word> levelTwoLessonFourList = new ArrayList<Word>();
		levelTwoLessonFourList.add(new Word("sunday", "pazar"));
		levelTwoLessonFourList.add(new Word("monday", "pazartesi"));
		levelTwoLessonFourList.add(new Word("tuesday", "salı"));
		levelTwoLessonFourList.add(new Word("wednesday", "çarşamba"));
		levelTwoLessonFourList.add(new Word("thursday", "perşembe"));
		levelTwoLessonFourList.add(new Word("friday", "cuma"));
		levelTwoLessonFourList.add(new Word("saturday", "cumartesi"));
		levelTwoLessonFourList.add(new Word("one second", "bir saniye"));
		levelTwoLessonFourList.add(new Word("minute", "dakika"));
		levelTwoLessonFourList.add(new Word("hour", "saat"));
		levelTwoLessonFourList.add(new Word("day", "gün"));
		levelTwoLessonFourList.add(new Word("today", "bügün"));
		levelTwoLessonFourList.add(new Word("tomorrow", "yarın"));
		levelTwoLessonFourList.add(new Word("yesterday", "dün"));
		levelTwoLessonFourList.add(new Word("week", "hafta"));
		levelTwoLessonFourList.add(new Word("month", "ay"));
		levelTwoLessonFourList.add(new Word("year", "yıl"));
		Lesson levelTwoLessonFour = new Lesson(levelTwoLessonFourList);
		return levelTwoLessonFour;
	}
	
	public static Lesson getLevelTwoLessonFive()
	{
		ArrayList<Word> levelTwoLessonFiveList = new ArrayList<Word>();
		levelTwoLessonFiveList.add(new Word("family", "aile"));
		levelTwoLessonFiveList.add(new Word("mom", "anne"));
		levelTwoLessonFiveList.add(new Word("dad", "baba"));
		levelTwoLessonFiveList.add(new Word("parent", "ebeveyn"));
		levelTwoLessonFiveList.add(new Word("grandma (maternal)", "anneanne"));
		levelTwoLessonFiveList.add(new Word("grandma (paternal)", "babaanne"));
		levelTwoLessonFiveList.add(new Word("grandpa", "dede"));
		levelTwoLessonFiveList.add(new Word("son", "oğul"));
		levelTwoLessonFiveList.add(new Word("daughter", "kız"));
		levelTwoLessonFiveList.add(new Word("child", "çocuk"));
		levelTwoLessonFiveList.add(new Word("grand-daughter", "kız torun"));
		levelTwoLessonFiveList.add(new Word("grand-son", "erkek torun"));
		levelTwoLessonFiveList.add(new Word("grand-child", "torun"));
		levelTwoLessonFiveList.add(new Word("sister", "kız kardeş"));
		levelTwoLessonFiveList.add(new Word("brother", "erkek kardeş"));
		levelTwoLessonFiveList.add(new Word("sibling", "kardeş"));
		levelTwoLessonFiveList.add(new Word("niece/nephew", "yeğen"));
		levelTwoLessonFiveList.add(new Word("aunt (maternal)", "teyze"));
		levelTwoLessonFiveList.add(new Word("uncle (paternal)", "dayı"));
		levelTwoLessonFiveList.add(new Word("aunt (paternal)", "hala"));
		levelTwoLessonFiveList.add(new Word("uncle (paternal)", "amca"));
		Lesson levelTwoLessonFive = new Lesson(levelTwoLessonFiveList);
		return levelTwoLessonFive;
	}
		
	public static Lesson getLevelTwoLessonSix()	
	{
		ArrayList<Word> levelTwoLessonSixList = new ArrayList<Word>();
		levelTwoLessonSixList.add(new Word("cousin", "kuzen"));
		levelTwoLessonSixList.add(new Word("wife", "eş"));
		levelTwoLessonSixList.add(new Word("husband", "koca"));
		levelTwoLessonSixList.add(new Word("spouse", "eş"));
		levelTwoLessonSixList.add(new Word("boyfriend", "sevgili"));
		levelTwoLessonSixList.add(new Word("girlfriend", "sevgili"));
		levelTwoLessonSixList.add(new Word("friend", "arkadaş"));
		levelTwoLessonSixList.add(new Word("brother in law", "enişte"));
		levelTwoLessonSixList.add(new Word("sister in law", "yenge"));
		levelTwoLessonSixList.add(new Word("wife's sister", "baldız"));
		levelTwoLessonSixList.add(new Word("father in law", "kayın baba"));
		levelTwoLessonSixList.add(new Word("mother in law", "kaynana"));
		levelTwoLessonSixList.add(new Word("ex-husband", "eski koca"));
		levelTwoLessonSixList.add(new Word("ex-wife", "eski eş"));
		levelTwoLessonSixList.add(new Word("step-mother", "üvey anne"));
		levelTwoLessonSixList.add(new Word("step-father", "kayınpeder"));
		levelTwoLessonSixList.add(new Word("step-child", "üvey çocuk"));
		levelTwoLessonSixList.add(new Word("step-daughter", "üvey kız"));
		levelTwoLessonSixList.add(new Word("step-son", "üvey oğul"));
		levelTwoLessonSixList.add(new Word("half-brother", "üvey erkek kardeş"));
		levelTwoLessonSixList.add(new Word("half-sister", "üvey kız kardeş"));
		Lesson levelTwoLessonSix = new Lesson(levelTwoLessonSixList);
		return levelTwoLessonSix;
	}
	
	public static Lesson getLevelThreeLessonOne()
	{
		ArrayList<Word> levelThreeLessonOneList = new ArrayList<Word>();
		levelThreeLessonOneList.add(new Word("We are learning", "öğreniyoruz"));
		levelThreeLessonOneList.add(new Word("You are asking", "soruyorsun"));
		levelThreeLessonOneList.add(new Word("wait!", "Bekleyin!"));
		levelThreeLessonOneList.add(new Word("They are making", "yapıyorlar"));
		levelThreeLessonOneList.add(new Word("You are buying", "alıyorsunuz"));
		levelThreeLessonOneList.add(new Word("You are speaking", "konuşuyorsun"));
		levelThreeLessonOneList.add(new Word("I am singing", "söylüyorum"));
		levelThreeLessonOneList.add(new Word("He is playing", "oynuyor"));
		levelThreeLessonOneList.add(new Word("I am going to bed", "yatıyorum"));
		levelThreeLessonOneList.add(new Word("You are sitting", "oturuyorsun"));
		levelThreeLessonOneList.add(new Word("They love", "seviyorlar"));
		levelThreeLessonOneList.add(new Word("You are wearing", "giyersiniz"));
		Lesson levelThreeLessonOne = new Lesson(levelThreeLessonOneList);
		return levelThreeLessonOne;
	}
		
	public static Lesson getLevelThreeLessonTwo()	
	{
		ArrayList<Word> levelThreeLessonTwoList = new ArrayList<Word>();
		levelThreeLessonTwoList.add(new Word("what", "ne"));
		levelThreeLessonTwoList.add(new Word("when", "kaçta"));
		levelThreeLessonTwoList.add(new Word("why", "neden"));
		levelThreeLessonTwoList.add(new Word("where", "nerede"));
		levelThreeLessonTwoList.add(new Word("who", "kim"));
		levelThreeLessonTwoList.add(new Word("how", "nasıl"));
		levelThreeLessonTwoList.add(new Word("What is that", "bu ne"));
		levelThreeLessonTwoList.add(new Word("What time", "saat katçta"));
		levelThreeLessonTwoList.add(new Word("Who is that", "bu kim"));
		levelThreeLessonTwoList.add(new Word("How are you", "nasılsın"));
		Lesson levelThreeLessonTwo = new Lesson(levelThreeLessonTwoList);
		return levelThreeLessonTwo;
	}
		
	public static Lesson getLevelThreeLessonThree()		
	{
		ArrayList<Word> levelThreeLessonThreeList = new ArrayList<Word>();
		levelThreeLessonThreeList.add(new Word("llama", "lama"));
		levelThreeLessonThreeList.add(new Word("hedgehog", "kirpi"));
		levelThreeLessonThreeList.add(new Word("dolphin", "yunus"));
		levelThreeLessonThreeList.add(new Word("shrimp", "karides"));
		levelThreeLessonThreeList.add(new Word("whale", "balina"));
		levelThreeLessonThreeList.add(new Word("shark", "köpekbelığı"));
		levelThreeLessonThreeList.add(new Word("octopus", "ahtapot"));
		levelThreeLessonThreeList.add(new Word("giraffe", "zürafa"));
		levelThreeLessonThreeList.add(new Word("fox", "tilki"));
		levelThreeLessonThreeList.add(new Word("crocodile", "timsah"));
		levelThreeLessonThreeList.add(new Word("butterfly", "kelebek"));
		levelThreeLessonThreeList.add(new Word("bug", "böcek"));
		levelThreeLessonThreeList.add(new Word("ladybug", "uğur böceği"));
		levelThreeLessonThreeList.add(new Word("worm", "solucan"));
		levelThreeLessonThreeList.add(new Word("wolf", "kurt"));
		levelThreeLessonThreeList.add(new Word("grasshopper", "çekirge"));
		levelThreeLessonThreeList.add(new Word("fly", "sinek"));
		levelThreeLessonThreeList.add(new Word("penguin", "penguen"));
		levelThreeLessonThreeList.add(new Word("bee", "arı"));
		levelThreeLessonThreeList.add(new Word("crab", "yengeç"));
		levelThreeLessonThreeList.add(new Word("aardvark", "yerdomuzu"));
		levelThreeLessonThreeList.add(new Word("stingray", "iğneli vatoz"));
		levelThreeLessonThreeList.add(new Word("frog", "kurbağa"));
		levelThreeLessonThreeList.add(new Word("goat", "keçi"));
		Lesson levelThreeLessonThree = new Lesson(levelThreeLessonThreeList);
		return levelThreeLessonThree;
	}
		
	public static Lesson getLevelThreeLessonFour()		
	{	
		ArrayList<Word> levelThreeLessonFourList = new ArrayList<Word>();
		levelThreeLessonFourList.add(new Word("egg", "yumurta"));
		levelThreeLessonFourList.add(new Word("butter", "tereyağı"));
		levelThreeLessonFourList.add(new Word("oil", "yağ"));
		levelThreeLessonFourList.add(new Word("carrot", "havuç"));
		levelThreeLessonFourList.add(new Word("salad", "salata"));
		levelThreeLessonFourList.add(new Word("yogurt", "yoğurt"));
		levelThreeLessonFourList.add(new Word("cheese", "peynir"));
		levelThreeLessonFourList.add(new Word("fish", "balık"));
		levelThreeLessonFourList.add(new Word("ketchup", "ketçap"));
		levelThreeLessonFourList.add(new Word("pudding", "puding"));
		levelThreeLessonFourList.add(new Word("turkish delight", "lokum"));
		levelThreeLessonFourList.add(new Word("grapefruit", "greyfurt"));
		levelThreeLessonFourList.add(new Word("pineapple", "ananas"));
		levelThreeLessonFourList.add(new Word("melon", "kavun"));
		levelThreeLessonFourList.add(new Word("coconut", "hindistan cevizi"));
		levelThreeLessonFourList.add(new Word("pomegranate", "nar"));
		levelThreeLessonFourList.add(new Word("avocado", "avokado"));
		levelThreeLessonFourList.add(new Word("kiwi", "kivi kuşu"));
		levelThreeLessonFourList.add(new Word("plum", "erik"));
		levelThreeLessonFourList.add(new Word("pickle", "kornişon"));
		levelThreeLessonFourList.add(new Word("chocolate", "çikolata"));
		levelThreeLessonFourList.add(new Word("cauliflower", "karnıbahar"));
		levelThreeLessonFourList.add(new Word("radish", "turp"));
		levelThreeLessonFourList.add(new Word("squash", "kabak"));
		levelThreeLessonFourList.add(new Word("cinnamon", "tarçın"));
		levelThreeLessonFourList.add(new Word("soda pop", "gazoz"));
		levelThreeLessonFourList.add(new Word("pistachio", "fıstık"));
		levelThreeLessonFourList.add(new Word("hazelnut", "fındık"));
		levelThreeLessonFourList.add(new Word("corn", "mısır"));
		levelThreeLessonFourList.add(new Word("breakfast", "kahvaltı"));
		levelThreeLessonFourList.add(new Word("lunch", "öğle yemeği"));
		levelThreeLessonFourList.add(new Word("dinner", "akşam yemeği"));
		Lesson levelThreeLessonFour = new Lesson(levelThreeLessonFourList);
		return levelThreeLessonFour;
	}
	
	public static Lesson getLevelThreeLessonFive()	
	{
		ArrayList<Word> levelThreeLessonFiveList = new ArrayList<Word>();
		levelThreeLessonFiveList.add(new Word("I am thinking", "düşünüyorum"));
		levelThreeLessonFiveList.add(new Word("Look!", "Bak!"));
		levelThreeLessonFiveList.add(new Word("You are coming", "geliyorsunuz"));
		levelThreeLessonFiveList.add(new Word("I want", "istiyorum"));
		levelThreeLessonFiveList.add(new Word("they are using", "kullanıyorlar"));
		levelThreeLessonFiveList.add(new Word("I am working", "çalışıyorum"));
		levelThreeLessonFiveList.add(new Word("I found it", "buldum"));
		levelThreeLessonFiveList.add(new Word("What is happening", "ne oluyor"));
		levelThreeLessonFiveList.add(new Word("they are leaving", "gidiyorlar"));
		levelThreeLessonFiveList.add(new Word("it is beginning", "başlıyor"));
		levelThreeLessonFiveList.add(new Word("it is ending", "bitiyor"));
		Lesson levelThreeLessonFive = new Lesson(levelThreeLessonFiveList);
		return levelThreeLessonFive;
	}
		
	public static Lesson getLevelThreeLessonSix()
	{
		ArrayList<Word> levelThreeLessonSixList = new ArrayList<Word>();
		levelThreeLessonSixList.add(new Word("clothes", "çamaşırlar"));
		levelThreeLessonSixList.add(new Word("shirt", "gömlek"));
		levelThreeLessonSixList.add(new Word("pants", "pantolon"));
		levelThreeLessonSixList.add(new Word("socks", "çorap"));
		levelThreeLessonSixList.add(new Word("shoes", "ayakkabı"));
		levelThreeLessonSixList.add(new Word("hat", "şapka"));
		levelThreeLessonSixList.add(new Word("glasses", "gözlük"));
		levelThreeLessonSixList.add(new Word("skirt", "etek"));
		levelThreeLessonSixList.add(new Word("suit", "takım elbise"));
		levelThreeLessonSixList.add(new Word("dress", "elbise"));
		levelThreeLessonSixList.add(new Word("tie", "kravat"));
		levelThreeLessonSixList.add(new Word("jacket", "ceket"));
		levelThreeLessonSixList.add(new Word("gloves", "eldiven"));
		levelThreeLessonSixList.add(new Word("tuque", "yün bere"));
		levelThreeLessonSixList.add(new Word("scarf", "eşarp"));
		levelThreeLessonSixList.add(new Word("purse", "çanta"));
		levelThreeLessonSixList.add(new Word("necklace", "kolye"));
		levelThreeLessonSixList.add(new Word("bracelet", "bilezik"));
		levelThreeLessonSixList.add(new Word("ring", "halka"));
		levelThreeLessonSixList.add(new Word("watch", "izlemek"));
		Lesson levelThreeLessonSix = new Lesson(levelThreeLessonSixList);
		return levelThreeLessonSix;
	}
	public static Lesson getLevelFourLessonOne()
	{
		ArrayList<Word> levelFourLessonOneList = new ArrayList<Word>();
		levelFourLessonOneList.add(new Word("mechanic", "makina ustası"));
		levelFourLessonOneList.add(new Word("pilot", "pilot"));
		levelFourLessonOneList.add(new Word("actor", "aktör"));
		levelFourLessonOneList.add(new Word("singer", "şarkıcı"));
		levelFourLessonOneList.add(new Word("architect", "mimar"));
		levelFourLessonOneList.add(new Word("accountant", "muhasebeci"));
		levelFourLessonOneList.add(new Word("secretary", "sekreter"));
		levelFourLessonOneList.add(new Word("soldier", "asker"));
		levelFourLessonOneList.add(new Word("fire-fighter", "itfaiyeci"));
		levelFourLessonOneList.add(new Word("officer", "memur"));
		levelFourLessonOneList.add(new Word("police officer", "polis memuru"));
		levelFourLessonOneList.add(new Word("fisherman", "balıkçı"));
		levelFourLessonOneList.add(new Word("sailor", "denizci"));
		levelFourLessonOneList.add(new Word("captain", "gemi kaptanı"));
		levelFourLessonOneList.add(new Word("astronaut", "astronot"));
		levelFourLessonOneList.add(new Word("waiter", "garson"));
		levelFourLessonOneList.add(new Word("dentist", "dişçi"));
		levelFourLessonOneList.add(new Word("doctor", "doktor"));
		levelFourLessonOneList.add(new Word("electrician", "elektrikçi"));
		levelFourLessonOneList.add(new Word("surgeon", "cerrah"));
		levelFourLessonOneList.add(new Word("student", "oğrenci"));
		levelFourLessonOneList.add(new Word("teacher", "oğretmen"));
		Lesson levelFourLessonOne = new Lesson(levelFourLessonOneList);
		return levelFourLessonOne;
	}
		
	public static Lesson getLevelFourLessonTwo()
	{
		ArrayList<Word> levelFourLessonTwoList = new ArrayList<Word>();
		levelFourLessonTwoList.add(new Word("athlete", "koşucu"));
		levelFourLessonTwoList.add(new Word("farmer", "çiftçi"));
		levelFourLessonTwoList.add(new Word("engineer", "mühendis"));
		levelFourLessonTwoList.add(new Word("lawyer", "avukat"));
		levelFourLessonTwoList.add(new Word("carpenter", "marangoz"));
		levelFourLessonTwoList.add(new Word("clown", "palyaço"));
		levelFourLessonTwoList.add(new Word("magician", "sihirbaz"));
		levelFourLessonTwoList.add(new Word("painter", "ressam"));
		levelFourLessonTwoList.add(new Word("artist", "sanatçı"));
		levelFourLessonTwoList.add(new Word("photographer", "fotoğrafçı"));
		levelFourLessonTwoList.add(new Word("professor", "profesör"));
		levelFourLessonTwoList.add(new Word("scientist", "bilim adamı"));
		levelFourLessonTwoList.add(new Word("builder", "inşaat işçisi"));
		levelFourLessonTwoList.add(new Word("postman", "postacı"));
		levelFourLessonTwoList.add(new Word("businessman", "işadamı"));
		levelFourLessonTwoList.add(new Word("chef", "aşçıbaşı"));
		levelFourLessonTwoList.add(new Word("reporter", "muhabir"));
		levelFourLessonTwoList.add(new Word("journalist", "gazeteci"));
		levelFourLessonTwoList.add(new Word("taxi driver", "taksi sürücü"));
		levelFourLessonTwoList.add(new Word("musician", "müzisyen"));
		Lesson levelFourLessonTwo = new Lesson(levelFourLessonTwoList);
		return levelFourLessonTwo;
	}
	
	public static Lesson getLevelFourLessonThree()
	{
		ArrayList<Word> levelFourLessonThreeList = new ArrayList<Word>();
		levelFourLessonThreeList.add(new Word("There is no doctor", "doktor yok"));
		levelFourLessonThreeList.add(new Word("I do not have an hour", "saatim yok"));
		levelFourLessonThreeList.add(new Word("You are not happy", "mutlu değilsin"));
		levelFourLessonThreeList.add(new Word("He is not swimming", "yüzmüyor"));
		levelFourLessonThreeList.add(new Word("I did not see that", "bunu görmedim"));
		levelFourLessonThreeList.add(new Word("I do not want", "istemiyorum"));
		levelFourLessonThreeList.add(new Word("You are not waiting", "beklemiyorsun"));
		levelFourLessonThreeList.add(new Word("They are not looking", "bakmıyorlar"));
		levelFourLessonThreeList.add(new Word("We are not working", "çalışmıyoruz"));
		levelFourLessonThreeList.add(new Word("You are not buying", "almıyorsun"));
		levelFourLessonThreeList.add(new Word("I do not love", "sevmiyorum"));
		levelFourLessonThreeList.add(new Word("You are not running", "koşmuyorsunuz"));
		Lesson levelFourLessonThree = new Lesson(levelFourLessonThreeList);
		return levelFourLessonThree;
	}
	
	public static Lesson getLevelFourLessonFour()
	{
		ArrayList<Word> levelFourLessonFourList = new ArrayList<Word>();
		levelFourLessonFourList.add(new Word("usually", "genellikle"));
		levelFourLessonFourList.add(new Word("completely", "tamamen"));
		levelFourLessonFourList.add(new Word("certainly", "kesinlikle"));
		levelFourLessonFourList.add(new Word("always", "hep"));
		levelFourLessonFourList.add(new Word("everytime", "her zaman"));
		levelFourLessonFourList.add(new Word("never", "hiç"));
		levelFourLessonFourList.add(new Word("rarely", "nadiren"));
		levelFourLessonFourList.add(new Word("generally", "çoğunlukla"));
		levelFourLessonFourList.add(new Word("frequently", "sık sık"));
		levelFourLessonFourList.add(new Word("often", "çoğu kez"));
		levelFourLessonFourList.add(new Word("sometimes", "bazen"));
		levelFourLessonFourList.add(new Word("just", "sadece"));
		levelFourLessonFourList.add(new Word("extremely", "son derece"));
		levelFourLessonFourList.add(new Word("quite", "oldukça"));
		levelFourLessonFourList.add(new Word("very", "çok"));
		levelFourLessonFourList.add(new Word("almost", "neredeyse"));
		levelFourLessonFourList.add(new Word("now", "şimdi"));
		levelFourLessonFourList.add(new Word("from now on", "artık"));
		levelFourLessonFourList.add(new Word("later", "sonra"));
		levelFourLessonFourList.add(new Word("soon", "az sonra"));
		levelFourLessonFourList.add(new Word("behind", "arkasında"));
		levelFourLessonFourList.add(new Word("in front", "önünde"));
		levelFourLessonFourList.add(new Word("below", "altında"));
		levelFourLessonFourList.add(new Word("above", "üstüne"));
		levelFourLessonFourList.add(new Word("down", "aşağıya"));
		levelFourLessonFourList.add(new Word("up", "yukarında"));
		levelFourLessonFourList.add(new Word("inside", "içeride"));
		levelFourLessonFourList.add(new Word("outside", "dışarıda"));
		levelFourLessonFourList.add(new Word("enough", "yeterli"));
		levelFourLessonFourList.add(new Word("adequately", "yeterince"));
		levelFourLessonFourList.add(new Word("left", "sol"));
		levelFourLessonFourList.add(new Word("right", "sağ"));
		levelFourLessonFourList.add(new Word("because", "çünkü"));
		levelFourLessonFourList.add(new Word("if", "şartla"));
		Lesson levelFourLessonFour = new Lesson(levelFourLessonFourList);
		return levelFourLessonFour;
	}
	
	public static Lesson getLevelFourLessonFive()
	{
		ArrayList<Word> levelFourLessonFiveList = new ArrayList<Word>();
		levelFourLessonFiveList.add(new Word("I feel", "hissediyorum"));
		levelFourLessonFiveList.add(new Word("They need", "ihtiyaçları"));
		levelFourLessonFiveList.add(new Word("You are standing", "duruyorlsun"));
		levelFourLessonFiveList.add(new Word("They are watching", "izliyorlar"));
		levelFourLessonFiveList.add(new Word("We are stopping", "duruyoruz"));
		levelFourLessonFiveList.add(new Word("is it allowed", "izin verilir"));
		levelFourLessonFiveList.add(new Word("I sent it", "onu gönderdim"));
		levelFourLessonFiveList.add(new Word("You suggested it", "önerdin"));
		levelFourLessonFiveList.add(new Word("I killed", "öldürdüm"));
		levelFourLessonFiveList.add(new Word("I am deciding", "karar veriyorum"));
		levelFourLessonFiveList.add(new Word("I am making", "ediyorum"));
		levelFourLessonFiveList.add(new Word("We are dancing", "dans ediyoruz"));
		Lesson levelFourLessonFive = new Lesson(levelFourLessonFiveList);
		return levelFourLessonFive;
	}
	
	public static Lesson getLevelFourLessonSix()
	{
		ArrayList<Word> levelFourLessonSixList = new ArrayList<Word>();
		levelFourLessonSixList.add(new Word("quarter to eight", "sekize çeyrek var"));
		levelFourLessonSixList.add(new Word("forty five past one", "biri kırk beş geçiyor"));
		levelFourLessonSixList.add(new Word("twelve past twelve", "on ikiyi on iki geçiyor"));
		levelFourLessonSixList.add(new Word("half past six", "altıyı buçuktan geçiyor"));
		levelFourLessonSixList.add(new Word("half to two", "ikiye buçuktan var"));
		levelFourLessonSixList.add(new Word("three to eleven", "on bire üç var"));
		levelFourLessonSixList.add(new Word("ten past four", "dördü on dört geçiyor"));
		levelFourLessonSixList.add(new Word("fourteen past ten", "onu on geçiyor"));
		levelFourLessonSixList.add(new Word("quarter to nine", "dokuza çeyrek var"));
		levelFourLessonSixList.add(new Word("one to five", "beşe bir var"));
		levelFourLessonSixList.add(new Word("half past three", "üçü buçuktan geçiyor"));
		Lesson levelFourLessonSix = new Lesson(levelFourLessonSixList);
		return levelFourLessonSix;
	}
	*/
	
	public static Lesson getLevelFromTextFile(String textFileNameWithoutDefault, String username)
	{
		String userSpecificTextFileName = textFileNameWithoutDefault + "_" + username + ".txt";
		try
		{
			ArrayList<Word> lessonWordList = new ArrayList<Word>();
			BufferedReader preferredFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + userSpecificTextFileName)));
			while(preferredFileBufferedReader.ready())
			{
				String currentLine = preferredFileBufferedReader.readLine();
				String[] wordParameters = currentLine.split("-");
				for(int i = 0; i < 4; i++)
				{
					wordParameters[i] = wordParameters[i].trim();
				}
				lessonWordList.add(new Word(wordParameters[0], wordParameters[1], Integer.parseInt(wordParameters[2]), Integer.parseInt(wordParameters[3])));
			}
			preferredFileBufferedReader.close();
			return new Lesson(lessonWordList);
		}
		catch(FileNotFoundException fnfe)
		{
			if(createUserSpecificFileFromTheDefaultFileAndReturnWhetherYouSucceded(textFileNameWithoutDefault, username))
			{
				return getLevelFromTextFile(textFileNameWithoutDefault, username);
			}
			else
			{
				return null;
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			System.out.println("FATAL ERROR OCCURRED IN GETLEVELFROMTEXTFILE, AN IOEXCEPTION OCCURRED AND THIS BUG MUST BE ADDRESSED.");
			return null;
		}
	}
	
	public static boolean createUserSpecificFileFromTheDefaultFileAndReturnWhetherYouSucceded(String textFileNameWithoutDefault, String username)
	{
		try
		{
			String defaultTextFileName = textFileNameWithoutDefault + "_" + "default" + ".txt";
			String userSpecificTextFileName = textFileNameWithoutDefault + "_" + username + ".txt";
			
			BufferedReader defaultFileBufferedReader = new BufferedReader(new FileReader(new File("lesson_text_files/" + defaultTextFileName)));
			BufferedWriter preferredFileBufferedWriter = new BufferedWriter(new FileWriter(new File("lesson_text_files/" + userSpecificTextFileName)));
			
			while(defaultFileBufferedReader.ready())
			{
				preferredFileBufferedWriter.write(defaultFileBufferedReader.readLine());
				preferredFileBufferedWriter.newLine();
			}
			
			defaultFileBufferedReader.close();
			preferredFileBufferedWriter.close();
			
			return true;
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
			return false;
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static ArrayList<Word> worstWords()
	{
		return null;
		/*
		ArrayList<Word> incorrect = new ArrayList<Word>();
		int count10 = 0;
		
		ArrayList<Word> one = getLevelOneLessonOne().getArray();
		for (int i = 0; i < one.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((one.get(i).getIncorrect()) > (one.get(i).getCorrect()))
			{
				incorrect.add(one.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> two = getLevelOneLessonTwo().getArray();
		for (int i = 0; i < two.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((two.get(i).getIncorrect()) > (two.get(i).getCorrect()))
			{
				incorrect.add(two.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> three = getLevelOneLessonThree().getArray();
		for (int i = 0; i < three.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((three.get(i).getIncorrect()) > (three.get(i).getCorrect()))
			{
				incorrect.add(three.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> four = getLevelOneLessonFour().getArray();
		for (int i = 0; i < four.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((four.get(i).getIncorrect()) > (four.get(i).getCorrect()))
			{
				incorrect.add(four.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> five = getLevelOneLessonFive().getArray();
		for (int i = 0; i < five.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((five.get(i).getIncorrect()) > (five.get(i).getCorrect()))
			{
				incorrect.add(five.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> six = getLevelOneLessonSix().getArray();
		for (int i = 0; i < six.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((six.get(i).getIncorrect()) > (six.get(i).getCorrect()))
			{
				incorrect.add(six.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> seven = getLevelTwoLessonOne().getArray();
		for (int i = 0; i < seven.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((seven.get(i).getIncorrect()) > (seven.get(i).getCorrect()))
			{
				incorrect.add(seven.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> eight = getLevelTwoLessonTwo().getArray();
		for (int i = 0; i < eight.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((eight.get(i).getIncorrect()) > (eight.get(i).getCorrect()))
			{
				incorrect.add(eight.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> nine = getLevelTwoLessonThree().getArray();
		for (int i = 0; i < nine.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((nine.get(i).getIncorrect()) > (nine.get(i).getCorrect()))
			{
				incorrect.add(nine.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> ten = getLevelTwoLessonFour().getArray();
		for (int i = 0; i < ten.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((ten.get(i).getIncorrect()) > (ten.get(i).getCorrect()))
			{
				incorrect.add(ten.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> eleven = getLevelTwoLessonFive().getArray();
		for (int i = 0; i < eleven.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((eleven.get(i).getIncorrect()) > (eleven.get(i).getCorrect()))
			{
				incorrect.add(eleven.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twelve = getLevelTwoLessonSix().getArray();
		for (int i = 0; i < twelve.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twelve.get(i).getIncorrect()) > (twelve.get(i).getCorrect()))
			{
				incorrect.add(twelve.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> thirteen = getLevelThreeLessonOne().getArray();
		for (int i = 0; i < thirteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((thirteen.get(i).getIncorrect()) > (thirteen.get(i).getCorrect()))
			{
				incorrect.add(thirteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> fourteen = getLevelThreeLessonTwo().getArray();
		for (int i = 0; i < fourteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((fourteen.get(i).getIncorrect()) > (fourteen.get(i).getCorrect()))
			{
				incorrect.add(fourteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> fifteen = getLevelThreeLessonThree().getArray();
		for (int i = 0; i < fifteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((fifteen.get(i).getIncorrect()) > (fifteen.get(i).getCorrect()))
			{
				incorrect.add(fifteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> sixteen = getLevelThreeLessonFour().getArray();
		for (int i = 0; i < sixteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((sixteen.get(i).getIncorrect()) > (sixteen.get(i).getCorrect()))
			{
				incorrect.add(sixteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> seventeen = getLevelThreeLessonFive().getArray();
		for (int i = 0; i < seventeen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((seventeen.get(i).getIncorrect()) > (seventeen.get(i).getCorrect()))
			{
				incorrect.add(seventeen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> eighteen = getLevelThreeLessonSix().getArray();
		for (int i = 0; i < eighteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((eighteen.get(i).getIncorrect()) > (eighteen.get(i).getCorrect()))
			{
				incorrect.add(eighteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> nineteen = getLevelFourLessonOne().getArray();
		for (int i = 0; i < nineteen.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((nineteen.get(i).getIncorrect()) > (nineteen.get(i).getCorrect()))
			{
				incorrect.add(nineteen.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twenty = getLevelFourLessonTwo().getArray();
		for (int i = 0; i < twenty.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twenty.get(i).getIncorrect()) > (twenty.get(i).getCorrect()))
			{
				incorrect.add(twenty.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twentyOne = getLevelFourLessonThree().getArray();
		for (int i = 0; i < twentyOne.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twentyOne.get(i).getIncorrect()) > (twentyOne.get(i).getCorrect()))
			{
				incorrect.add(twentyOne.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twentyTwo = getLevelFourLessonFour().getArray();
		for (int i = 0; i < twentyTwo.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twentyTwo.get(i).getIncorrect()) > (twentyTwo.get(i).getCorrect()))
			{
				incorrect.add(twentyTwo.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twentyThree = getLevelFourLessonFive().getArray();
		for (int i = 0; i < twentyThree.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twentyThree.get(i).getIncorrect()) > (twentyThree.get(i).getCorrect()))
			{
				incorrect.add(twentyThree.get(i));
				count10++;
				
			}
		}
		
		ArrayList<Word> twentyFour = getLevelFourLessonSix().getArray();
		for (int i = 0; i < twentyFour.size(); i++)
		{
			if (count10 >= 10)
			{
				return incorrect;
			}
			if ((twentyFour.get(i).getIncorrect()) > (twentyFour.get(i).getCorrect()))
			{
				incorrect.add(twentyFour.get(i));
				count10++;
				
			}
		}
		
		return incorrect;
		*/
	}
	
}