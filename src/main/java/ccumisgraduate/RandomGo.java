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
		s.setName("���¹F");
		st.add(s);
		s = new student();
		s.setNumber("604530001");
		s.setName("�޿��O");
		st.add(s);
		s = new student();
		s.setNumber("604530002");
		s.setName("���a��");
		st.add(s);
		s = new student();
		s.setNumber("604530004");
		s.setName("���۳�");
		st.add(s);
		s = new student();
		s.setNumber("604530005");
		s.setName("���|�X");
		st.add(s);
		s = new student();
		s.setNumber("604530007");
		s.setName("������");
		st.add(s);
		s = new student();
		s.setNumber("604530011");
		s.setName("������");
		st.add(s);
		s = new student();
		s.setNumber("604530012");
		s.setName("�J�f޳");
		st.add(s);
		s = new student();
		s.setNumber("604530013");
		s.setName("���f�a");
		st.add(s);
		s = new student();
		s.setNumber("604530015");
		s.setName("���y��");
		st.add(s);
		s = new student();
		s.setNumber("604530016");
		s.setName("�B�n��");
		st.add(s);
		s = new student();
		s.setNumber("604530017");
		s.setName("�]�|��");
		st.add(s);
		s = new student();
		s.setNumber("604530028");
		s.setName("�i�Ӳa");
		st.add(s);
		s = new student();
		s.setNumber("604530029");
		s.setName("������");
		st.add(s);
		s = new student();
		s.setNumber("604530030");
		s.setName("�^����");
		st.add(s);
		s = new student();
		s.setNumber("604530031");
		s.setName("���T�B");
		st.add(s);
		s = new student();
		s.setNumber("604530032");
		s.setName("Ĭ�β�");
		st.add(s);
		s = new student();
		s.setNumber("604530034");
		s.setName("���a��");
		st.add(s);
		s = new student();
		s.setNumber("604530036");
		s.setName("��t�e");
		st.add(s);
		s = new student();
		s.setNumber("604530037");
		s.setName("���ۧe");
		st.add(s);
		s = new student();
		s.setNumber("604530041");
		s.setName("���t�q");
		st.add(s);
		s = new student();
		s.setNumber("604530042");
		s.setName("���~��");
		st.add(s);
		s = new student();
		s.setNumber("604530043");
		s.setName("������");
		st.add(s);
		s = new student();
		s.setNumber("604530046");
		s.setName("������");
		st.add(s);
		s = new student();
		s.setNumber("604530047");
		s.setName("�����S");
		st.add(s);
		s = new student();
		s.setNumber("604530048");
		s.setName("���ʳ�");
		st.add(s);
		s = new student();
		s.setNumber("604530049");
		s.setName("���P��");
		st.add(s);
		s = new student();
		s.setNumber("604530050");
		s.setName("���p��");
		st.add(s);
		s = new student();
		s.setNumber("604530051");
		s.setName("���m��");
		st.add(s);
		s = new student();
		s.setNumber("604530054");
		s.setName("�զt�a");
		st.add(s);
	}

}
