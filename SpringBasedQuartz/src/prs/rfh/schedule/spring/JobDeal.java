package prs.rfh.schedule.spring;

import org.springframework.stereotype.Service;

@Service("dealCar")
public class JobDeal extends BaseJob{

	
	public void testJobDeal(){
		System.out.println("testJobDeal");
	}
	
	
	public void beforetestJobDeal(){
		System.out.println("before testJobDeal");
	}
	
}
