package javaeight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IdUtility {

	public static void main(String[] args) throws ParseException {
		
		List<Staff> staffList = Arrays.asList(
			    new Staff(1, "Alice", "HR"),
			    new Staff(2, "Bob", "Finance"),
			    new Staff(3, "Charlie", "Engineering"),
			    new Staff(4, "David", "HR"),
			    
			    new Staff(6, "Alice", "Finance"),
			    new Staff(5, "Eva", "Finance")
			);
		//  Filtering by id
		Staff result = staffList.stream()
			    .filter(s -> s.getId() == 3)
			    .findFirst()
			    .orElse(null);
		System.out.println("ID 3 : "+result);
		
		
		Set<String> res = staffList.stream().map(Staff::getName).collect(Collectors.toSet());
		System.out.println("staffList: "+ staffList);
		System.out.println("res: "+ res);

		// only after soring the list has lexigrophical order in getid. 
		// eventhough staff has comparable with default sorting
		
		//Collections.sort(staffList);
		
		System.out.println("res after sort : "+ staffList);
		/*	
		// Using Map<Integer, Staff> for fast lookup
		Map<Integer, Staff> staffMap = staffList.stream()
			    .collect(Collectors.toMap(Staff::getId, s -> s));
		System.out.println("Mapo: "+staffMap);
		
		
			// Access by id
        Staff staff = staffMap.get(2);
		System.out.println("Use Map to lookup : "+staff);
		
		
		// Check for duplicates
		Set<Integer> seen = new HashSet<>();
		boolean hasDuplicate = staffList.stream()
		    .map(Staff::getId)
		    .anyMatch(id -> !seen.add(id));

		System.out.println("Has duplicate IDs: " + hasDuplicate);
		
		// Grouping by even/odd ID
		Map<String, List<Staff>> grouped = staffList.stream()
			    .collect(Collectors.groupingBy(s -> s.getId() % 2 == 0 ? "Even ID" : "Odd ID"));

			System.out.println(grouped);


		// old way date
		Date date = new Date();
		System.out.println(date);

		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));

		// adding days
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 5);
		System.out.println("adding days:"+cal.getTime());

		// parsing
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date odate = sdf.parse("05-06-2025");
		System.out.println("parsing: "+odate);

		
		// new way of date
		
		LocalDate date2 = LocalDate.now();
		System.out.println("1: "+date2);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("2: "+dateTime);
		
		LocalDate today = LocalDate.now();
		LocalDate future = today.plusDays(5);
		System.out.println("new way of date: "+future);
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate edate = LocalDate.parse("05-06-2025", formatter);
		System.out.println(edate);

	
		
	}
	
	
	public static List<Staff> mergeStaffLists(List<Staff> oldList, List<Staff> newList) {

		
		// Create map from old list
	    Map<Integer, Staff> resultMap = new HashMap<>();
	    for (Staff s : oldList) {
	        resultMap.put(s.getId(), new Staff(s.getId(), s.getName(), s.getDepartment()));
	    }

	    // Merge new list
	    for (Staff s : newList) {
	        if (resultMap.containsKey(s.getId())) {
	            Staff existing = resultMap.get(s.getId());

	            // Fill missing name if new one is not null
	            if (s.getName() != null && !s.getName().isEmpty()) {
	                existing = new Staff(existing.getId(), s.getName(), existing.getDepartment());
	            }

	            // Fill missing department if new one is not null
	            if (s.getDepartment() != null && !s.getDepartment().isEmpty()) {
	                existing = new Staff(existing.getId(), existing.getName(), s.getDepartment());
	            }

	            resultMap.put(s.getId(), existing);
	        } else {
	            // new ID, add directly
	            resultMap.put(s.getId(), new Staff(s.getId(), s.getName(), s.getDepartment()));
	        }
	    }

	    return new ArrayList<>(resultMap.values());
*/
	}

}
