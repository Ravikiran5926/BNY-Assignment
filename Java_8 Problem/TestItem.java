package com.bny.java_StreamApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestItem {

	public static void main(String[] args) {
		
//	WAP to find the average price of item from the list of given items.
		
        List<Item> lItem=new LinkedList<>();
            lItem.add(new Item(1, "Iphone", LocalDateTime.of(LocalDate.of(2011, 01, 01),LocalTime.of(12, 30) ),
                    LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ), 120000.89f));
            lItem.add(new Item(1, "oppo", LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ),
                    LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ), 10000.89f));
            lItem.add(new Item(1, "Iphone", LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ),
                    LocalDateTime.of(LocalDate.of(2020, 01, 20),LocalTime.of(12, 30) ), 10000.89f));
            
            Double average=lItem.stream() .mapToDouble(a -> a.getPrice())
                    .average().orElse(0);
        System.out.println("Average Price Of Item : "+average);
        
//  WAP to print detail of item which is having highest and lowest price.
        
        double maxprice = lItem.stream().mapToDouble(p->p.getPrice()).max().orElse(0);
        System.out.println("Max Price Of Item : "+maxprice);
        
        double minprice = lItem.stream().mapToDouble(p->p.getPrice()).min().orElse(0);
        System.out.println("Min Price Of Item : "+minprice);
        
//  WAP to store item name and price from list to set.
        
        Set<String> set = lItem.stream().map(p->"Name OF Item"+p.getIname()+"Price OF Item"+p.getPrice()).collect(Collectors.toSet());
        System.out.println("Store Item Name : "+set);
        
        
        
//  WAP to remove duplicate prices from the list of the items.
        
         DoubleStream  removeDublicate= lItem.stream().mapToDouble(p->p.getPrice()).distinct();
        removeDublicate.forEach(s->System.out.println("Duplicate Price Of Item : "+s));
	}
}
