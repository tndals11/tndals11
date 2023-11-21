package test2;

public class KorDbMemberEx {

	public static void main(String[] args) throws Exception {
		KorDbMemberDao kdao = new KorDbMemberDao();
		kdao.insertDisp();
		kdao.selectDisp();
	}

}
