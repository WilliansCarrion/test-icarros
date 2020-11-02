package testeicarros;

	public class CreepyHours {
		public static void main (String[] args) {
			    
	        String[] creepy = { "AB:AB", "AA:BB", "AB:BA", "AA:AA"};
	        String[] hours = { "11:00", "13:13", "10:00"};

	        Integer cont = 0;

	        for (int i = 0; i < hours.length; i++) {
	            StringBuilder hh = new StringBuilder();
	            hh.append("");
	            for (int j = 0; j <= 4; j++) {
	                if (j == 0) {
	                    hh.append("A");
	                } 
	                else if(hours[i].charAt(2) == hours[i].charAt(j)){
	                    hh.append(":");
	                } 
	                else {
	                    hh.append(hours[i].charAt(j) == hours[i].charAt(0)? "A" : "B");
	                } 
	            }

	            for (String item: creepy) {
	               if(item.equals(hh.toString())){
	                    cont += 1;
	               }
	            }
	        }
	        System.out.println(cont);
	  }
}

