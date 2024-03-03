package com.streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) throws IOException
	{
		//by using empty() method
		
		/*
		 * Stream<String> stream=Stream.empty(); stream.forEach(System.out::println);
		 */
		
		//by using collections
		
		//Collection<String> collection=Arrays.asList("JAVA","J2EE","Spring","Hibernate");
		/*
		 * Stream<String> stream=collection.stream();
		 * stream.forEach(System.out::println);
		 */
		//collection.stream().forEach(System.out::println);
		
		/*
		 * List<Integer> list=Arrays.asList(9,2,6,1,4,2,6,0,5,7); Stream<Integer>
		 * list_stream=list.stream(); list_stream.forEach(System.out::print);
		 * 
		 * Set<Integer> set=new HashSet<>(list); Stream<Integer>
		 * set_stream=set.stream(); set_stream.forEach(System.out::println);
		 */
		
		// by using Arrays
		/*
		 * Stream<String> stream=Stream.of("java","j2ee","spring","hibernet");
		 * stream.forEach(System.out::println);
		 */
		/*
		 * String [] arr=new String[] {"a","b","c"}; Stream<String>
		 * stream=Arrays.stream(arr); //stream.forEach(System.out::println);
		 * 
		 * Stream<String> arr_stream=Arrays.stream(arr,0,3);
		 * arr_stream.forEach(System.out::println);
		 */
		
		//by using Stream.builder
		
		/*
		 * Stream<String>
		 * streamBuilder=Stream.<String>builder().add("A").add("B").add("C").build();
		 * streamBuilder.forEach(System.out::println);
		 */
		
		//by using Stream.generate()
		
		/*
		 * Stream<String> stream=Stream.generate(()->"Data").limit(5);
		 * stream.forEach(System.out::println);
		 */
		
		//by using Stream.iterate()
		
		/*
		 * Stream<Integer> stream_iter=Stream.iterate(1,n->n+1).limit(5);
		 * stream_iter.forEach(System.out::println);
		 */
		
		//by using Stream of File
		
		/*
		 * Path path=Paths.get("D:/PersonalJavafolder/Files/ABC.txt"); Stream<String>
		 * stream=Files.lines(path); Stream<String>
		 * stream_char=Files.lines(path,Charset.forName("UTF-8"));
		 * stream.forEach(System.out::println);
		 * stream_char.forEach(System.out::println); stream.close();
		 * stream_char.close();
		 */
		
		//by using Stream of Primitives
		
		/*
		 * IntStream intstream=IntStream.range(1,5);
		 * //intstream.forEach(System.out::println);
		 * 
		 * LongStream longstream=LongStream.rangeClosed(1, 10);
		 * //longstream.forEach(System.out::println);
		 * 
		 * Random ram=new Random(); DoubleStream ds=ram.doubles(3);
		 * ds.forEach(System.out::println);
		 */
		
	}
}
