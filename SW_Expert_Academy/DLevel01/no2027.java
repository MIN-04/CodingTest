package difficulty.level01;

public class no2027 {
	
	/**
	 * 2027. �밢�� ����ϱ�
	*/
	
	public static void main(String args[]) throws Exception
	{

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) {
					System.out.print("#");
				}else {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}
