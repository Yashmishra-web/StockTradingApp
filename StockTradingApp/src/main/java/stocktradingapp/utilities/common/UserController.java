package StockTradingApp.utilities.common;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
	private static ApplicationContext context;
	private static Scanner sc;

	public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("config.xml");
    	UserDao userDao = context.getBean("userDao",UserDao.class);
		sc = new Scanner(System.in);
		boolean go=true;
		while(go)
		{
			System.out.println("########################################################");
			System.out.println("PRESS 1 FOR ADDING THE User DETAILS");
			System.out.println("PRESS 2 FOR GETTING DETAILS OF A SINGLE User");
			System.out.println("PRESS 3 FOR DISPLAY DETAILS OF ALL User");
			System.out.println("PRESS 4 FOR DELETING A User DETAILS");
			System.out.println("PRESS 5 FOR UPDATING THE User DETAILS ");
			System.out.println("PRESS 6 FOR EXIT");	
			System.out.println("########################################################");
			int input=sc.nextInt();
			switch (input) {
			case 1:
				//add
				System.out.println("########################################################");
				User std1=new User();
				System.out.println("ENTER USER_ID --> ");
				std1.setUserId(sc.nextInt());
				sc.nextLine();
				System.out.println("ENTER USER_NAME --> ");
				std1.setUserName(sc.nextLine());
				System.out.println("ENTER USER_CITY --> ");
				String city=sc.nextLine();
				std1.setUserCity(city);
				int r=userDao.insert(std1);
				System.out.println("Record inserted successfully : "+r);
				System.out.println("########################################################");
				break;
			case 2:
				//display
				System.out.println("########################################################");
				System.out.println("ENTER USER_ID OF STUDENT SO THAT YOU CAN FIND DEATAILS OF THAT STUDENT --> ");
				int id=sc.nextInt();
				User std2 = userDao.getUser(id);
				System.out.println(" USER_ID --> "+std2.getUserId());
				System.out.println(" USER_NAME --> "+std2.getUserName());
				System.out.println(" USER_CITY --> "+std2.getUserCity());
				System.out.println("########################################################");
				break;
			case 3:

				System.out.println("########################################################");
				List<User> std3=userDao.getAllUsers();
				for(User sts : std3)
				{
					System.out.println("########################################################");
					System.out.println(" USER_ID --> "+sts.getUserId());
					System.out.println(" USER_NAME --> "+sts.getUserName());
					System.out.println(" USER_CITY --> "+sts.getUserCity());
					System.out.println("########################################################");
				}
				break;
			case 4:
				//delete
				System.out.println("########################################################");
				System.out.println("ENTER USER_ID OF SO THAT WE CAN DELETE DETAILS");
				int id1=sc.nextInt();
				userDao.delete(id1);
				System.out.println("Record deleted successfully");
				System.out.println("########################################################");
				break;
			case 5:
				//update
				System.out.println("########################################################");
				System.out.println("ENTER USER_ID,USER_NAME & USER_CITY SO THAT YOU CAN FIND DEATAILS");
				User std4=new User();
				System.out.println("ENTER USER_ID YOU WANT TO UPDATE --> ");
				std4.setUserId(sc.nextInt());
				sc.nextLine();
				System.out.println("ENTER USER_NAME YOU WANT TO UPDATE --> ");
				std4.setUserName(sc.nextLine());
				System.out.println("ENTER USER_CITY YOU WANT TO UPDATE --> ");
				std4.setUserCity(sc.nextLine());
				userDao.update(std4);
				System.out.println("Record updated successfully");
				System.out.println("########################################################");
				break;
			case 6:
				//exit
				go=false;
				System.out.println("########################################################");
				break;
			default:
				System.out.println("########################################################");
				System.out.println("Invalid Input Try with another one");
				System.out.println("########################################################");
				break;
			}
		}
		System.out.println("########################################################");
		System.out.println("Thank you for using my application \n See you soon...");
		System.out.println("########################################################");
    }
}
