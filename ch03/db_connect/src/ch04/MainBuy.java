package ch04;

public class MainBuy {

	public static void main(String[] args) {

		BuyDAO buyDAO = new BuyDAO();
		
//		BuyDTO insertDTO = new BuyDTO("나문희", "밍크코트", 150000, 1);
//		int rowCount = buyDAO.insert(new BuyDTO("티모", "냉장고", 150000, 1));
//		System.out.println("rowCount : " + rowCount);

//		BuyDTO dto = new BuyDTO("티모", "버섯", 200, 1);
//		
//		int updateRowCount = buyDAO.update(dto, dto.getUserName(),"냉장고");
//		System.out.println(updateRowCount);
	
//		 -------DELETE
		int row = buyDAO.delete("버섯");
		System.out.println(row);
		
		// --------SELECT
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
