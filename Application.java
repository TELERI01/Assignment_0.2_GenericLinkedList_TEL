public class Application{
	public static void main(String[] args) {
		//========================================
		//Generic Linked List
		//========================================
		
		GenericLinkedList myGenericList = new GenericLinkedList();
		
		GenericNode gNode = new GenericNode();
		String myName = "Tyler";
		gNode.setData(myName);
		myGenericList.addNode(gNode);
		gNode = new GenericNode();
		int myAge = 12;
		gNode.setData(myAge);
		myGenericList.addNode(gNode);
		
		GenericNode tempGnode = myGenericList.getList();
		do {
			System.out.println(tempGnode.data);
			tempGnode=tempGnode.nextGnode;
			
		}while(tempGnode!=null);
		
	}
}