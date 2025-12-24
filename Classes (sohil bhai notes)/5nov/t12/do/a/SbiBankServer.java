public class SbiBankServer {
	SbiUser[] userListDB = {
		new SbiUser("s1001","1234",52000F),
		new SbiUser("s1002","4321",5000F),
		new SbiUser("s1003","5555",4000F),
		new SbiUser("s1004","4444",10000F),
		new SbiUser("s1005","3333",40000F),
		new SbiUser("s1006","2222",53333F,true),
	};
	
		public boolean withdraw(String givenAcNumber,String givenPinNo,float amount)
		throws AccountNotFoundException
					,AccountBlockedException
					,InvalidPinException
					,AmountInsufficientException
					,AccountLimiteException{
			
			//search account
			SbiUser foundUser = null;
			for(SbiUser user:userListDB){
				if(user.getAc().equalsIgnoreCase(givenAcNumber)){
					foundUser = user;
					break;
				}
			}//for
			if(foundUser == null){
				String errMsg = " Given Account No " + givenAcNumber + " Not Found " ;
				throw new AccountNotFoundException(errMsg);
			}//if
			
			//here come mean user Found
			//check is blocked or nor
			if(foundUser.isBlocked()==true){
				String errMsg="Given Account No "+ givenAcNumber + " is Blocked ";
				throw new AccountBlockedException(errMsg);
			}
			//check pin
			if(foundUser.getPin().equals(givenPinNo)==false){
				String errMsg = " Invalid Pin ";
				InvalidPinException e = new InvalidPinException(errMsg);
				throw e;
			}
			//else pin matched
			//check balence
			if(amount>foundUser.getAmount()){
				String errorDetails= " Insufficient balance ";
				throw new AmountInsufficientException(errorDetails);
			}
			if(amount>20000){
				String errorDetails = " Limit Exceed : only 20000/rs witdrow....";
				throw new AccountLimiteException(errorDetails);
			}
			
		float remainAmount = foundUser.getAmount()-amount;
		foundUser.setAmount(remainAmount);
			
		//if all check pass
		return true;
	}

}//end class	