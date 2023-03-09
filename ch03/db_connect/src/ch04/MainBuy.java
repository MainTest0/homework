package ch04;

public class MainBuy {

	public static void main(String[] args) {

		BuyDAO buyDAO = new BuyDAO();
		
//		BuyDTO insertDTO = new BuyDTO("나문희", "밍크코트", 150000, 1);
//		int rowCount = buyDAO.insert(new BuyDTO("티모", "냉장고", 150000, 1));
//		System.out.println("rowCount : " + rowCount);

//		BuyDTO dto = new BuyDTO("이승기", "운동화", 200, 1);
//		
//		int updateRowCount = buyDAO.update(dto, dto.getUserName(),"나이키");
//		System.out.println(updateRowCount);
	
		
		int row = buyDAO.delete("노트북");
		System.out.println(row);
		
//		ArrayList<BuyDTO> list = buyDAO.select();
//		
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getUserName());
//			System.out.println(list.get(i).getProdName());
//			System.out.println(list.get(i).getPrice());
//			System.out.println(list.get(i).getAmount());
//			System.out.println("======================");
//		}

	}

}
