
public class TryWithResourcesDemo  implements AutoCloseable{
	
	@Override
	public void close() throws Exception{
		System.out.println("resources closed");
	}
	public static void main(String[] args) {
		TryWithResourcesDemo demo= new TryWithResourcesDemo();
		//try(demo){
			System.out.println("using demo resource");
		}
	}
	
