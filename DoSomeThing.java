public class DoSomeThing {
    public DoSomeThing() {
    }
	public static void main(String[] args) {
    	String a = "AB áAA";
    	
    	    public boolean checkUserName(String userName) {
        	for (int i = 0; i < userName.length(); i++) {
            int cmp = (int) userName.charAt(i);
            if (cmp >= 48 && cmp <= 57) {
                return true;
            }
            if (cmp >= 65 && cmp <= 90) {
                return true;
            }

            if (cmp >= 97 && cmp <= 122) {
                return true;
            }
            if (cmp == 32) {
                return true;
            }
        }
        return false;
    }
    System.out.println(checkUserName(a));
    }