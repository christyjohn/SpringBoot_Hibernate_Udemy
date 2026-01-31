package com.christyjohn.aopdemo;

import com.christyjohn.aopdemo.dao.AccountDAO;
import com.christyjohn.aopdemo.dao.MembershipDAO;
import com.christyjohn.aopdemo.data.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO,
											   MembershipDAO theMembershipDAO) {
		return runner -> {
			demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO,
			MembershipDAO theMembershipDAO) {

		// call the business method
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();

		// call the membership business method
		theMembershipDAO.addMember();
		theMembershipDAO.goToSleep();

		// call the business method
		//theAccountDAO.addAccount();

		// call the business method
		//Account myAccount = new Account();
		//theAccountDAO.addAccount(myAccount);

		// call the membership business method
		//theMembershipDAO.addAccount();
	}
}
