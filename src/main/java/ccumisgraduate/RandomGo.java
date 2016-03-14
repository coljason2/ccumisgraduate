package ccumisgraduate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGo {
	List<student> st = new ArrayList<student>();
	student s;
	student Boss = new student();
	student Editer = new student();

	public student getBoss() {

		Random rod = new Random();
		Boss = st.get(rod.nextInt(st.size()));
		st.remove(Boss);
		return Boss;
	}

	public student getEditer() {
		Random rod = new Random();
		Editer = st.get(rod.nextInt(st.size()));
		st.remove(Editer);
		return Editer;
	}

	public void initialize() {
		s = new student();
		s.setNumber("603530041");
		s.setName("§õ«Â¹F");
		st.add(s);
		s = new student();
		s.setNumber("604530001");
		s.setName("ºŞ¿üÁO");
		st.add(s);
		s = new student();
		s.setNumber("604530002");
		s.setName("³¯®a»ô");
		st.add(s);
		s = new student();
		s.setNumber("604530004");
		s.setName("¹ù«Û³Ç");
		st.add(s);
		s = new student();
		s.setNumber("604530005");
		s.setName("¶À¨|µX");
		st.add(s);
		s = new student();
		s.setNumber("604530007");
		s.setName("¶À¥©¤å");
		st.add(s);
		s = new student();
		s.setNumber("604530011");
		s.setName("§õ«³¦Æ");
		st.add(s);
		s = new student();
		s.setNumber("604530012");
		s.setName("­J®fŞ³");
		st.add(s);
		s = new student();
		s.setNumber("604530013");
		s.setName("³¯¬fºa");
		st.add(s);
		s = new student();
		s.setNumber("604530015");
		s.setName("§õ©y¬Â");
		st.add(s);
		s = new student();
		s.setNumber("604530016");
		s.setName("¼Bµn¬ì");
		st.add(s);
		s = new student();
		s.setNumber("604530017");
		s.setName("®]¨|¨°");
		st.add(s);
		s = new student();
		s.setNumber("604530028");
		s.setName("±i³Ó²a");
		st.add(s);
		s = new student();
		s.setNumber("604530029");
		s.setName("§º®¶»¨");
		st.add(s);
		s = new student();
		s.setNumber("604530030");
		s.setName("´^¥¿½å");
		st.add(s);
		s = new student();
		s.setNumber("604530031");
		s.setName("³¯«TÀB");
		st.add(s);
		s = new student();
		s.setNumber("604530032");
		s.setName("Ä¬¤Î²Ä");
		st.add(s);
		s = new student();
		s.setNumber("604530034");
		s.setName("°ª®aÁ¨");
		st.add(s);
		s = new student();
		s.setNumber("604530036");
		s.setName("±ç¦t¼e");
		st.add(s);
		s = new student();
		s.setNumber("604530037");
		s.setName("³¯«Û§e");
		st.add(s);
		s = new student();
		s.setNumber("604530041");
		s.setName("ªô¸tµq");
		st.add(s);
		s = new student();
		s.setNumber("604530042");
		s.setName("¤ı«~¤å");
		st.add(s);
		s = new student();
		s.setNumber("604530043");
		s.setName("¦¿°¶»Í");
		st.add(s);
		s = new student();
		s.setNumber("604530046");
		s.setName("³¯°ª«Û");
		st.add(s);
		s = new student();
		s.setNumber("604530047");
		s.setName("§õ¶²®S");
		st.add(s);
		s = new student();
		s.setNumber("604530048");
		s.setName("³¢®Ê³Í");
		st.add(s);
		s = new student();
		s.setNumber("604530049");
		s.setName("¥ô­P·ç");
		st.add(s);
		s = new student();
		s.setNumber("604530050");
		s.setName("§õ«p§¡");
		st.add(s);
		s = new student();
		s.setNumber("604530051");
		s.setName("³¯¹m¤¤");
		st.add(s);
		s = new student();
		s.setNumber("604530054");
		s.setName("¥Õ¦t°a");
		st.add(s);
	}

}
