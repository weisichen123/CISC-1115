public class Month {
    // int field named monthNumber
    private int monthNumber;

    // A no-arg constructor that sets the monthNumber field to 1.
    public Month(){
        monthNumber = 1;
    }

    // A constructor that accepts the number of the month 
    public Month(int monthNumber) throws Exception{
        // throw custom exception if the number of month is invaild
        if(monthNumber < 1 || monthNumber > 12){
            // use this to access the member variable monthNumber
            this.monthNumber = 1;
            throw new Exception("Month number can't be " + monthNumber);
        }else{
            this.monthNumber = monthNumber;
        }
    }

    // A constructor that accepts the name of the month
    public Month(String monthName) throws Exception{
        // use swtich set the monthNumber field to the correct corresponding value.
        switch(monthName){
            case "January":
            // use this to access the member variable monthNumber
                this.monthNumber = 1;
                break;
            case "February":
                this.monthNumber = 2;
                break;
            case "March":
                this.monthNumber = 3;
                break;
            case "April":
                this.monthNumber = 4;
                break;
            case "May":
                this.monthNumber = 5;
                break;
            case "June":
                this.monthNumber = 6;
                break;
            case "July":
                this.monthNumber = 7;
                break;
            case "August":
                this.monthNumber = 8;
                break;
            case "September":
                this.monthNumber = 9;
                break;
            case "October":
                this.monthNumber = 10;
                break;
            case "November":
                this.monthNumber = 11;
                break;
            case "December":
                this.monthNumber = 12;
                break;
            default:
            // throw excetion if month name is invaild
            throw new Exception("Month name can't be " + monthName);
        }
    }

    // get month number method
    public int getMonthNumber() {
        // // use this to access the member variable monthNumber
		return this.monthNumber;
	}

    // set month number method
	public void setMonthNumber(int monthNumber) throws Exception {
        // throw custom exception if the number of month is invaild
        if(monthNumber < 1 || monthNumber > 12){
            this.monthNumber = 1;
            throw new Exception("Month number can't be " + monthNumber);
        }else{
            this.monthNumber = monthNumber;
        }
    }
    
    // get month name method
    public String getMonthName(){
        // use swtich return the monthname to the correct corresponding month number.
        switch(this.monthNumber){
            case 1:
                return "January ";
            case 2:
                return "February ";
            case 3:
                return "March ";
            case 4:
                return "April ";
            case 5:
                return "May ";
            case 6:
                return "June ";
            case 7:
                return "July ";
            case 8:
                return "August ";
            case 9:
                return "September ";
            case 10:
                return "October ";
            case 11:
                return "November ";
            case 12:
                return "December ";
            default:
             // throw excetion if month number is invaild
            return "Month number can't be " + monthNumber;
        }
    }

    // to string method
    public String toString(){
        // return the same value as getMonthName method
        return getMonthName();
    }

    // equals method
    public boolean equals(Month x){
        // compare if two month objects are equals
        if(x.getMonthNumber() == getMonthNumber()){
            return true;
        }else{
            return false;
        }
    }
}

