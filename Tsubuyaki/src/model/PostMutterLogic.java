package model;

import java.util.List;

public class PostMutterLogic {
	public void execute(Mutter mutter, List<Mutter> mutterList) {
		//新規つぶやきの先頭表示
		mutterList.add(0,mutter);
	}
}
