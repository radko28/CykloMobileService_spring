package sk.cyklosoft.cykloservice.comparator;

import java.util.Comparator;

import sk.cyklosoft.cykloservice.vo.SportActivity;

public class HrmAvgDescComparator implements Comparator<SportActivity> {

	@Override
	public int compare(SportActivity o1, SportActivity o2) {
		int result = o1.getHrmAvg() > o2.getHrmAvg() ? -1 : o1.getHrmAvg() < o2.getHrmAvg() ? 1 : 0;  
		return result;
	}

}
