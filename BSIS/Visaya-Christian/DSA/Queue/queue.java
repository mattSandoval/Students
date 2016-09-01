class queue{

	// Declaration ng mga Variables as Global.
	static int Queue[] = new int[20];
	static int content = 0;
	static int QueueCounter = 0;
	static Boolean StatusFull;
	static Boolean StatusEmpty;
	static int ExcessQueue[] = new int[20];
	static int TemporaryHolder[] = new int[20];

	// Ito ang main method. Dito ko tinawag lahat ng function para mag add, mag delete at mag check ng status ni Queue.
	public static void main(String[] args){
		QueueEmpty();
		Queuefull();
		Addqueue(14);
		Removequeue(6);
		Addqueue(15);
		Removequeue(5);
	}

	// Ito ang mag dedetermin kung Empty na ba si Queue o hindi pa.
	public static Boolean QueueEmpty(){
		if(Queue[0]==0){
			StatusEmpty = true;
		}else{
			StatusEmpty = false;
		}
		return StatusEmpty;
	}

	// Ito naman ang mag sisilbing guide mo kung Full naba si queue o hindi pa.
	public static Boolean Queuefull(){
		if(Queue[9]>0){
			StatusFull = true;
		}else{
			StatusFull = false;
		}
		return StatusFull;
	}

	// Ito ay saling pusa lang, para may proccesing effect.
	public static void sleep(int time){
		try	{
		    Thread.sleep(time);
		}catch(Exception e){

		}

	}

	// Ito ung isa sa main function, ang pag a-add ng queue.
	public static int Addqueue(int value){

		for(int a=QueueCounter;a<value;a++){
			Queuefull();
			if(StatusFull==true){
				System.out.println("");
				sleep(2000);
				System.out.println("Adding queue failed! The queue is already full!");
				sleep(2000);
				System.out.println("");
				ExcessQueue[a] = content;
			}else{
			content++;
			sleep(1000);
			System.out.println("Adding a Queue . . . .");
			Queue[QueueCounter] =  content;
			sleep(1000);
			System.out.println("Queue added succesfully! Value = " + Queue[QueueCounter]);
			QueueCounter++;
			}
		}
		return 0;
	}

	// ito naman ung pag remove ng funtion.
	public static int Removequeue(int value){
		if(value>10){
			sleep(1000);
			System.out.println("Removing queue failed! Value should not exceed in 10!");
			return 0;
		}
		for(int a=0;a<value;a++){
			Queue[a] = 0;
			sleep(1000);
			System.out.println("Removing queue success! Value = " + Queue[a]);
			QueueCounter--;
		}
		int counter = 0;
		for(int b=value;b<10;b++){
			TemporaryHolder[counter] = Queue[b];
			System.out.println(TemporaryHolder[counter]);
			counter++;
		}
		for(int c=0;c<10;c++){
			Queue[c] = TemporaryHolder[c];
			sleep(2000);
			System.out.println("Arranging queue success! Value = " + Queue[c]);
		}
		return 0;
	}


}