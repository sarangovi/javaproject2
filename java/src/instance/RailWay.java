package instance;

public class RailWay {
public static void travel(Train ob)
{
ob.welcome();
ob.purpose();
if (ob instanceof GoodsTrain)
{
	GoodsTrain gt=(GoodsTrain)ob;
	gt.printCapacity();
}
else {
	PassengerTrain pt=(PassengerTrain)ob;
	pt.printTicketRate();
}

}
public static void main(String[] args) {
	GoodsTrain g=new GoodsTrain();
	travel(g);
	PassengerTrain p=new PassengerTrain();
	travel(p);
			
}
}