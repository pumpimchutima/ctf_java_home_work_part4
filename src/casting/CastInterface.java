package casting;

public class CastInterface {

	
	public static void main(String[] args) {

		
		Creator creator = new WebsiteCreator();
		WebsiteCreator websiteCreator = (WebsiteCreator) creator;
		System.out.println(websiteCreator);
		System.out.println(creator);
	}
}
